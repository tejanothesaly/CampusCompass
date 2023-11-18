package com.csit321g2.tejano.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csit321g2.tejano.Entity.EventEntity;
import com.csit321g2.tejano.Repository.EventRepository;

@Service
public class EventService {
	
	@Autowired
	EventRepository erepo;


	public EventEntity insertEvent(EventEntity event) {
		return erepo.save(event);
	}

	public List<EventEntity> getAllEvent(){
		return erepo.findAll();
	}	

    @SuppressWarnings("finally")
	public EventEntity updateEvent(int sid, EventEntity newEventDetails){
    	EventEntity event= new EventEntity();
    		try {
    			event = erepo.findById(sid).get();
    			event.setEventname(newEventDetails.getEventname());
    			event.setDatetime(newEventDetails.Datetime());
    			event.setLocation(newEventDetails.getLocation());
    			event.setDescription(newEventDetails.getDescription());
    			event.setOrganizer(newEventDetails.getOrganizer());
    			event.setParticipants(newEventDetails.getParticipants());
    			event.setInfo(newEventDetails.getInfo());
    			
    		}catch(NoSuchElementException ex) {
    			throw new NoSuchElementException("event "+sid+ " does not exist");
    		}finally {
    			return erepo.save(event);
    		}
    }

    public String deleteEvent(int sid) {
    	String msg = "";

    	if(erepo.findById(sid).get()!=null) {
    		erepo.deleteById(sid);
    		msg = "Event " + sid + " is successfully deleted!";
    	}else {msg = "Event " + sid + " does not exist!";}

    	return msg;
    }
}
