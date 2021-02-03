import java.util.ArrayList;

public class Department {
	int dId;
	String dName;
	ArrayList<Employee> employeeList; // Array of the Base class

	public Department() {

	}

	public Department(int dno, String dname) {
		this.dId = dno;
		this.dName = dname;
		employeeList = new ArrayList<Employee>();
	}

	public int getDno() {
		return dId;
	}

	public void setDno(int dno) {
		this.dId = dno;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public void AddEmployee(Employee employee) {
		employeeList.add(employee);
	}

	public void removeEmployee(int index) {
		employeeList.remove(index);
	}

	public String GetEmployeeNumber() {
		return String.format("You have %d employees.", employeeList.size());
	}

	public void PrintBasicDetails() {
		for (int i = 0; i < employeeList.size(); i++) {
			System.out.println("Name: " + employeeList.get(i).GetName() + ", Adress: " + employeeList.get(i).GetAddress()
					+ ", SSN: " + employeeList.get(i).GetSSN());
		}
	}

	public void PrintAllDetails() {
		for (int i = 0; i < employeeList.size(); i++) {
			if (employeeList.get(i) instanceof CommissionEmployee)
				((CommissionEmployee) employeeList.get(i)).DisplayAllDetails();

			if (employeeList.get(i) instanceof HourlyEmployee)
				((HourlyEmployee) employeeList.get(i)).DisplayAllDetails();

			if (employeeList.get(i) instanceof SalariedEmployee)
				((SalariedEmployee) employeeList.get(i)).DisplayAllDetails();

		}
	}

}
