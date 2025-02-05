package udemytestng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	@Test(groups= {"SMOKE"})
	public void radhe() {
		System.out.println("radhe");
	}
	
	@Test
	public void shyam() {
		System.out.println("shyam");
	}
	
	@BeforeTest
	public void prerequisite() {
		System.out.println("I will execute First");
	}
	
	@BeforeSuite
	public void executefirst() {
		System.out.println("I do execute 1st in the package");
	}
	
}
