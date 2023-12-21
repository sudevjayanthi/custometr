package com.oasys.bank.customer.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.oasys.bank.customer.Repository.Customerrepo;
import com.oasys.bank.customer.entity.Customer;

@Repository
public class CustomerDao {
	@Autowired
	Customerrepo cusrepo;
	@Autowired
	RestTemplate rest;

	public Customer insertCustomer(Customer c) {
		String url="http://localhost:8080/bank/getifsc/";
		ResponseEntity<String>val=rest.exchange(url+c.getBranch(),HttpMethod.GET,null,String.class);
				String ifsc=val.getBody();
		c.setIfsc(ifsc);
		cusrepo.save(c);
		return c;
	}

}
