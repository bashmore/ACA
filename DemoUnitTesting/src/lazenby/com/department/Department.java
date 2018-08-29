package lazenby.com.department;

public enum Department {

	Accounting("Louis",8),Finance("Dan",3),IT("Grant",101);
	
	private final String manager;
	private final int numberOfEmployees;	
	
	Department(String manager, int numberOfEmployees) {
		this.manager = manager;
		this.numberOfEmployees = numberOfEmployees;		
	}

	public String getManager() {
		return manager;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}
	
}
