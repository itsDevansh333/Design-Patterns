package FactoryPattern;

public class EmployeeFactory {
	//getting employee
	public static Employee getEmployee(String empType) {
		if(empType.trim().equalsIgnoreCase("android developer")) {
			return new AndroidDeveloper();
		}
		else if(empType.trim().equalsIgnoreCase("web developer")) {
			return new WebDevleoper();
		}
		else {
			return null;
		}
	}
}
