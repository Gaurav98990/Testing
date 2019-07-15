package gauravPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Image {

	
public static void main (String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		
		WebDriver d= new ChromeDriver();
		
		//maximize window
		d.manage().window().maximize();
		
		//Launch URl
		d.get("https://www.facebook.com/login/identify?ctx=recover");
		d.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]")).click();	
		//verify that we are now back on Facebook's homepage		
		if (d.getTitle().equals("Facebook - log in or sign up")) {							
        System.out.println("We are back at Facebook's homepage");					
    } else {			
        System.out.println("We are NOT in Facebook's homepage");
	
}
}}