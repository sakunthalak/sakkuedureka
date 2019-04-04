package oops;
abstract class Base {
	abstract void fun();
}

class Derived extends Base {
	//Uncomment the fun method to remove the exception
	void fun() {
		System.out.println("Derived fun() called");
	}
	public void test(){
		System.out.println("I am from test");
	}
}
class AbstractExample {
	public static void main(String args[]) { 

		// Un-commenting the following line will cause compiler error as the 
		// line tries to create an instance of abstract class.
//		 Base b = new Base();

		// We can have references of Base type.
		Base b = new Derived();
		b.fun(); 

	}}