package com.dojo.account.exception;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class InvalidUserExceptionTest {
	
	@Test
	public void test_invalidUserException() {
		InvalidUserException invalidUserException = new InvalidUserException("test exception");
	}
}
