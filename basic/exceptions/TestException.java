package com.cg.basic.exceptions;

public class TestException {

	public static void main(String[] args) {
	
		try {
			int n = 4/0;
		}
		catch( Exception e1){
			{ System.out.println(" Denomiator cannot be zero"+ e1.getMessage());}	

		}
	
	}
}
