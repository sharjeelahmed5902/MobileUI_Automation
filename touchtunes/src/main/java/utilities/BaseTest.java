package utilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;

public class BaseTest {
    protected WebDriver driver;
   
	public void setUp() throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("VERSION", "12.0");
		capabilities.setCapability("deviceName", "vivo");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.touchtunes.android");
		capabilities.setCapability("appActivity", "ui.MainActivity");
		capabilities.setCapability("setNativeWebScreenshot", true);

		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}
   
   
    
    @AfterClass
	public void teardown() {
		// close the app
		driver.quit();
	}
}
