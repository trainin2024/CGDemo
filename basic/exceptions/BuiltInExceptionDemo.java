package com.cg.basic.exceptions;

public class BuiltInExceptionDemo {
	    public static void main(String[] args) {
	        try {
	            // Example of ArrayIndexOutOfBoundsException
	            int[] array = {1, 2, 3};
	            System.out.println(array[1]); // Accessing index out of bounds

	            // Example of ArithmeticException
	            int result = 10 / 1; // Division by zero
	            System.out.println("Result is :"+result);

	            // Example of NullPointerException
	            String str = "ss";
	            System.out.println(str.length()); // Accessing length of null string
	            System.exit(1);
	            
	        } catch (ArrayIndexOutOfBoundsException ae) {//Built in Exception
	            System.out.println("Array Index Out Of Bounds Exception occurred: "  
	            + ae.getMessage());
	        } catch (ArithmeticException e) {
	            System.out.println("Arithmetic Exception occurred: " + e.getMessage());
	       }  catch (NullPointerException e) {
	            System.out.println("Null Pointer Exception occurred: " + e.getMessage());
	        }
	        
	        catch(Exception e)
	        {
	        	System.out.println(" SOmething went wrong");
	        }
	        
	        
	        finally {
	        	System.out.println(" I am a finally block");
	        }
	        
	    /*catch(ArrayIndexOutOfBoundsException | ArithmeticException |NullPointerException  e )
	        { System.out.println("Something went wrong");	
	        }*/
	    }
	}


