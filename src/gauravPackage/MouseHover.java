package gauravPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {


 public static void main(String[] args) throws InterruptedException {
	 
	 
	 System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
		WebDriver d= new FirefoxDriver();
		//Maximize window
		d.manage().window().maximize();
		//Launch the URL
		d.get("https://google.com");
		
		
        //Enter User name
		WebElement ele=d.findElement(By.xpath("//*[@id='gs_htif0']"));
		WebElement ele1=d.findElement(By.xpath("//*[@id='gs_htif0']"));
		Actions move= new Actions(d);
	 //Right Click
				move.contextClick(ele).build().perform();
		//Dobule click
//		move.doubleClick().build().perform();
		//move.dragAndDrop(ele, ele1).build().perform();
	 
	 
 }
 }