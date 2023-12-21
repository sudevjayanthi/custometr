package com.oasys.bank.customer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oasys.bank.customer.Service.CustomerService;
import com.oasys.bank.customer.entity.Customer;

@RestController
@RequestMapping(value="/customer")
public class CustomerController {
	@Autowired
	CustomerService customerser;
	@PostMapping(value="/addCustomer")
	public Customer insertCustomer(@RequestBody Customer c) {
		
		return customerser.insertCustomer(c);
	}
	
	
}
