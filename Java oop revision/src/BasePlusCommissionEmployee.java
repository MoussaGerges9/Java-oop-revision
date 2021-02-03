
public class BasePlusCommissionEmployee extends CommissionEmployee {
	double Base;

	public void SetBase(double base) {
		this.Base = base;
	}

	public double GetBase() {
		return Base;
	}

	public double Earning() {
		return Base + super.Earning();
	}

	public void DisplayAllDetails() {
		String Details = super.toString() + toString(); // Using super to call methods and attributes from the Base class
		System.out.println(Details);
	}

	public void DisplayEarning() {
		System.out.println("Your earnign is " + Earning());
	}

}
