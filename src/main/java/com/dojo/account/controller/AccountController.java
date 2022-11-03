package com.dojo.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.dojo.account.client.LoginClient;
import com.dojo.account.exception.InvalidUserException;
import com.dojo.account.model.AuthResponse;
import com.dojo.account.model.CustomerDetails;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class AccountController {

	@Autowired
	private LoginClient loginClient;
	
	
	@PostMapping("/update")
	public ResponseEntity<String> updateAccount(@RequestHeader("Authorization") String token,@RequestBody CustomerDetails customer) throws InvalidUserException{
		AuthResponse auth = loginClient.verifyToken(token).getBody();
		
		if (!auth.isValid())
			throw new InvalidUserException("User is invalid");
		else {
			log.info("Verified token in update controller");
			String result = loginClient.updateDetails(customer);
		}
		return new ResponseEntity<String>("Updated Successfully", HttpStatus.OK);
		
	}
}
