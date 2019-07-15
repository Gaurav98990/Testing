package gauravPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		//Maximize window
		d.manage().window().maximize();
		//Launch the URL
		d.get("https://www.google.co.in/");
        //click on link
		d.findElement(By.linkText("हिन्दी")).click();					
        System.out.println("title of page is: " + d.getTitle());							
        //d.quit();
	}}
