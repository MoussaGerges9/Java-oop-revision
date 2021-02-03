
public class CommissionEmployee extends Employee implements Displayable {

	protected double Gross_Sales;
	protected double Commission_Rate;

	public CommissionEmployee() {
	}

	public CommissionEmployee(String name, int ssn, String address, double grossSales, double commissionRate) {
		super(name, ssn, address);
		this.Gross_Sales = grossSales;
		this.Commission_Rate = commissionRate;
	}

	public void SetGross_Sales(double gross_Sales) {
		this.Gross_Sales = gross_Sales;
	}

	public void SetCommission_Rate(double commissionRate) {
		this.Commission_Rate = commissionRate;
	}

	public void DisplayAllDetails() {
		String Details = super.toString() + toString(); // Using super to call methods and attributes from the base class
		System.out.println(Details);
	}

	public void DisplayEarning() {
		System.out.println("Your earnign is " + Earning());
	}

	public double Earning() {
		return Gross_Sales * Commission_Rate;
	}

	@Override
	public String toString() {
		return "ross_Sales:" + Gross_Sales + ", Commission_Rate:" + Commission_Rate;
	}

}
