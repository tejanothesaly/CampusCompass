package com.csit321g2.tejano.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csit321g2.tejano.Entity.CustomerEntity;
import com.csit321g2.tejano.Repository.CustomerRepository;

 
@Service
public class CustomerService {

	@Autowired
	CustomerRepository srepo;


	public CustomerEntity insertCustomer(CustomerEntity customer) {
		return srepo.save(customer);
	}

	public List<CustomerEntity> getAllCustomers(){
		return srepo.findAll();
	}	

    @SuppressWarnings("finally")
	public CustomerEntity updateCustomer(int sid, CustomerEntity newCustomerDetails){
    	CustomerEntity customer= new CustomerEntity();
    		try {
    			customer = srepo.findById(sid).get();
    			customer.setFname(newCustomerDetails.getFname());
    			customer.setLname(newCustomerDetails.getLname());
    			customer.setEmail(newCustomerDetails.getEmail());
    			customer.setPhoneNumber(newCustomerDetails.getPhoneNumber());
   
    		}catch(NoSuchElementException ex) {
    			throw new NoSuchElementException("Customer "+sid+ " does not exist");
    		}finally {
    			return srepo.save(customer);
    		}
    }

    public String deleteCustomer(int sid) {
    	String msg = "";

    	if(srepo.findById(sid).get()!=null) {
    		srepo.deleteById(sid);
    		msg = "Customer " + sid + " is successfully deleted!";
    	}else {msg = "Customer " + sid + " does not exist!";}

    	return msg;
    }
}