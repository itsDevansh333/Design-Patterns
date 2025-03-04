package FactoryPattern;

public class DevelperClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee employee=new AndroidDeveloper();     Here the class is getting tightly coupled
		Employee employee=EmployeeFactory.getEmployee("web Developer");
		System.out.println(employee.getSalary());
	}

}
