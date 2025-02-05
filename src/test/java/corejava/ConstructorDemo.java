package corejava;

public class ConstructorDemo {

	public ConstructorDemo() {
		System.out.println("I am in the constructor");
	}
	
	public ConstructorDemo(int a, int b) {
		int c=a+b;
		System.out.println("I am the parametrized constructor "+c);
	}
	public ConstructorDemo(String str) {
		System.out.println("Hare Krishna");
	}

	
	public void getData() {
		System.out.println("I am the method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo cd1 = new ConstructorDemo(1,2);
		ConstructorDemo cd2 = new ConstructorDemo("RadhaKrishna");
		//whenever you create object constructor is called
		
	}

}
