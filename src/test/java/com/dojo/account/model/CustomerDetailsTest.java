package com.dojo.account.model;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CustomerDetailsTest {

	
	@Test
	void test_getter() {
		CustomerDetails details = new CustomerDetails("test","testpass","testname","testaddress","teststate","testcountry","test@gmail.com","qwerty123r",1234567L,LocalDate.of(2020, 1, 8),"testaccount");
		details.getUsername();
		details.getPassword();
		details.getName();
		details.getAddress();
		details.getState();
		details.getContactNumber();
		details.getCountry();
		details.getEmail();
		details.getPAN();
		details.getDOB();
		details.getAccountType();
	}
	
	@Test
	void test_seter() {
		CustomerDetails details = new CustomerDetails();
		details.setUsername("test");
		details.setPassword("test");
		details.setName("test");
		details.setAddress("test");
		details.setState("test");
		details.setCountry("test");
		details.setEmail("test@test.com");
		details.setPAN("JWGPK0039B");
		details.setContactNumber(9234566L);
		details.setDOB(LocalDate.of(1999, 10, 28));
		details.setAccountType("testaccount");
	}
}
