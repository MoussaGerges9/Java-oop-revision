abstract public class Employee {

	protected String Name;
	protected int SSN;
	protected String Address;

	public Employee() {

	}

	public Employee(String name, int ssn, String address) {
		this.Name = name;
		this.SSN = ssn;
		this.Address = address;
	}

	public void SetName(String name) {
		this.Name = name;
	}

	public String GetName() {
		return Name;
	}

	public void SetSSN(int ssn) {
		this.SSN = ssn;
	}

	public int GetSSN() {
		return SSN;
	}

	public void SetAddress(String address) {
		this.Address = address;
	}

	public String GetAddress() {
		return Address;
	}

	public abstract double Earning();

	@Override
	public String toString() {
		return "Name:" + Name + ", SSN:" + SSN + ", Address:" + Address + ", ";
	}

}
