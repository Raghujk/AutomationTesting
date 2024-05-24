package Actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickandHold {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		driver.findElement(By.id("password")).sendKeys("12345abcd");
		Thread.sleep(2000);
		WebElement Hold = driver.findElement(By.xpath("//div[@class=\"showPassword shownhide\"]"));
		Actions a=new Actions(driver);
		a.clickAndHold(Hold).perform();
		Thread.sleep(2000);
		a.release(Hold).perform();
	}

}
