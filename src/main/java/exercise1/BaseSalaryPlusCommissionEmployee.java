package exercise1;

public class BaseSalaryPlusCommissionEmployee extends  Employee {


	private int baseSalary;
	private int commission;
	private int sales = 0;

	public BaseSalaryPlusCommissionEmployee(String name, int baseSalary, int commission) {
		super(name);
		this.baseSalary = baseSalary;
		this.commission=commission;
	}

	@Override
	public void sell() {
		sales++;
	}

	@Override
	public int computeSalary() {

		return (baseSalary+commission*sales);
	}
}
