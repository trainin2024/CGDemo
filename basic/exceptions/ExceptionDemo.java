package com.cg.basic.exceptions;


public class ExceptionDemo {

	public static void main(String[] args) {

		try {
			int a = 3;
			//System.exit(1);
			int b = 7/a;    
			}
		catch (ArithmeticException e){
			  System.out.println(" Cannot divided by "+ e.getMessage());
			  }
		catch (Exception e){ //Multiple catch
			  System.out.println("Handle it ");
			  }
	
		finally {
				 System.out.println("I am finally block");
			}
		/*	catch (ArithmeticExcepti e){ //UNREACHABLE
			  System.out.println("Cannot divide by Zero"+e.getMessage());
			  }*/
			

}
}