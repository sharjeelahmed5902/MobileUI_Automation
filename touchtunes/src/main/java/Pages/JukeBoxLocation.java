package Pages;


import org.openqa.selenium.By;

import utilities.BaseTest;
import utilities.common;

public class JukeBoxLocation extends BaseTest {

	

	public static By jukeBoxLocation = By
			.xpath("//android.widget.LinearLayout[@content-desc='Leaders']/android.widget.TextView");

	public void clickJukeBoxLocation() {
		common.click(driver, jukeBoxLocation);

	}

}

