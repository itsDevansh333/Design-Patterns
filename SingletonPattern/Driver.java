package SingletonPattern;

public class Driver {
	public static void main(String[] args) {
		//Test object=new Test()     Cannot create class using new keyword
		//using the getter method to create the instance of the object
		
		Test object1=Test.getTest();
		System.out.println(object1.hashCode());
		Test object2=Test.getTest();
		System.out.println(object2.hashCode());
		
//		object1.hashCode()==object2.hashCode()
		
		//this approach is called Lazy initialization
		
//		Test2 object=new Test2();    --> this will throw error since constructor is private
		
		Test2 object3=Test2.getTest2();
		Test2 object4=Test2.getTest2();
		System.out.println(object3.hashCode());
		System.out.println(object4.hashCode());
		
		//this approach is called eager initialization
	}
}
