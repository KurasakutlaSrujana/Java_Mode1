
public class Processing {
	public float salaryDifference(Employee employee1,Employee employee2) {
		if(employee1.getSalary() > employee2.getSalary()) {
			System.out.println(employee1.getEmployeeName()+" having more salary");
			return employee1.getSalary() - employee2.getSalary(); 
		}
		else if(employee1.getSalary() < employee2.getSalary()) {
			System.out.println(employee2.getEmployeeName()+" having more salary");
			return employee2.getSalary() - employee1.getSalary(); 
		}
		else {
			System.out.println("Both employees having same salary");
		}
		return 0;
	}
	
	public String updateEmployeeName(Employee employee,String name) {
		employee.setEmployeeName(name);
		return employee.getEmployeeName();
	}
}
