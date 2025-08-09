package com.tnsif.springbootsample.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.springbootsample.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}