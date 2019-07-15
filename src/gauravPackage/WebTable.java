package gauravPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String[] args) {
	      
System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		
		WebDriver d= new ChromeDriver();
		
		//maximize window
		d.manage().window().maximize();
		
		//Launch URl
		d.get("https://www.facebook.com/");
	     
		String innerText = d.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/h2"))
				.getText(); 		
			System.out.println(innerText); 
			d.quit();
	   }

	
		
	}