package com.dojo.account.exception;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserNotFoundExceptionTest {

	@Test
	void test_UserNotFoundException() {
		UserNotFoundException userNotFoundExceptionTest = new UserNotFoundException("Testing");
	}
}
