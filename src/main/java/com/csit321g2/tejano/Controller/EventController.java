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

import com.csit321g2.tejano.Entity.EventEntity;
import com.csit321g2.tejano.Service.EventService;


@RestController
@RequestMapping("/event")
public class EventController {

	@Autowired
	EventService eserv;

    @PostMapping("/insertEvent")
    public EventEntity insertEvent(@RequestBody EventEntity event) {
      return eserv.insertEvent(event);
    }

    @GetMapping("/getAllEvent")
    public List<EventEntity> getAllEvent(){
    	return eserv.getAllEvent();
    }

    @PutMapping("/update")
    public EventEntity updateEvent(@RequestParam int sid, @RequestBody EventEntity newEventDetails){
    	return eserv.updateEvent(sid, newEventDetails);
    }
    
    @DeleteMapping("/delete/{sid}")
    public String deleteEvent(@PathVariable int sid) {
    	return eserv.deleteEvent(sid);
    }
}
