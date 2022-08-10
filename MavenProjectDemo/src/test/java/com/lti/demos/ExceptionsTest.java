package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExceptionsTest {

	@Test
	void testExceptions() {
		Assertions.assertThrows(IllegalArgumentException.class,
				() ->{ Integer.parseInt("one");}
	    );
	}
	
	@Test
	public void testmethodExp()
	{
		Calculator c = new Calculator();
		final Exception e = assertThrows(ArithmeticException.class, 
				                        ()->{c.searchEmp(0);}
		);
		Assertions.assertEquals("you entered zero",  e.getMessage());
	}

}
