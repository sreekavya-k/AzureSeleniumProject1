package udemytestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	@BeforeClass
	public void class1() {
		System.out.println("Before class only");
	}

	@Test(groups= {"SMOKE"})
	public void webloginHomeLoan() {
		System.out.println("webloginHomeLoan");
	}
	
	@Parameters({"URL"})
	@Test
	public void mobileLoginHomeLoan(String url) {
		System.out.println("mobileLoginHomeLoan "+url);
	}
	
	@Test(dataProvider = "getData")
	public void mobileSignInHomeLoan(String username,String password) {
		System.out.println("mobileSignInHomeLoan");
		System.out.println("Username is "+username);
		System.out.println("Password is "+password);
	}
	
	@Test(enabled=false)
	public void mobileSignOutHomeLoan() {
		System.out.println("mobileSignOutHomeLoan");
	}
	
	@Test(dependsOnMethods = {"webloginHomeLoan"})
	public void ApiLoginHomeLoan() {
		System.out.println("loginApiHomeLoan");
	}
	
	@AfterTest
	public void lastExecution() {
		System.out.println(" I will execute in the last");
	}
	
	@AfterMethod
	public void afterevery() {
		System.out.println("After every method");
	}
	
	@AfterClass
	public void class2() {
		System.out.println("After class only");
	}
	
	@DataProvider
	public Object[][] getData() {
		//1st combo withuname &pwd- good credit history=row
		//2nd uname& pwd-no credit history
		//3rd Fraudlant data
		//3 combinations, passing 2 values
		
		Object[][] data = new Object[3][2];
		data[0][0]= "1st Username";
		data[0][1]= "password";
		//columns in the row are nothing but , values for that column
		data[1][0]="2nd Username";
		data[1][1]= "2nd Password";
		//columns in the 3rd set username
		data[2][0]="3rd Username";
		data[2][1]="3rd Password";
		
		return data;
	}
}
