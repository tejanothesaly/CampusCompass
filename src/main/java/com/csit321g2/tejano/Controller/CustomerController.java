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

import com.csit321g2.tejano.Entity.CustomerEntity;
import com.csit321g2.tejano.Service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService sserv;

    @PostMapping("/insertCustomer")
    public CustomerEntity insertCustomer(@RequestBody CustomerEntity customer) {
      return sserv.insertCustomer(customer);
    }

    @GetMapping("/getAllCustomer")
    public List<CustomerEntity> getAllCustomers(){
    	return sserv.getAllCustomers();
    }

    @PutMapping("/update")
    public CustomerEntity updateCustomer(@RequestParam int sid, @RequestBody CustomerEntity newCustomerDetails){
    	return sserv.updateCustomer(sid, newCustomerDetails);
    }
    
    @DeleteMapping("/delete/{sid}")
    public String deleteCustomer(@PathVariable int sid) {
    	return sserv.deleteCustomer(sid);
    }
}
