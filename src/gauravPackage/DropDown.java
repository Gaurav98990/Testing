package gauravPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	
	public static void main(String[] args) throws InterruptedException {
		 
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
			WebDriver d= new ChromeDriver();
			//Maximize window
			d.manage().window().maximize();
			//Launch the URL
			d.get("http://demo.guru99.com/test/newtours/register.php");
			//Select dropdown
			Select drpcountry= new Select(d.findElement(By.name("country")));
			drpcountry.selectByVisibleText("ANTARCTICA");
 	        //Enter User name
			//d.findElement(By.name("username")).sendKeys("gauravisin3u@yahoo.com");
			//Click on Next Button
			//d.findElement(By.id("login-signin")).click();
			//Thread.sleep(3000);
			//Enter Password
			//d.findElement(By.id("login-passwd")).sendKeys("September@1234");
			//Click on next button
			//d.findElement(By.id("login-signin")).click();
			//Click on mail icon
			//d.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/div/div[2]/div/ul/li[3]/a/span[1]")).click();
		 
		 
		 
	 }
}
