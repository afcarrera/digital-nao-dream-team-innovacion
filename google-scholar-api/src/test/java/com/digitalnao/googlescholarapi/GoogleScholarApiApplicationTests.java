package com.digitalnao.googlescholarapi;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GoogleScholarApiApplicationTests {

	@Test
	void contextLoads() {		
		String nullExample = null;
		//Check that an object is null
		assertNull(nullExample);
	}

}
