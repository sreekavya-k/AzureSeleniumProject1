package udemytestng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS {
	@BeforeMethod
	public void beforeRun() {
		System.out.println("Running First");
	}

	public void dothis(){
		System.out.println("I am here");
	}

}
