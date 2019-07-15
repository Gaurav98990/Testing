package gauravPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting2 extends CrossBrowserTesting{
	
	@Test
	public void testParameterWithXML() throws InterruptedException{
		//Launch URl
				d.get("https://login.yahoo.com/");
				//Enter UserName
				d.findElement(By.id("login-username")).sendKeys("gauravisin3u@yahoo.com");
				//Click on Next Button
				d.findElement(By.id("login-signin")).click();
				Thread.sleep(1000);
				//Enter password
				d.findElement(By.id("login-passwd")).sendKeys("May@1234");
				//Click next
				d.findElement(By.name("verifyPassword")).click();
	}
	
	
}
