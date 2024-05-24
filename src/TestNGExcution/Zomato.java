package TestNGExcution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Zomato {
	@Test(groups="Smoke")
	public void zomato() {
		WebDriver driver = new ChromeDriver();
		driver.get("hhttps://www.zomato.com/");
		Reporter.log("Zomato Page",true);
		driver.quit();
		
	}

}
