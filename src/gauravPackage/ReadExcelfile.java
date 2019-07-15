package gauravPackage;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.utilities.Xls_Reader;

public class ReadExcelfile {

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
		
		
		Xls_Reader x=new Xls_Reader(System.getProperty("user.dir")+"\\config\\data.xlsx");
		int rcount=x.getRowCount("Sheet1");
		for(int i=2 ;i<=rcount ;i++){
		
        //Enter User name
		d.findElement(By.name("username")).sendKeys(x.getCellData("Sheet1", "newUsername", i));
		Reporter.log("Enter the user name");
		}
 }
 }