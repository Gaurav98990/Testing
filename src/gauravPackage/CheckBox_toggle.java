package gauravPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class CheckBox_toggle {

	
public static void main (String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		
		WebDriver d= new ChromeDriver();
		
		//maximize window
		d.manage().window().maximize();
		
		//Launch URl
		d.get("http://demo.guru99.com/test/radio.html");
		
		WebElement radio1 = d.findElement(By.id("vfb-7-1"));		
	
        WebElement radio2 = d.findElement(By.id("vfb-7-2"));
        
      //Radio Button1 is selected		
        radio1.click();			
        System.out.println("Radio Button Option 1 Selected");					
        		
        //Radio Button1 is de-selected and Radio Button2 is selected		
        radio2.click();			
        System.out.println("Radio Button Option 2 Selected");
}
}