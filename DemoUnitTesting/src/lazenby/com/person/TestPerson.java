package lazenby.com.person;

import lazenby.com.department.Department;

/**
 * Old way of testing a class 
 *
 */
public class TestPerson {

	public static void main(String[] args) {
		
		Person employee = new Employee(Department.IT);
		
		employee.setFirstName("dan");
		employee.setLastName("LAZENBY");
		
		System.out.println("first: "+ employee.getFirstName());
		System.out.println("last: "+ employee.getLastName());
		System.out.println("full: "+ employee.getFullName());
		
		System.out.println("getFullName() works: " + employee.getFullName().equals("Dan Lazenby"));		

	}

}
