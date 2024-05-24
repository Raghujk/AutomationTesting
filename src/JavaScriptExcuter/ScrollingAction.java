package JavaScriptExcuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingAction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	    driver.get("https://www.google.com/");
	    driver.findElement(By.name("q")).sendKeys("Bikes",Keys.ENTER);
	    driver.findElement(By.xpath("//div[text()='Images']")).click();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    for(;;) {
	    	try {
	    		driver.findElement(By.xpath("//div[text()='Top 10 Trending Bikes in India 2024 ...']")).click();
	    		break;
	    	}catch(Exception e) {
	    		js.executeScript("window.scrollBy(0,200)",true);
	    	}
	    }
	}

}
