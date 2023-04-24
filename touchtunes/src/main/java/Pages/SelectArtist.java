package Pages;


import org.openqa.selenium.By;

import utilities.BaseTest;
import utilities.common;


public class SelectArtist  extends BaseTest {

	public static By hotArtists = By.xpath(
			"//android.widget.ImageButton[@content-desc='Hot Artists']");
	
	
	
	public void clickHotArtists()
	{
		common.click(driver, hotArtists);	
	}
	
	
}

