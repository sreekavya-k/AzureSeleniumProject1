package corejava;

public class ExceptionDemo {

		
	public static void main(String[] args) {
		int a=4;
		int b=7;
		int c=0;
		
		// TODO Auto-generated method stub
		try {
			/*
			 * int d=b/c; System.out.println(d);
			 */
			int arr[]= new int[5];
			System.out.println(arr[6]);
			
		}catch(ArithmeticException at) {
			System.out.println("AritmeticException");
		}catch(ArrayIndexOutOfBoundsException AIOBE) {
			System.out.println("Catche Index out of bound");
		}
			catch(Exception e) {
			System.out.println("Exception");
		}finally {
			System.out.println("Delete cookies");
		}
		System.out.println("Hare Krishna!");
	}

}
