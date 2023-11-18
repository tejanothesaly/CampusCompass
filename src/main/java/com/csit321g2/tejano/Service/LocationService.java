package com.csit321g2.tejano.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csit321g2.tejano.Entity.LocationEntity;
import com.csit321g2.tejano.Repository.LocationRepository;


@Service
public class LocationService {
	
	@Autowired
	LocationRepository lrepo;


	public LocationEntity insertLocation(LocationEntity location) {
		return lrepo.save(location);
	}

	public List<LocationEntity> getAllLocation(){
		return lrepo.findAll();
	}	

    @SuppressWarnings("finally")
	public LocationEntity updateLocation(int sid, LocationEntity newLocationDetails){
    	LocationEntity location= new LocationEntity();
    		try {
    			location = lrepo.findById(sid).get();
    			location.setLocname(newLocationDetails.getLocname());
    			location.setCategory(newLocationDetails.getCategory());
    			location.setFlrlevel(newLocationDetails.getFlrlevel());
    			location.setAccessinfo(newLocationDetails.getAccessinfo());
    			location.setFaci(newLocationDetails.getFaci());
    			
    		}catch(NoSuchElementException ex) {
    			throw new NoSuchElementException("Location "+sid+ " does not exist");
    		}finally {
    			return lrepo.save(location);
    		}
    }

    public String deleteLocation(int sid) {
    	String msg = "";

    	if(lrepo.findById(sid).get()!=null) {
    		lrepo.deleteById(sid);
    		msg = "Location " + sid + " is successfully deleted!";
    	}else {msg = "Location " + sid + " does not exist!";}

    	return msg;
    }
}
