package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestBeforeAfter {
	Calculator c = new Calculator();
	int sum=0;
	
	
	@BeforeAll
	public static void testStartDbConn() {
		System.out.println("DB Connection is up - only once");
		
	}
	
	@Test
	public void testStartup() {
		int sum=0;
		System.out.println("sum is zero"+sum);
		
	}
	
	
	@Test
	public void testAddTwoNos()
	{
		System.out.println("test case 1");
		int result = c.addNos(100, 200);
		Assertions.assertEquals(300, result);
		
	}
	
	@Test //message is optional and displayed if test case fails
	public void testSubTwoNos()
	{
		System.out.println("test case 2");
		int result = c.subNos(300, 200);
		Assertions.assertEquals(100, result, "check the subtraction method code");
		
	}	
	
	@AfterEach
	public void testShutDown() {
		System.out.println("some object is null");
		
	}
	
	@AfterAll
	public static void testShutDownConn() {
		System.out.println("shutting down db connection");
		
		
	}
	

}
