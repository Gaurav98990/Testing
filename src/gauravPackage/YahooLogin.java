package gauravPackage;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooLogin {

	

	public static void main (String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver","C:\\Drivers\\geckodriver.exe");
		WebDriver d= new ChromeDriver();
		Logger log = Logger.getLogger("devpinoyLogger");
	     log.info("Message");
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
		d.findElement(By.id("login-passwd")).sendKeys("My@1234");
		//Click next
		d.findElement(By.name("verifyPassword")).click();
		//
		String expectedText = "Sucessfull";
		String actualText=	d.findElement(By.className("error-msg")).getText();

	if (actualText.contentEquals(expectedText)){
        //System.out.println("Test Failed");
     } else {
    	 				
         //System.out.println("Text Field Cleared");
    	 d.findElement(By.id("login-passwd")).sendKeys("May@1234");
    	 d.findElement(By.name("verifyPassword")).click();
    	 System.out.println("Test passed");
     }
		
}}
