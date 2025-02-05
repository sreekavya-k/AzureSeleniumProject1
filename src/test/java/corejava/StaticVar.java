package corejava;

public class StaticVar {
	String name;
	String address;
	static String city;

	static int i;
	static {
		city="Vaikuntam";
		i=0;
	}
	public StaticVar(String name, String address) {
		// Scope of this variables to local variables
		// we have to assign local variables to instance variables
		// current class instance variables
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
	}

	public void getAddress() {
		System.out.println(address+" "+city);
	}
	public static void getCity() {
		System.out.println(city);
	}

	public static void main(String[] args) {
		StaticVar obj = new StaticVar("Krishna", "Vrindavan");
		StaticVar obj1 = new StaticVar("Ram", "Ayodhya");
		obj.getAddress();
		obj1.getAddress();
		StaticVar.getCity();
		StaticVar.i=4;
		obj.address="Madhuram";
	}
}
