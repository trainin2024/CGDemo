package com.cg.basic.strings;

public class StrignDemoMethods {
	public static void main(String ... args) // varags
	{
		   String s="Alex";  // Constant Pool
		   s.concat(" Martin");//concat() method appends the string at the end  
		   System.out.println(s.concat(" Martin"));
		   System.out.println(s);//will print Alex because strings are immutable objects  
		   //---------String Comparision----equals---
		   //compares this string to the specified object.
		   String s1="Apples";  
		   String s2="Apples";  
		   String s3=new String("Apples");  
		   String s4="Saurav";  
		   
		   System.out.println(s1.equals(s2));//true  
		   System.out.println(s1.equals(s3));//true  
		   System.out.println(s1.equals(s4));//false  
		   /*Notice the use of the equals method
		   The String class overrides the equals method it inherited from the
		    Object class and implemented logic to compare the two String objects 
		    character by character.*/
		   //------------2) By Using == operator--
		   //The == operator compares references not values.
		   /*
		    * the equality operator (==) compares the references 
		    * (addresses in memory) of the two Strings as two different numbers
		    *  - this is known as reference equality.
		    * */
		   System.out.println(s1==s2);//true (because both refer to same instance)  
		   System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)  
		   
		   //------compareTo-----
		   String s10="Max"; 
		   String s20="Max";  
		   String s30=new String("Alex");  
		   System.out.println(s10.compareTo(s20));//0  
		   System.out.println(s10.compareTo(s30));//12(because s10>s30)  
		   System.out.println(s30.compareTo(s10));//-12(because s3 < s1 )  
		   
		   
		   
		   
		   
		   //---_String builder and buffer-------Mutable--
		    StringBuilder builder=new StringBuilder("hello");  //Non synchronized 
	        builder.append("java with string builder");  
	        System.out.println(builder);  
	        
	        
	        StringBuffer buffer=new StringBuffer("hello");  // Synchronized
	        buffer.append("java with String buffer");  
	        System.out.println(buffer);  

		 }  
	}


