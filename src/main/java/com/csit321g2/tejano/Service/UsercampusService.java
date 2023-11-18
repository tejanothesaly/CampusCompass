package com.csit321g2.tejano.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csit321g2.tejano.Entity.UsercampusEntity;
import com.csit321g2.tejano.Repository.UsercampusRepository;

 
@Service
public class UsercampusService {

@Autowired
	UsercampusRepository urepo;


	public UsercampusEntity insertUsercampus(UsercampusEntity usercampus) {
		return urepo.save(usercampus);
	}

	public List<UsercampusEntity> getAllUsercampus(){
		return urepo.findAll();
	}	

	@SuppressWarnings("finally")
	public UsercampusEntity updateUsercampus(int sid, UsercampusEntity newUsercampusDetails){
    	UsercampusEntity usercampus= new UsercampusEntity();
    		try {
    			usercampus = urepo.findById(sid).get();
    			usercampus.setFname(newUsercampusDetails.getFname());
    			usercampus.setLname(newUsercampusDetails.getLname());
    			usercampus.setEmail(newUsercampusDetails.getEmail());
    			usercampus.setUsername(newUsercampusDetails.getUsername());
    			usercampus.setPassword(newUsercampusDetails.getPassword());
   
    		}catch(NoSuchElementException ex) {
    			throw new NoSuchElementException("Usercampus "+sid+ " does not exist");
    		}finally {
    			return urepo.save(usercampus);
    		}
    }

    public String deleteUsercampus(int sid) {
    	String msg = "";

    	if(urepo.findById(sid).get()!=null) {
    		urepo.deleteById(sid);
    		msg = "Usercampus " + sid + " is successfully deleted!";
    	}else {msg = "Usercampus " + sid + " does not exist!";}

    	return msg;
    }
}
