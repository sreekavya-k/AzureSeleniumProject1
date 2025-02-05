package corejava;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10, y = 20;
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After Swapping " + x + " " + y);
		int a=10,b=20,c;
		c=a;
		a=b;
		b=c;
		System.out.println("After Swapping "+a+" "+b);
	}

}
