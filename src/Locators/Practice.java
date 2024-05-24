package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
	    Driver.manage().window().maximize();
	    Driver.get("https://demowebshop.tricentis.com/");
	   // Thread.sleep(2000);
		//Driver.findElement(By.id("email")).sendKeys("Pavan");
		//Driver.findElement(By.className("password")).sendKeys("pavan");
		//Thread.sleep(2000);
		//Driver.findElement(By.name("login")).click();
	    List<WebElement> link =Driver.findElements(By.tagName("a"));
	    System.out.println(link.size());
	}

}
