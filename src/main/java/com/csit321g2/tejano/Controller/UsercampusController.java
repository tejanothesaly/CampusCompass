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

import com.csit321g2.tejano.Entity.UsercampusEntity;
import com.csit321g2.tejano.Service.UsercampusService;


@RestController
@RequestMapping("/usercampus")
public class UsercampusController {

	@Autowired
	UsercampusService userv;

    @PostMapping("/insertUsercampus")
    public UsercampusEntity insertUsercampus(@RequestBody UsercampusEntity usercampus) {
      return userv.insertUsercampus(usercampus);
    }

    @GetMapping("/getAllUsercampus")
    public List<UsercampusEntity> getAllUsercampus(){
    	return userv.getAllUsercampus();
    }

    @PutMapping("/update")
    public UsercampusEntity updateUsercampus(@RequestParam int sid, @RequestBody UsercampusEntity newUsercampusDetails){
    	return userv.updateUsercampus(sid, newUsercampusDetails);
    }
    
    @DeleteMapping("/delete/{sid}")
    public String deleteUsercampus(@PathVariable int sid) {
    	return userv.deleteUsercampus(sid);
    }
}