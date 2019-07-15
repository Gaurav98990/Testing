package gauravPackage;
	
	import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	public class Parameterizatio_Mohit {
	   WebDriver d;
	   @Test(dataProvider="regdata")
	   
	   public void doSearch(String Search) throws InterruptedException {
	       
		   System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
			d= new ChromeDriver();
			//Maximize window
			d.manage().window().maximize();
	       d.get("https://www.google.co.in");
	       d.findElement(By.name("q")).sendKeys(Search);
	       Thread.sleep(3000);
	       d.findElement(By.name("q")).sendKeys(Keys.ENTER);
	       Thread.sleep(500);
	       d.navigate().back();
	       
	   }
	   
	   
	   @DataProvider
	   
	   public Object[][] regdata(){
	       
	       Object[][] data =new Object [5][1];
	       data[0][0]="Java";
	       data[1][0]="Python";
	       data[2][0]="ANT";
	       data[3][0]="SELENIUM";
	       data[4][0]="MICROSOFT";
	       
	       return data;
	       
	   }
	   	
	   @AfterMethod
	   public void CloseBrowser(){
	      d.close(); 
	   }
	}

