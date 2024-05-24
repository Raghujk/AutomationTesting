package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getattribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");
		Thread.sleep(2000);
	    WebElement attribute = driver.findElement(By.linkText("Try Free"));
	    System.out.println(attribute.getCssValue("color"));
	    System.out.println(attribute.getTagName());
	    System.out.println(attribute.getText());
	    System.out.println(attribute.getLocation());
	    System.out.println(attribute.getSize());
	    
	}

}
