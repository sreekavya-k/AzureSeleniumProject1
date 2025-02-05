package udemytestng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day1 {

	@Test(groups= {"SMOKE"})
	public void krishna() {
		System.out.println("krishna");
	}
	
	@Test
	public void rama() {
		System.out.println("rama");
	}
	
	@BeforeMethod
	public void before() {
		System.out.println("Before every method");
	}
}
