package com.csit321g2.tejano.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbllocation")
public class LocationEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int sid;
	
	private String locname;
	
	private String category;
	
	private String flrlevel;
	
	private String accessinfo;
	
	private String faci;

	public LocationEntity() {
		super();
	}

	public LocationEntity(int sid, String locname, String category, String flrlevel, String accessinfo, String faci) {
        super();
		this.sid = sid;
        this.locname = locname;
        this.category = category;
        this.flrlevel = flrlevel;
        this.accessinfo = accessinfo;
        this.faci = faci;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getLocname() {
        return locname;
    }

    public void setLocname(String locname) {
        this.locname = locname;
    }
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFlrlevel() {
        return flrlevel;
    }

    public void setFlrlevel(String flrlevel) {
        this.flrlevel = flrlevel;
    }
    
    public String getAccessinfo() {
        return accessinfo;
    }

    public void setAccessinfo(String accessinfo) {
        this.accessinfo = accessinfo;
    }
    
    public String getFaci() {
        return faci;
    }

    public void setFaci(String faci) {
        this.faci = faci;
    }
	
}

