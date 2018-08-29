package lazenby.com.person;

import static org.junit.Assert.*;
import java.util.Calendar;
import lazenby.com.department.Department;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmployeeAgeTest {

	private Person employee;
	private Calendar dob;
	
	
	@Before
	public void setUp() throws Exception {
		employee = new Employee(Department.IT);		
	}

	@After
	public void tearDown() throws Exception {
		employee = null;
	}	
	
	@Test
	public void testNullDob() {			
			
		assertNull(employee.getDob());
		
		assertTrue(employee.getAge() == null);
	}
	
	@Test
	public void testOldMan() {			
		dob = Calendar.getInstance();
		
		int year = 1962;
		int month = 2; //March
		int day = 5;
		
		dob.set(year,month,day,0,0);
		
		employee.setDob(dob);
		
		assertTrue("shall be 56", employee.getAge() == 56);
		
		year = 1962;
		month = 11; //December
		day = 5;
		
		dob.set(year,month,day,0,0);
		assertTrue("shall be 55", employee.getAge() == 55);
		
	}
	
	
	

}
