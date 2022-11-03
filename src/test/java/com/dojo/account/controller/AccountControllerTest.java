package com.dojo.account.controller;

import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Locale;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.dojo.account.client.LoginClient;
import com.dojo.account.exception.InvalidUserException;
import com.dojo.account.model.AuthResponse;
import com.dojo.account.model.CustomerDetails;



@SpringBootTest
public class AccountControllerTest {

	@Mock
	LoginClient login;
	
	@InjectMocks
	AccountController accountController;
	
	@Test
	void test_updateAccount() throws InvalidUserException {
		AuthResponse auth = new AuthResponse("test",true);
		CustomerDetails details = new CustomerDetails("test","testpass","testname","testaddress","teststate","testcountry","test@gmail.com","qwerty123r",1234567L,LocalDate.of(2020, 1, 8),"testaccount");
		ResponseEntity<AuthResponse> response=
				new ResponseEntity<AuthResponse>(auth,HttpStatus.OK);
		when(login.verifyToken(Mockito.anyString())).thenReturn(response);
		when(login.updateDetails(details)).thenReturn("test");
		accountController.updateAccount("testtestesttest", details);
		
		AuthResponse auth1 = new AuthResponse("test",false);
		CustomerDetails details1 = new CustomerDetails("test","testpass","testname","testaddress","teststate","testcountry","test@gmail.com","qwerty123r",1234567L,LocalDate.of(2020, 1, 8),"account");
		ResponseEntity<AuthResponse> response1=
				new ResponseEntity<AuthResponse>(auth1,HttpStatus.OK);
		when(login.verifyToken(Mockito.anyString())).thenReturn(response1);
		accountController.updateAccount("testtestesttestest", details1);
	}
	
}
