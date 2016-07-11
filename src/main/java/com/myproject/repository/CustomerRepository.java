package com.myproject.repository;

import com.myproject.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by nishina on 2016/07/11.
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
