package gauravPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	WebDriver d;
	
	/**
	 * This function will execute before each Test tag in testng.xml
	 * @param browser
	 * @throws Exception
	 */
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception{
		//Check if parameter passed from TestNG is 'firefox'
		if(browser.equalsIgnoreCase("firefox")){
		//create firefox instance
			System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver.exe");
			 d= new FirefoxDriver();
			//driver = new FirefoxDriver();
		}
		//Check if parameter passed as 'chrome'
		else if(browser.equalsIgnoreCase("chrome")){
			//set path to chromedriver.exe
			System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
			//create chrome instance
			 d= new ChromeDriver();
			//driver = new ChromeDriver();
		}
		//Check if parameter passed as 'Edge'
				//else if(browser.equalsIgnoreCase("Edge")){
					//set path to Edge.exe
					//System.setProperty("webdriver.edge.driver",".\\MicrosoftWebDriver.exe");
					//create Edge instance
					//driver = new EdgeDriver();
				
		else{
			//If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
	
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void testParameterWithXML() throws InterruptedException{
		//Launch URl
				d.get("https://login.yahoo.com/");
				//Enter UserName
				d.findElement(By.id("login-username")).sendKeys("gauravisin3u@yahoo.com");
				//Click on Next Button
				d.findElement(By.id("login-signin")).click();
				Thread.sleep(1000);
				//Enter password
				d.findElement(By.id("login-passwd")).sendKeys("May@1234");
				//Click next
				d.findElement(By.name("verifyPassword")).click();
}}
