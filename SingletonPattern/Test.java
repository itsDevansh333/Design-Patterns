package SingletonPattern;

public class Test {
	private static Test test;   //contains a single object of test class
	private Test(){
		//private contructor to restrict object creation
	}
	//getter method to fetch single created instance of the Test class
	public static Test getTest() {
		if(test==null) {
			synchronized (Test.class) {
				
//				synchronized block is used to make singleton pattern threadsafe
				test=new Test();
			}
		}
		return test;
	}
}
