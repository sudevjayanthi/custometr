package com.oasys.bank.customer.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oasys.bank.customer.Dao.CustomerDao;
import com.oasys.bank.customer.entity.Customer;
@Service
public class CustomerService {
@Autowired
CustomerDao customerdao;
	public Customer insertCustomer(Customer c) {
		return customerdao.insertCustomer(c);
	}

}
