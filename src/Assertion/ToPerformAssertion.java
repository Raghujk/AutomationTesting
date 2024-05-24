package Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ToPerformAssertion {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String Expectedresult="Online Shopping for Women - Shop For Women Clothes, Shoes, Bags & More";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		driver.findElement(By.partialLinkText("WOMEN")).click();
		//System.out.println(driver.getTitle());
		Assert.assertEquals(Expectedresult, driver.getTitle(),"Our driver control is not landed properly on Women");
		driver.quit();

	}

}
