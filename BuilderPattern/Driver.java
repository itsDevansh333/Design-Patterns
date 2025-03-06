package BuilderPattern;

import BuilderPattern.Employee.EmployeeBuilder;

public class Driver {
	public static void main(String[] args) {
		Employee e1=new Employee.EmployeeBuilder()
				.setEmpId(101)
				.setEmpName("Devansh")
				.setAddress("Kanpur")
				.build();
		System.out.println(e1);
	}
}
