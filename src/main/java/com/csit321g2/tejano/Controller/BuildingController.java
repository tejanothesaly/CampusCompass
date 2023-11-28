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

import com.csit321g2.tejano.Entity.BuildingEntity;
import com.csit321g2.tejano.Service.BuildingService;

@RestController
@RequestMapping("/building")

public class BuildingController {

	@Autowired
	BuildingService bserv;

    @PostMapping("/insertBuilding")
    public BuildingEntity insertBuilding(@RequestBody BuildingEntity building) {
      return bserv.insertBuilding(building);
    }

    @GetMapping("/getAllBuilding")
    public List<BuildingEntity> getAllBuilding(){
    	return bserv.getAllBuilding();
    }

    @PutMapping("/update")
    public BuildingEntity updateBuilding(@RequestParam int sid, @RequestBody BuildingEntity newBuildingDetails){
    	return bserv.updateBuilding(sid, newBuildingDetails);
    }
    
    @DeleteMapping("/delete/{sid}")
    public String deleteBuilding(@PathVariable int sid) {
    	return bserv.deleteBuilding(sid);
    }
}
