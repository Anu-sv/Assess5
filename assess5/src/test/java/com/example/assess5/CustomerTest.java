package com.example.assess5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.assess5.controller.CustomerService;
import com.example.assess5.model.Customers;
import com.example.assess5.repository.CusomerRepository;

public class CustomerTest {
	@Autowired
	private CustomerService customerrepo;
	
	@Test
    void createtest() {
		Customers c1=new Customers("aaa",'M',39,"veg");
		Customers c2=customerrepo.createCustomer(c1);
		assertEquals("pass create",c1.getId(),c2.getId());
	}
		
	@Test
    void recordtest() {
		
		Customers c1=new Customers("aaa",'M',39,"veg");
		Customers c2=new Customers("bbb",'f',49,"non-veg");
		Customers c3=new Customers("ccc",'M',89,"veg");
		ArrayList a=new ArrayList();
		a.add(c1);
		a.add(c2);
		a.add(c3);
		
		ArrayList f=customerrepo.getAllCustomer();
        assertEquals("pass getall",a.size(),f.size());
    }
	
	
	

}
