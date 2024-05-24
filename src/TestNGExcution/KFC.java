package TestNGExcution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KFC {
	@Test(groups="Intigrated")
	public void kFC() {
		WebDriver driver = new ChromeDriver();
		driver.get("hhttps://online.kfc.co.in/");
		Reporter.log("KFC Page",true);
		driver.quit();

}
}
