package exercise1;

public class WorkHourSalaryEmployee extends Employee {

	private int hourRate;


	public WorkHourSalaryEmployee(String name, int hourRate) {
		super(name);
		this.hourRate = hourRate;
	}

	@Override
	public int computeSalary() {
		return 0;
	}
}
