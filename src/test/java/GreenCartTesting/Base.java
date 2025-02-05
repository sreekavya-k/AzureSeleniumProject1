package GreenCartTesting;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		String itemsNeeded[] = { "Cucumber", "Brocolli", "Beetroot", "Carrot" };
		addItems(driver,itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
	}

	public static void addItems(WebDriver driver,String itemsNeeded[]) {
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {
			String name[] = products.get(i).getText().split("-");
			String formatName = name[0].trim();
			// format it to get actual vegname
			// check whether the names you extracted or not is present or not
			// convert aray to arraylist for easy search
			List itemsNeededList = Arrays.asList(itemsNeeded);
			// If we need only3 veggies, hen what is the point of running remaining
			int j = 0;
			if (itemsNeededList.contains(formatName)) {
				// Add to cart
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemsNeeded.length) {
					break;
				}
			}
		}
	}
}
