package com.cicd.pipline.TutospringBoot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TutoSpringBootApplicationTests {

	@Test
	void contextLoads() {
	}
	
	// Test class added ONLY to cover main() invocation not covered by application tests.
	@Test
	void applicationContextTest() {
		 TutoSpringBootApplication.main(new String[] {});
	}

}
