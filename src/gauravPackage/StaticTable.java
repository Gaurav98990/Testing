package gauravPackage;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	
	
public static void main (String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		
		WebDriver d= new ChromeDriver();
		
		//maximize window
		d.manage().window().maximize();
		
		//Launch URl
		d.get("http://demo.guru99.com/test/web-table-element.php");
		
		//No.of Columns
        @SuppressWarnings("rawtypes")
		List  col = d.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        System.out.println("No of cols are : " +col.size()); 
        //No.of rows 
        @SuppressWarnings("rawtypes")
		List  rows = d.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
        System.out.println("No of rows are : " + rows.size());
        d.close();
		
}
}