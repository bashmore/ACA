package lazenby.com.person;

import static org.junit.Assert.*;
import java.util.Calendar;
import lazenby.com.department.Department;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmployeeDobTest {

	private Person employee;
	private Calendar dob;
	private int year;
	private int month;
	private int day;
	
	@Before
	public void setUp() throws Exception {
		employee = new Employee(Department.IT);
		
		dob = Calendar.getInstance();
		
		year = 1962;
		month = 2; //March
		day = 5;
		
		dob.set(year,month,day,0,0);
		
		employee.setDob(dob);
	}

	@After
	public void tearDown() throws Exception {
		employee = null;
	}

	@Test
	public void testDobYear() {		
		assertEquals(employee.getDobYear(), year);		
	}
	
	@Test
	public void testDobMonth() {		
		assertTrue(employee.getDobMonth() == month);		
	}
	
	@Test
	public void testDobDay() {			
		assertTrue("expected day to equal '5'",employee.getDobDay() == day);		
	}
	
	@Test
	public void testDob() {			
		assertNotNull(employee.getDob());
		
		employee.setDob(null);
		
		assertNull(employee.getDob());
	}
	

}
