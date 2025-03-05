package AbstractFactoryPattern;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// getting android developer
		Employee e1=EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
		e1.name();
		Employee e2=EmployeeFactory.getEmployee(new WebDeveloperFactory());
		e2.name();
	}

}
