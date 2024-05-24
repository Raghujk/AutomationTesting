package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSPOPUP {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//1.Alert pop up
		//driver.get("https://netbanking.hdfcbank.com/netbanking/");
		//driver.switchTo().frame("login_page");
		//driver.findElement(By.linkText("CONTINUE")).click();
		//Alert alert = driver.switchTo().alert();
		//Thread.sleep(2000);
		//alert.accept();
		
		//2.Confirmation pop up
		//driver.get("https://licindia.in/");
		//driver.findElement(By.partialLinkText("Login")).click();
		//Alert alert = driver.switchTo().alert();
		//alert.accept();
		//alert.dismiss();
		
		//3.prompt pop up
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Raghu");
		alert.accept();
		
	}

}
