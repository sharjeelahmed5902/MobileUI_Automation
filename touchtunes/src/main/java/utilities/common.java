package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class common extends BaseTest {

	public static void presencewait(WebDriver driver,By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static void click(WebDriver driver,By locator) {
		presencewait(driver, locator);
		driver.findElement(locator).click();;
	}
	
}
