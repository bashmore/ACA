package lazenby.com.person;

import java.util.Calendar;


public abstract class Person {	
	
	private String firstName;
	private String lastName;
	
	private Calendar dob;
	
	abstract String getFullName();	
	abstract Integer getAge();

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Calendar getDob() {
		return dob;
	}

	public void setDob(Calendar birthDate) {
		this.dob = birthDate;
	}

	public int getDobYear() {
		
		return getDob().get(Calendar.YEAR);		

	}

	public int getDobMonth() {
		
		return getDob().get(Calendar.MONTH);

	}

	public int getDobDay() {
		return getDob().get(Calendar.DATE);
	}	

}
