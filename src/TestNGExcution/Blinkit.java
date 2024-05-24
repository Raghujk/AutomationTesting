package TestNGExcution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Blinkit {
		@Test(groups="Smoke")
		public void blinkit() {
			WebDriver driver = new ChromeDriver();
			driver.get("https://blinkit.com/");
			Reporter.log("Blinkit Page",true);
			driver.quit();
			
		}
}
