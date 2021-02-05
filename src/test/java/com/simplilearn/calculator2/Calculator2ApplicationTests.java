package com.simplilearn.calculator2;

import org.junit.jupiter.api.Test;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Calculator2ApplicationTests {

	@Test
	void contextLoads() {
	}
	
	private TicketGeneratorApplication ticketer = new TicketGeneratorApplication();
	@Test
	public void testRandomNumber() {
   		assertTrue(ticketer.getRandomTicketNumber()>1000&&ticketer.getRandomTicketNumber()<9999);
	}

}
