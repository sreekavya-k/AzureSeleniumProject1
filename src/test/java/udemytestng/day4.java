package udemytestng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	@Parameters({"URL"})
	@Test
	public void webloginCarLoan(String url) {
		System.out.println("webloginCarLoan "+url);
	}
	
	@Test
	public void mobileLoginCarLoan() {
		System.out.println("mobileLoginCarLoan");
	}
	
	@AfterSuite
	public void lastExecution() {
		System.out.println("I do execute last in the package");
	}
	@Test
	public void loginApiCarLoan() {
		System.out.println("loginApiCarLoan");
	}
	
	
}
