package com.csit321g2.tejano.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csit321g2.tejano.Entity.MaintenanceEntity;
import com.csit321g2.tejano.Repository.MaintenanceRepository;

 

@Service
public class MaintenanceService {

	@Autowired
	MaintenanceRepository mrepo;


	public MaintenanceEntity insertMaintenance(MaintenanceEntity maintenance) {
		return mrepo.save(maintenance);
	}

	public List<MaintenanceEntity> getAllMaintenance(){
		return mrepo.findAll();
	}	

    @SuppressWarnings("finally")
	public MaintenanceEntity updateMaintenance(int sid, MaintenanceEntity newMaintenanceDetails){
    	MaintenanceEntity maintenance = new MaintenanceEntity();
    		try {
    			maintenance = mrepo.findById(sid).get();
    			maintenance.setBldgname(newMaintenanceDetails.getBldgname());
    			maintenance.setDetails(newMaintenanceDetails.getDetails());
    			maintenance.setFileData(newMaintenanceDetails.getFileData());
    		}catch(NoSuchElementException ex) {
    			throw new NoSuchElementException("Maintenance "+sid+ " does not exist");
    		}finally {
    			return mrepo.save(maintenance);
    		}
    		
    }

    public String deleteMaintenance(int sid) {
    	String msg = "";

    	if(mrepo.findById(sid).get()!=null) {
    		mrepo.deleteById(sid);
    		msg = "Maintenance " + sid + " is successfully deleted!";
    	}else {msg = "Maintenance " + sid + " does not exist!";}

    	return msg;
    }
}


