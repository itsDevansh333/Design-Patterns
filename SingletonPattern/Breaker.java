package SingletonPattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Breaker {
	public static void main(String[] args) throws Exception {
		//Method 1
		/*
		 * Using Reflection API to break the singleton pattern
		 * Solution: 1->If object is there ==> throw exception from inside constructor
		 * Solution: 2-> use Enum
		 
			Test test=Test.getTest();
			System.out.println(test.hashCode());
			Test object=Test.INSTNACE;
			object.display();*/
		
		
		
			/*Method 2
		 *
		 * Deserialization /serialization
		 * solution: implement ReadResolve method 
		 * this will return the same object after deserialization
		 *
		 * 
		
	
			Test t1=Test.getTest();
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("abc.ob"));
			oos.writeObject(t1);
			System.out.println(t1.hashCode());
			
			System.out.println("Serialization Done....");
			
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.ob"));
			Test t2=(Test)ois.readObject();
			System.out.println(t2.hashCode());
			
		*/
		
		//Method 3
		/*
		 * Cloning
		 * Solution: implement clone method in the class and return the 
		 * same object rather than returning super.clone()
		 	
		 * Test t1=Test.getTest();
		 * System.out.println(t1.hashCode());
		
		 * Test t2=(Test) t1.clone();
		 * System.out.println(t2.hashCode());
		*/
	}
}
