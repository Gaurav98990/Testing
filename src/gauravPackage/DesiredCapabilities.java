package gauravPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities {

	public static void main(String[] args) {
		
		WebDriver d;
		 DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	     capabilities.setCapability("acceptInsecureCerts", true);
	     capabilities.setJavascriptEnabled(true);
	     capabilities.setCapability("marionette", true);
    
	     FirefoxProfile profile = new FirefoxProfile();
    
     System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver.exe");
	}
}
