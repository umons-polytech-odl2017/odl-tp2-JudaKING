package exercise1;

public abstract class Employee {



	private String name;


	public Employee(String name) {
		this.name=name;
	}



	public abstract int computeSalary();


	public void sell() { }

	public void workOneHour() { }

	public String getName() {
		return name;
	}
}


