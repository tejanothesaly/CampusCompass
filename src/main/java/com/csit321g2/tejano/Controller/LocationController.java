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

import com.csit321g2.tejano.Entity.LocationEntity;
import com.csit321g2.tejano.Service.LocationService;

@RestController
@RequestMapping("/location")
public class LocationController {


	@Autowired
	LocationService lserv;

    @PostMapping("/insertLocation")
    public LocationEntity insertLocation(@RequestBody LocationEntity location) {
      return lserv.insertLocation(location);
    }

    @GetMapping("/getAllLocation")
    public List<LocationEntity> getAllLocation(){
    	return lserv.getAllLocation();
    }

    @PutMapping("/update")
    public LocationEntity updateLocation(@RequestParam int sid, @RequestBody LocationEntity newLocationDetails){
    	return lserv.updateLocation(sid, newLocationDetails);
    }
    
    @DeleteMapping("/delete/{sid}")
    public String deleteLocation(@PathVariable int sid) {
    	return lserv.deleteLocation(sid);
    }
}
