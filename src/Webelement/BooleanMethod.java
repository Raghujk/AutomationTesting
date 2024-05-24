package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BooleanMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		WebElement Button = driver.findElement(By.xpath("//div[text()='Log in']"));
		System.out.println(Button.isDisplayed());
		System.out.println(Button.isEnabled());
		System.out.println(Button.isSelected());
		
	}

}
