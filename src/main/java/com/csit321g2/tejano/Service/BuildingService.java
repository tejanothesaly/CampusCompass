package com.csit321g2.tejano.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csit321g2.tejano.Entity.BuildingEntity;
import com.csit321g2.tejano.Repository.BuildingRepository;

 
@Service
public class BuildingService {

	@Autowired
	BuildingRepository brepo;


	public BuildingEntity insertBuilding(BuildingEntity building) {
		return brepo.save(building);
	}

	public List<BuildingEntity> getAllBuilding(){
		return brepo.findAll();
	}	

    @SuppressWarnings("finally")
	public BuildingEntity updateBuilding(int sid, BuildingEntity newBuildingDetails){
    	BuildingEntity building= new BuildingEntity();
    		try {
    			building = brepo.findById(sid).get();
    			building.setName(newBuildingDetails.getName());
    			building.setInfo(newBuildingDetails.getInfo());
   
    		}catch(NoSuchElementException ex) {
    			throw new NoSuchElementException("Building "+sid+ " does not exist");
    		}finally {
    			return brepo.save(building);
    		}
    }

    public String deleteBuilding(int sid) {
    	String msg = "";

    	if(brepo.findById(sid).get()!=null) {
    		brepo.deleteById(sid);
    		msg = " Building " + sid + " is successfully deleted!";
    	}else {msg = "Building " + sid + " does not exist!";}

    	return msg;
    }
}
