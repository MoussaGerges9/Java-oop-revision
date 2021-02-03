
public class HourlyEmployee extends Employee implements Displayable {

	private double Houre_Rate;
	private int Number_Of_Hours;

	public HourlyEmployee() {
	}

	public HourlyEmployee(String name, int ssn, String address, double houreRate, int NumberOfHours) {
		super(name, ssn, address);
		this.Houre_Rate = houreRate;
		this.Number_Of_Hours = NumberOfHours;
	}

	public void SetHoureRate(double houreRate) {
		this.Houre_Rate = houreRate;
	}

	public void SetNumberOfHours(int numberOfHours) {
		this.Number_Of_Hours = numberOfHours;
	}

	public void DisplayAllDetails() {
		String Details = super.toString() + toString(); // Using super to call methods and attributes from the Base class
		System.out.println(Details);
	}

	public void DisplayEarning() {
		System.out.println("Your earnign is " + Earning());
	}

	public double Earning() {
		return Houre_Rate * Number_Of_Hours;
	}

	@Override
	public String toString() {
		return "Houre_Rate:" + Houre_Rate + ", Number_Of_Hours:" + Number_Of_Hours;
	}

}
