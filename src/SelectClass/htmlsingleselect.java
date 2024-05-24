package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class htmlsingleselect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/admin/Desktop/Select.html");
		WebElement Menu = driver.findElement(By.id("Empire"));
		Select s=new Select(Menu);
		s.selectByIndex(2);
		s.selectByVisibleText("Peri peri chicken");
		s.selectByValue("e");
		Thread.sleep(2000);
		s.deselectByVisibleText("Peri peri chicken");		
	}

}
