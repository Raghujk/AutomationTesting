package TestNGExcution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Foodpanda {
	@Test(groups="System")
	public void foodpanda() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.foodpanda.com/");
		Reporter.log("Foodpanda Page",true);
		driver.quit();
		
	}

}
