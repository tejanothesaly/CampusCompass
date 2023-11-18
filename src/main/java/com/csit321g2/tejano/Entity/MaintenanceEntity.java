package com.csit321g2.tejano.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblmaintenance")
public class MaintenanceEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int sid;
	
	private String bldgname;
	
	private String details;
	
	private byte[] fileData;

	public MaintenanceEntity() {
		super();
	}

	public MaintenanceEntity(int sid, String bldgname, String details, byte[] fileData) {
        super();
		this.sid = sid;
        this.bldgname = bldgname;
        this.details = details;
        this.fileData = fileData;
    
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getBldgname() {
        return bldgname;
    }

    public void setBldgname(String bldgname) {
        this.bldgname = bldgname;
    }
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public byte[] getFileData() {
        return fileData;
    }

    public void setFileData(byte[] fileData) {
        this.fileData = fileData;
    }
	
}
