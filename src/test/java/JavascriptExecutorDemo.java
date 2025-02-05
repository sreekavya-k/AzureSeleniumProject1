import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.hc.core5.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutorDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\skumarakalva\\OneDrive - Entain Group\\Documents\\Kavya's Personal\\screenshots\\screenshot.png"));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//String url=driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		/*
		 * Step1: To get all the urls tied upto the links using Selenium Java methods
		 * will call urls and gets you the status code If statuscode>400 then the url is
		 * not working
		 */
		//Openconnection to find the statuscodes of any link
		
		SoftAssert softassert= new SoftAssert();
		List<WebElement>links=  driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for(WebElement link: links) {
			String url=link.getAttribute("href");	
			HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int responseCode=conn.getResponseCode();
			System.out.println(responseCode);
			softassert.assertTrue(responseCode<403, "The link with text "+link.getText()+" is broken with code "+responseCode);
			
		}
		softassert.assertAll();
	}

}
