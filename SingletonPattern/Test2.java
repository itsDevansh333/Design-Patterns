package SingletonPattern;

public class Test2 {
	private static Test2 object = new Test2();

	private Test2() {
		
	}

	public static Test2 getTest2() {

		return object;
	}

}
