
public class SalariedEmployee extends Employee implements Displayable {

	private double Salary;
	private double Bonus;
	private double Deductions;

	public SalariedEmployee() {

	}

	public SalariedEmployee(double salary, double bonus, double deductions, String name, String address, int ssn) {
		this.Bonus = bonus;
		this.Deductions = deductions;
		this.Salary = salary;

		this.Name = name;
		this.SSN = ssn;
		this.Address = address;
	}

	public void SetSalary(double salary) {
		this.Salary = salary;
	}

	public void SetBonus(double bonus) {
		this.Bonus = bonus;
	}

	public void SetDeductions(double deductions) {
		this.Deductions = deductions;
	}

	public void DisplayAllDetails() {
		String Details = super.toString() + toString(); // Using super to call methods and attributes from the Base class
		System.out.println(Details);
	}

	public void DisplayEarning() {
		System.out.println("Your earnign is " + Earning());
	}

	public double Earning() {
		return (Salary + Bonus) - Deductions;
	}

	@Override
	public String toString() {
		return "Salary:" + Salary + ", Bonus:" + Bonus + ", Deductions:" + Deductions;
	}

}
