package com.springboot.bankapp.repository;

import com.springboot.bankapp.model.Customer;

public interface CustomerRepository {

	Customer getById(Long id);



	Customer save(Customer customer);

}
