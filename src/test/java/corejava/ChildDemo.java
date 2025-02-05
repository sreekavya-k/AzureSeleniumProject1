package corejava;

public class ChildDemo extends ParentDemo {
	String name="HareKrishna";
	public ChildDemo() {
		super();
		System.out.println("Child class constructor");		
	}
	public void getStringData() {
		System.out.println("Name is "+name);
		System.out.println(super.name);
	}
	public void getData() {
		System.out.println("I am child class");
		super.getData();
	}

	
	public static void main(String[] args) {
		ChildDemo cd = new ChildDemo();
		cd.getStringData();
		cd.getData();
	}
}
