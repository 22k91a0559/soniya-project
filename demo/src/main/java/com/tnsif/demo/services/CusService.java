package com.tnsif.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.demo.Model.Customer;
import com.tnsif.demo.repo.CusRepo;
@Service
public class CusService {
	
	@Autowired
	CusRepo er;
	
	//insert
	public Customer addcst(Customer cst)
	{
		return er.save(cst);
	}
	//select
	public List<Customer> getcst()
	{
		return er.findAll();
	}
	//delete
	public void delcst(int cid)
	{
		er.deleteById(cid);
	}
	//update
public Customer updateCst(int cid, Customer cst) {
    Customer existingCustomer = er.findById(cid).orElse(null);
    if (existingCustomer != null) {
        existingCustomer.setcname(cst.getcname());
        existingCustomer.setemail(cst.getemail());
        return er.save(existingCustomer);
    } else {
        return null;
    }
}
}

    