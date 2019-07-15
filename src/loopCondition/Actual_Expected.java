package loopCondition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Actual_Expected {
	
	
	@Test
	public static void main (String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		
		System.setProperty("webdriver.firefox.marionette","C:\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

        //WebDriver driver = new ChromeDriver();
        
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";
        
     // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        
        //get the actual value of 
        actualTitle=driver.getTitle();
        
        //compare the actual title of the page with the expeted
        
        if (actualTitle.contentEquals(expectedTitle)) {
        	System.out.println("Test Passed!");
        }
        else {
        	System.out.println("Test Failed");
        }
        
        driver.close();
}}
