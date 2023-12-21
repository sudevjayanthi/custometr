package com.oasys.bank.customer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.oasys.bank.customer.entity.Customer;

public interface Customerrepo extends JpaRepository<Customer, Integer> {
	@Query(value="select ifsc from bank_details where branch Like ?",nativeQuery=true)

	Customer insertCustomer(Customer c);

}
