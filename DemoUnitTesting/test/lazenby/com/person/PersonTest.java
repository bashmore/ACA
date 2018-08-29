package lazenby.com.person;

import static org.junit.Assert.*;
import lazenby.com.department.Department;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class PersonTest {	
	
	Person employee;
	
	private final String fullName = "Dan Lazenby";
	
	@Before
	public void setUp() {
		employee = new Employee(Department.Accounting);
	}

	@After
	public void cleanUp() {
		employee = null;
	}
	
	@Test
	public void testFullNameNormal() {
		employee.setFirstName("Dan");
		employee.setLastName("Lazenby");
		
		assertTrue(employee.getFullName().equals(fullName));		 
	}
	
	@Test
	public void testFullNameSpaces() {
		employee.setFirstName("Dan  ");
		employee.setLastName("Lazenby  ");
		
		assertTrue(employee.getFullName().equals(fullName));		
	}
	
	@Test
	public void testFullNameFixCase() {
		employee.setFirstName("dan  ");
		employee.setLastName("lazenby  ");
		
		assertTrue(employee.getFullName().equals(fullName));
		
		employee = new Employee(Department.Accounting);
		
		employee.setFirstName("DAN  ");
		employee.setLastName("lAZENBY  ");
		
		assertTrue(employee.getFullName().equals(fullName));	
	}
	

	@Test
	public void testGetDepartment() {
		
		Employee employee = new Employee(Department.Finance);		
		assertEquals(employee.getDepartment(), Department.Finance);
		
		employee = new Employee(Department.IT);		
		assertEquals(employee.getDepartment(), Department.IT);
		
		employee = new Employee(Department.Accounting);		
		assertEquals(employee.getDepartment(), Department.Accounting);
	}
	
	@Test
	public void testGetBadgeNumber() {
		Employee employee = new Employee(Department.Finance);
		employee.setBadgeNumber("105");
		
		assertEquals(employee.getBadgeNumber(), "105");
		
		employee.setBadgeNumber("abc");
		
		assertEquals(employee.getBadgeNumber(), "abc");
	}
}
