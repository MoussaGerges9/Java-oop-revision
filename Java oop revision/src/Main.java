
public class Main {

	public static void main(String[] args) {
		Department department = new Department(1, "Computer Science");
		
		SalariedEmployee salariedEmployee = new SalariedEmployee(3500, 300, 150, "Maichel", "Some Where", 1300);
		department.AddEmployee(salariedEmployee);
		
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Abdo",1200,"San Andress",35.5,20);
		department.AddEmployee(hourlyEmployee);
		
		CommissionEmployee commissionEmployee = new CommissionEmployee("Mina", 900, "Torino", 1500, 3);
		department.AddEmployee(commissionEmployee);
		
		System.out.println(department.GetEmployeeNumber());
		
		System.out.println("Basic details about employees: ");
		department.PrintBasicDetails();
		
		System.out.println("\nAll details about employees: ");
		department.PrintAllDetails();

	}

}
