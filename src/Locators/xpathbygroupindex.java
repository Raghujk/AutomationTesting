package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbygroupindex {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dunzo.com/search");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Search for item or a store']")).sendKeys("Apple");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[text()='ADD']) [1]")).click();
		
	}

}
