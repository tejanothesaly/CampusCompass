package com.csit321g2.tejano.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbleventcampus")
public class EventEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int sid;
	
	private String Eventname;
	
	private String Datetime;
	
	private String Location;
	
	private String Description;
	
	private String Organizer;
	
	private String Participants;
	
	private String Info;

	public EventEntity() {
		super();
	}
	public EventEntity(int sid, String eventname, String datetime, String location, 
			String description, String organizer, String participants, String info) {
		super();
		
		this.sid=sid;
		this.Eventname = eventname;
		this.Datetime = datetime;
		this.Location = location;
		this.Description = description;
		this.Organizer = organizer;
		this.Participants = participants;
		this.Info = info;
		
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}
	
	public String getEventname() {
		return Eventname;
	}

	public void setEventname(String eventname) {
		this.Eventname = eventname;
	}

	public String Datetime() {
		return Datetime;
	}

	public void setDatetime(String datetime) {
		this.Datetime = datetime;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		this.Location = location;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		this.Description = description;
	}

	public String getOrganizer() {
		return Organizer;
	}

	public void setOrganizer(String organizer) {
		this.Organizer = organizer;
	}
	
	public String getParticipants() {
		return Participants;
	}

	public void setParticipants(String participants) {
		this.Participants = participants;
	}
	
	public String getInfo() {
		return Info;
	}

	public void setInfo(String info) {
		this.Info = info;
	}
}
