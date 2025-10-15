package com.tnsif.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.demo.Model.Customer;
import com.tnsif.demo.services.CusService;
@RestController
public class CusController {

	@Autowired
	CusService cs;
	
	@PostMapping("/addcst")
	public Customer addCustomer(@RequestBody Customer cst)
	{
		return cs.addcst(cst);
	}
	@GetMapping("/retrivaldata")
	public List<Customer> getCustomer()
	{
		return cs.getcst();
	}
	@DeleteMapping("/deletingrecord/{cid}")
	public void deletecst(@PathVariable int cid)
	{
		cs.delcst(cid);
	}
@PutMapping("/updatecst/{cid}")
public Customer updateCustomer(@RequestBody Customer cst, @PathVariable int cid) {
    cst.setCid(cid);
    return cs.updateCst( cid,cst);
}
}