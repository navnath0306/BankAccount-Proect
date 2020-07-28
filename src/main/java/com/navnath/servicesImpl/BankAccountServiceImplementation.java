package com.navnath.servicesImpl;

import org.springframework.stereotype.Service;

import com.navnath.service.BankAccountServices;

@Service
public class BankAccountServiceImplementation implements BankAccountServices{

	@Override
	public String testConnectivity() {
		return "Success";
		
	}

}
