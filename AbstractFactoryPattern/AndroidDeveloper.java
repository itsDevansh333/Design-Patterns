package AbstractFactoryPattern;

public class AndroidDeveloper implements Employee {

	@Override
	public int salary() {
		// TODO Auto-generated method stub
		return 50000;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		System.out.println("I am Android Developer");
		return "Android Developer";
	}
	
}
