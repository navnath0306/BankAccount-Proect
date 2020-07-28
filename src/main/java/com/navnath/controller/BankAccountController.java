package com.navnath.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.navnath.service.BankAccountServices;

@RestController
public class BankAccountController {
	
	@Autowired
	private  BankAccountServices bankAccountServices;
	
	
	 @GetMapping(value = "/testConnectivity")
	public ResponseEntity<String> testConnectivity() {
		return ResponseEntity.ok("{Status }" + bankAccountServices.testConnectivity() );
			
	}
	

}
