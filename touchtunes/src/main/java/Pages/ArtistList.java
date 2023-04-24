package Pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.BaseTest;


public class ArtistList  extends BaseTest {


	public static By veritcalArtist = By.xpath(
			"//android.widget.list[@content-desc='Hot Artists']");
	
	public static By horizontalArtist = By.xpath(
			"//android.widget.horizontalArtist[@content-desc='Hot Artists']");
	
	
	
	public List<WebElement> getVerticalList()
	{
		List<WebElement> ele=driver.findElements(veritcalArtist);
		
		return ele;
	
	}
	public List<WebElement> getHorizontalList()
	{
		List<WebElement> ele=driver.findElements(horizontalArtist);
		return ele;
	
	}
	
	
}

