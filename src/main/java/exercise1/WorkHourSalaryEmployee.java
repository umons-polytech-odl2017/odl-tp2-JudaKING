package exercise1;

public class WorkHourSalaryEmployee extends Employee {

	private int hourRate;
	private int workhour=0;

	public WorkHourSalaryEmployee(String name, int hourRate) {
		super(name);
		this.hourRate = hourRate;
	}

	@Override
	public void workOneHour() {
		workhour++;
	}

	@Override
	public int computeSalary() {
		return (workhour*hourRate);
	}
}
