/*
 * written by srujana
 */
public class MainApp {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setEmployeeNumber(101);
		employee1.setEmployeeName("srujana");
		employee1.setSalary(3500);
		System.out.println("The details of the employee1 :");
		System.out.println("Employee name :" +employee1.getEmployeeName());
		System.out.println("EMployee number :"+employee1.getEmployeeNumber());
		System.out.println("Employee salary :"+employee1.getSalary());
		Employee employee2 = new Employee();
		employee2.setEmployeeNumber(103);
		employee2.setEmployeeName("Ram");
		employee2.setSalary(3500);
		System.out.println("The details of the employee2 :");
		System.out.println("Employee name :" +employee2.getEmployeeName());
		System.out.println("EMployee number :"+employee2.getEmployeeNumber());
		System.out.println("Employee salary :"+employee2.getSalary());
		Processing process = new Processing();
		float difference = process.salaryDifference(employee1, employee2);
		System.out.println("The difference between their salaries is :"+difference);
		String updatedName = process.updateEmployeeName(employee1, "Srujana Kurasakutla");
		System.out.println("The employee1 name is changed to "+ updatedName);
	}

}
