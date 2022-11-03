package com.dojo.account.model;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AuhResponseTest {

	@Test
	void test_getter() {
		AuthResponse auth = new AuthResponse("test",true);
		auth.getUsername();
		auth.isValid();
	}
	
	@Test
	void test_seter() {
		AuthResponse auth = new AuthResponse();
		auth.setUsername("test");
		auth.setValid(false);
	}
}
