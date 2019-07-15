package gauravPackage;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReadPropertiesFile {

@Test
 public static void LoginPage() throws InterruptedException, Throwable {
	 
	 
	 System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		//Maximize window
		d.manage().window().maximize();
		Reporter.log("Verify Maximize window");
		//Launch the URL
		d.get("https://login.yahoo.com");
		Reporter.log("Launch the URL");
		Thread.sleep(3000);
		
		
		// Read Properties file
		FileInputStream fis= new FileInputStream("D:\\WorkSpace\\GauravTesting\\properties\\data.properties");
		Properties prop= new Properties();
		prop.load(fis);
		
        //Enter User name
		d.findElement(By.name("username")).sendKeys(prop.getProperty("name"));
		Reporter.log("Enter the user name");
		
 }
 }