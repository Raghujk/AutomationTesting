package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDNameMEthod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Raghu");
		driver.findElement(By.name("lastname")).sendKeys("Prasad D");
		driver.findElement(By.name("reg_email__")).sendKeys("7892139416");
		driver.findElement(By.id("password_step_input")).sendKeys("PrasadD123");
		driver.findElement(By.name("websubmit")).click();

	}

}
