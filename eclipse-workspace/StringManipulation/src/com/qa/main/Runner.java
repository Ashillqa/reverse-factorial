package com.qa.main;

public class Runner {
	
	public static void main(String[] args) {
		
		//Testing Method 1
		
		StringManipulation test = new StringManipulation();
		test.meth1("Hello my friend");
		System.out.println();
		
		// returned 3 as expected
		
		// testing method 2
		
		test.meth2("Hello my friend");
		
		System.out.println();
		
		test.meth3("Hello my friend");
		// printed word vertically as expected
		
		
}
	
	
	
	
}