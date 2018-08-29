package lazenby.com.person;

import java.util.Calendar;

import lazenby.com.department.Department;

/**
 * Old way of testing a class 
 *
 */
public class TestEmployeeDob {

	public static void main(String[] args) {
		
		Person employee = new Employee(Department.IT);
		
		Calendar danDob = Calendar.getInstance();
		danDob.set(1988, Calendar.OCTOBER, 5, 0, 0); //age = 29
		
		
		employee.setDob(danDob);
		employee.setLastName("Lazenby");
		
		System.out.println("birth year: "+ employee.getDobYear());
		System.out.println("birth month: "+ employee.getDobMonth());
		
		System.out.println("age: " + employee.getAge());
		

	}

}