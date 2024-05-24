package Actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://trello.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("username")).sendKeys("raghup477@gmail.com");
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		driver.findElement(By.id("password")).sendKeys("@Password123");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		driver.findElement(By.xpath("//div[text()='Automation']")).click();
		WebElement scr = driver.findElement(By.linkText("Drag And Drop"));
		WebElement dest = driver.findElement(By.xpath("//h2[text()='Doing']/../../..//button[text()='Add a card']"));
		Actions a=new Actions(driver);
		a.dragAndDrop(scr, dest).perform();
		
		
		
	}

}
