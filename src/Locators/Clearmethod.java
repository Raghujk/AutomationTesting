package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clearmethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement username = driver.findElement(By.id("username"));
		WebElement password =driver.findElement(By.id("password"));
		Thread.sleep(2000);
		username.clear();
		username.sendKeys("Raghu");
		Thread.sleep(2000);
		password.clear();
		password.sendKeys("Raghu123");
		
		
		
	}

}
