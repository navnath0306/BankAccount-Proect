package com.navnath.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.navnath.service.BankAccountServices;

@RestController
public class BankAccountController {
	
	@Autowired
	BankAccountServices bankAccountServices;
	
	
	 @GetMapping(value = "/testConnectivity")
	public void testConnectivity() {
		bankAccountServices.testConnectivity();
	}
	

}
