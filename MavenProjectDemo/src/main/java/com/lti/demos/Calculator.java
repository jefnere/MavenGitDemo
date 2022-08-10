package com.lti.demos;

public class Calculator {
	public String sayHello() {
		return "Hello LTI";
		
	}
	public int addNos(int x, int y) {
		int result=x+y;
		return result;
	}
	public int subNos(int x, int y) {
		int results = x-y;
		return results;
	}
	public void searchEmp(int empId)
	{
		if (empId==0)
		{
			throw new ArithmeticException("you entered zero");
			
		}
		else {
			System.out.println("do something");
		}
	}

}
