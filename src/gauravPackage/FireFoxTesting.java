package gauravPackage;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FireFoxTesting {

	
	
	
public static void main (String[] args) throws InterruptedException{
	
	WebDriver d;
	 /*DesiredCapabilities capabilities = DesiredCapabilities.firefox();
     capabilities.setCapability("acceptInsecureCerts", true);
     capabilities.setJavascriptEnabled(true);
     capabilities.setCapability("marionette", true);*/
    
     FirefoxProfile profile = new FirefoxProfile();
     Logger log = Logger.getLogger("devpinoyLogger");
     log.info("Message");
    
     System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver.exe");
     d = new FirefoxDriver(profile);
		
		
		//maximize window
		d.manage().window().maximize();
		
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
		//
		String expectedText = "Sucessfull";
		String actualText=	d.findElement(By.className("error-msg")).getText();
}}
