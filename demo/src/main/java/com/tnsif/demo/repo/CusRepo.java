package com.tnsif.demo.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.demo.Model.Customer;

//Marker interface
public interface CusRepo extends JpaRepository<Customer,Integer>{


}
