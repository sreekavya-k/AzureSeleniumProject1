import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggetsiveDropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement>options =  driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		//In list of 7 options, I already found 3rd option, and no need to search on ter options, that's we we are using break
		for(WebElement option:options) {
			if(option.getText().equalsIgnoreCase("india")) {
				Assert.assertEquals(option.getText().equalsIgnoreCase("india"), true);
				option.click();
				break;			
			}
		}
		//CheckBox
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		//Assert false, it has to be false, else this test fails
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
	}

}
