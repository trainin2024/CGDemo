package four.com.strings.with.override.equals;

public class EmployeeMain {
//With Override
		public static void main(String[] args)
		{
			Employee emp1= new Employee("E001","jack","manager",1000); //equals = false with E001 and E002
			Employee emp2= new Employee("E001","jack","manager",1000); //equal=false
			
			System.out.println("Using equals for comparing emp1 and emp2 -  "+ emp1.equals(emp2));//T //deep comparison - internal values too
			//System.out.println("Using == for comparing emp1 and emp2 -  "+ (emp1==emp2));//F //shallow comparision -address
			
			System.out.println(emp1.hashCode());
			System.out.println(emp2.hashCode());
			String s1= "Hello";
			String s2 = "Hello";
			System.out.println(s1.equals(s2));
			System.out.println(s1==s2);

		}
}






// If both objects have same value they should be treated as same but here it is returning false because it is check for location
/*1) If two objects are equal (i.e. the equals() method returns true), they must have the same hashcode. 
 * 2) If the hashCode() method is called multiple times on the same object, it must return the same result every time.
 *  3) Two different objects can have the same hash code.
 */