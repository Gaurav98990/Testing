package gauravPackage;
	
	import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameterizatio_Mohit2 {
	WebDriver d;
@Test(dataProvider="getregdata")

public void yahooRegistrationtest(String user, String pwd, String email) throws InterruptedException{
	 System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		d= new ChromeDriver();
		//Maximize window
		d.manage().window().maximize();
    d.get("https://www.gmail.com");
    d.findElement(By.xpath("//*[@id='view_container']/div/div/div[2]/div/div/div[2]/div/div/content/span")).click();
    
    d.findElement(By.name("firstName")).sendKeys(user);
    Thread.sleep(1000);
    d.findElement(By.name("Username")).sendKeys(email);
    Thread.sleep(1000);
    d.findElement(By.name("Passwd")).sendKeys(pwd);
    Thread.sleep(1000);
    

System.out.println(user +" "+ pwd + " "+ email);

}

// Rows--Number of times your test has to be repeated
// Column-- Number of parameters in test data

@DataProvider(name="getregdata")

public Object [][] getregdata(){

Object [][] data=new Object[2][3];

data[0][0]="user1";
data[0][1]="pwd1";
data[0][2]="email1";

data[1][0]="user2";
data[1][1]="pwd2";
data[1][2]="email2";


return data;
}

}

