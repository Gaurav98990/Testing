package loopCondition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class If_else_condition {

public static void main(String[] args) throws InterruptedException{
	

	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	//Maximize window
	d.manage().window().maximize();
	//Launch the URL
	d.get("https://login.yahoo.com");

	//Enter User name
	d.findElement(By.name("username")).sendKeys("gauravisin4u@yahoo.com");
	//Click on Next Button
	d.findElement(By.id("login-signin")).click();
	Thread.sleep(3000);
	String expectedText ="Sorry, we don't recognize this email.";
		String actualText=	d.findElement(By.id("username-error")).getText();

	if (actualText.contentEquals(expectedText)){
        System.out.println("Test Passed!");
     } else {
        System.out.println("Test Failed");
     }	
//	Thread.sleep(3000);
//	//Enter Password
//	d.findElement(By.id("login-passwd")).sendKeys("September@1234");
//	
//	//Click on next button
//	d.findElement(By.id("login-signin")).click();
//
//	//Click on mail icon
//	d.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/div/div[2]/div/ul/li[3]/a/span[1]")).click();
//	

}}	
	
	

	
	
	
	
	
	
