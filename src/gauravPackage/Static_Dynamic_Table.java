package gauravPackage;

import java.text.NumberFormat;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import bsh.ParseException;

public class Static_Dynamic_Table {

	public static void main(String[] args) throws  Throwable {
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		 d.get("http://money.rediff.com/gainers/bsc/daily/groupa?"); 
		 String max;
	     double m=0,r=0;
		 
	       //No. of Columns
	        List  col = d.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
	        System.out.println("Total No of columns are : " +col.size());
	        //No.of rows
	        List  rows = d.findElements(By.xpath (".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
	        System.out.println("Total No of rows are : " + rows.size());
	        for (int i =2;i<rows.size();i++)
	        {    
	            max= d.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr[" + (i)+ "]/td[4]")).getText();
	            NumberFormat f =NumberFormat.getNumberInstance(); 
	            Number num = f.parse(max);
	            max = num.toString();
	            m = Double.parseDouble(max);
	            if(m>r)
	             {    
	                r=m;
	             }
	        }
	        System.out.println("Maximum current price is : "+ r);
    }
}

