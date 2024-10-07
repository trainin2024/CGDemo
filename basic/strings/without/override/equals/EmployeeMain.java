package four.com.strings.without.override.equals;

public class EmployeeMain {
//Without Override
		public static void main(String[] args)
		{
			Employee emp1= new Employee("E001","jack","manager",1000);
			Employee emp2= new Employee("E001","jack","manager",1000);
			
			System.out.println("Using equals for comparing emp1 and emp2 -  "+ emp1.equals(emp2));//f
			System.out.println("Using == for comparing emp1 and emp2 -  "+ (emp1==emp2));//f
			
		}
}
