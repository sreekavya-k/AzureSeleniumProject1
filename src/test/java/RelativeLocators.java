import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nameEditbox = driver.findElement(By.xpath("//input[@name='name']"));
		System.out.println(driver.findElement(RelativeLocator.with(By.tagName("label")).above(nameEditbox)).getText());
		// WebElement dob=driver.findElement(By.cssSelector("[for='dateofBirth']"));
//	driver.findElement(RelativeLocator.with(By.tagName("input")).below(dob)).sendKeys("12/01/1993");
		WebElement icecreamlabel = driver.findElement(By.cssSelector("[for='exampleCheck1']"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(icecreamlabel)).click();
		WebElement radiobtn = driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(RelativeLocator.with(By.tagName("label")).toRightOf(radiobtn)).getText());

	}

}
