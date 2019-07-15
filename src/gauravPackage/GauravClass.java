package gauravPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GauravClass {


 public static void main(String[] args) throws InterruptedException {
	 	
	 
	 System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		//Maximize window
		d.manage().window().maximize();
		//Launch the URL
		d.get("http://gmail.com");
        //Enter User name
		d.findElement(By.id("identifierId")).sendKeys("gauravisin3u@yahoo.com");
		//Click on Next Button
		d.findElement(By.id("login-signin")).click();
		Thread.sleep(1000);
		//Enter Password
		d.findElement(By.id("login-passwd")).sendKeys("September@1234");
		//Click on next button
		d.findElement(By.id("login-signin")).click();
		//Click on mail icon
		d.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/div/div[2]/div/ul/li[3]/a/span[1]")).click();
	 
	 
	 
 }
 }