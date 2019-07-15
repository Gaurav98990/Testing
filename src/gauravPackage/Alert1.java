package gauravPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.NoAlertPresentException;


public class Alert1 {

	public static void main(String[] args) throws InterruptedException {
	 	
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
			WebDriver d= new ChromeDriver();
			//Maximize window
			d.manage().window().maximize();
			//d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//Launch the URL
			d.get("http://demo.guru99.com/test/delete_customer.php");
			//Thread.sleep(500);
			d.findElement(By.name("cusid")).sendKeys("53920");					
	        d.findElement(By.name("submit")).submit();			
	        		
	        // Switching to Alert        
	       Alert alert = d.switchTo().alert();
	       		
	        		
	        // Capturing alert message.    
	       String alertMessage= alert.getText();		
	        		
	        // Displaying alert message		
	       System.out.println(alertMessage);	
	       Thread.sleep(500);
	        		
	        // Accepting alert		
	       alert.accept();		
	    }	


}
