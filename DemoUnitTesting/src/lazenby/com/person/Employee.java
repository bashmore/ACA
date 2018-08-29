package lazenby.com.person;

import java.util.Calendar;
import lazenby.com.department.Department;

public class Employee extends Person {

	private final Department department;
	private String badgeNumber;	
	
	Employee(Department department) {
		this.department = department;
	}
	
	@Override
	public String getFullName() {
		
		String firstNameTrimed = getFirstName().trim();
		String firstNameLower = firstNameTrimed.toLowerCase();
		String firstNameLetter = firstNameLower.substring(0,1).toUpperCase();
		String firstNameCamel = firstNameLetter + firstNameLower.substring(1);
		
		String lastNameTrimed = getLastName().trim();		
		String lastNameLower = lastNameTrimed.toLowerCase();		
		String lastNameLetter = lastNameLower.substring(0, 1).toUpperCase();		
		String lastNameCamel = lastNameLetter + lastNameLower.substring(1);				
				
		return firstNameCamel + " " + lastNameCamel;
	}

	@Override
	public Integer getAge() {		
		Integer age = null;
		
		if (getDob() == null) {
			//unknown
		} else {
			Calendar current = Calendar.getInstance();
			int currentYear = current.get(Calendar.YEAR);
			
			int birthYear = getDob().get(Calendar.YEAR);
			
			age = currentYear - birthYear;
			
			
			if (getDobMonth() > current.get(Calendar.MONTH)) {
				//need to check the month too
				age = age - 1;
				
				//do i need to check the day too?
			}
		}
		
		 return (age != null ? age : null);
	}

	public Department getDepartment() {
		return department;
	}
	
	public String getBadgeNumber() {
		return badgeNumber;
	}

	public void setBadgeNumber(String badgeNumber) {
		this.badgeNumber = badgeNumber;
	}
	

}
