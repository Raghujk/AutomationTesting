package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BasicsOfTestNg {
	@Test(priority=10,dependsOnMethods="Flipkart")
	public void Amazon() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Reporter.log("Amazon",true);
		driver.quit();
	
	}
	@Test(priority=1)
	public void Flipkart() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Reporter.log("Flipkart",true);
		driver.quit();
		
	}
	@Test(priority=-1,enabled=false)
	public void W3School() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		Reporter.log("W3School",true);
		driver.quit();
		
	}
	@Test(priority=2,invocationCount=3,threadPoolSize=3)
	public void Myntra() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		Reporter.log("Myntra",true);
		driver.quit();
		
	}
	

}
