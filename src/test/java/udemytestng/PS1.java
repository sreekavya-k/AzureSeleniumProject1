package udemytestng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS1 extends PS {
	
	@Test
	public void testRun() {

		dothis();
		PS2 obj = new PS2(5);
		System.out.println(obj.increment());
		System.out.println(obj.decrement());
		//PS3 obj1 = new PS3(10);
		System.out.println(obj.multiplyByTwo());
		System.out.println(obj.multiplyByThree());
	}
}
