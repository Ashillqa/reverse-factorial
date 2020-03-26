package com.qa.main;

public class StringManipulation {
	
	public void meth1(String s1) { //The method takes in String 
		
		String [] word_count = s1.split("\\s+"); //dont want spaces
		
		System.out.println(word_count.length); // number of WORDS
	}
	
	public void meth2(String input) {
		
		String[] word_Vertical = input.split("\\s+");
		
		for (int i = 0;i <= word_Vertical.length-1; i++) {
			
			System.out.println(word_Vertical[i]);
		}
			
	}
	
	public void meth3(String input) {
		
		String[] reverse_Vert = input.split("\\s+");
		
		for (int i = reverse_Vert.length-1;i>=0; i--) {
			
			System.out.println(reverse_Vert[i]);	
	}
	
	}
}