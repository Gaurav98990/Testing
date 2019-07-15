package gauravPackage;

import java.io.File;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


import org.testng.annotations.Test;

public class ScreenShot {
	{
	
	WebDriver driver ;
	System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
	driver = new FirefoxDriver();

    //goto url

    driver.get("http://demo.guru99.com/V4/");

    //Call take screenshot function

    try {
		ScreenShot.takeSnapShot(driver, "c://test.png") ;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}     

}

/**

 * This function will take screenshot

 * @param webdriver

 * @param fileWithPath

 * @throws Exception

 */
	@Test
public static void  takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

    //Convert web driver object to TakeScreenshot

    TakesScreenshot scrShot =((TakesScreenshot)webdriver);

    //Call getScreenshotAs method to create image file

            File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

            File DestFile=new File(fileWithPath);

            //Copy file at destination

            FileUtils.copyFile(SrcFile, DestFile);

}

}

