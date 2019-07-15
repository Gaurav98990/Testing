package gauravPackage;
import org.junit.Before;
import org.openqa.selenium.Alert;		
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class XSLTReporting {

	WebDriver d;

	
	//System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
	
	//System.setProperty("webdriver.chrome.driver","C:\\Drivers\\geckodriver.exe");
	
	
    					

	    @BeforeMethod			
	    public void Login() 					
	    {		
	        	
	    	System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
	    	 d= new ChromeDriver();
	    	 d.manage().window().maximize();
	    	//Launching the Site.		
	         d.get("http://demo.guru99.com/V4/");
	    	//Login to Guru99 		
	         d.findElement(By.name("uid")).sendKeys("mngr209287");							
	         d.findElement(By.name("password")).sendKeys("YqahYvU");							
	         d.findElement(By.name("btnLogin")).click();					
	         //Verifying the manager home page		
	         Assert.assertEquals(d.getTitle(),"Guru99 Bank Manager HomePage" );					
	    }	
	    		
	    @Test(priority=1)			
	    public void verifytitle()					
	    {	
	    	
	        //Verifying the title of the home page		
	        Assert.assertEquals(d.getTitle(),"Guru99 Bank Manager " );					
	        }		
	    		
	    @Test(priority=2)			
	    public void Logout()					
	    {		
	        d.findElement(By.linkText("Log out")).click();					
	        Alert alert=d.switchTo().alert();			
	        alert.accept();		
	        //Verifying the title of the logout page		
	        Assert.assertEquals(d.getTitle(),"Guru99 Bank Home Page" );					
	    }		
	}	

