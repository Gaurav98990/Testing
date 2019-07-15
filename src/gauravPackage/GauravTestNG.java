package gauravPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GauravTestNG {

@Test
 public static void LoginPage() throws InterruptedException {
	 
	 
	 System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		//Maximize window
		d.manage().window().maximize();
		Reporter.log("Verify Maximize window");
		//Launch the URL
		d.get("https://login.yahoo.com");
		Reporter.log("Launch the URL");
		Thread.sleep(3000);
        //Enter User name
		d.findElement(By.name("username")).sendKeys("gauravisin3u@yahoo.com");
		Reporter.log("Enter the user name");
		//Click on Next Button
		d.findElement(By.id("login-signin")).click();
		Reporter.log("Click on Next Button");
		Thread.sleep(3000);
		//Enter Password
		d.findElement(By.id("login-passwd")).sendKeys("September@1234");
		Reporter.log("Enter the Password");
		//Click on next button
		d.findElement(By.id("login-signin")).click();
		Reporter.log("Click on Next Button");
		//Click on mail icon
		d.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/div/div[2]/div/ul/li[3]/a/span[1]")).click();
		Reporter.log("Click on Mail icon");
	 
 }
 }