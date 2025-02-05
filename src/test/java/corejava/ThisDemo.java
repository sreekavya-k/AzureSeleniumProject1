package corejava;

public class ThisDemo {

	int a=2;//Global variabe
	public void getData() {
		int a=3;//local variable
		System.out.println(a);
		//this referes to current object -its scope lies in class level
		System.out.println(this.a);
		int sum=a+this.a;
		System.out.println(sum);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo td=new ThisDemo();
		td.getData();
		
	}

}
