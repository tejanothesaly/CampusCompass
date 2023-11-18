package com.csit321g2.tejano.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.csit321g2.tejano.Entity.MaintenanceEntity;
import com.csit321g2.tejano.Service.MaintenanceService;

@RestController
@RequestMapping("/maintenance")

public class MaintenanceController {


	@Autowired
	MaintenanceService mserv;

    @PostMapping("/insertMaintenance")
    public MaintenanceEntity insertMaintenance(@RequestBody MaintenanceEntity maintenance) {
      return mserv.insertMaintenance(maintenance);
    }

    @GetMapping("/getAllMaintenance")
    public List<MaintenanceEntity> getAllMaintenance(){
    	return mserv.getAllMaintenance();
    }

    @PutMapping("/update")
    public MaintenanceEntity updateMaintenance(@RequestParam int sid, @RequestBody MaintenanceEntity newMaintenanceDetails){
    	return mserv.updateMaintenance(sid, newMaintenanceDetails);
    }
    @DeleteMapping("/delete/{sid}")
    public String deleteMaintenance(@PathVariable int sid) {
    	return mserv.deleteMaintenance(sid);
    }
}