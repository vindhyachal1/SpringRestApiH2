package com.restapi.us.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi.us.entity.Customer;

@Repository
public interface ICustomerRepo extends JpaRepository<Customer, Long> {

}
