package touchTunes_Main_Components;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Pages.ArtistList;
import Pages.HomePage;
import Pages.JukeBoxLocation;
import Pages.SelectArtist;
import utilities.common;

public class TouchTunes {

	common com = new common();

	ArtistList artistList = new ArtistList();
	HomePage home = new HomePage();
	JukeBoxLocation jukebox = new JukeBoxLocation();
	SelectArtist selectArtist = new SelectArtist();

	@Test
	public void testCal() throws Exception {
		try {

			Thread.sleep(10000);
			jukebox.clickJukeBoxLocation();
			home.clickHotAtJukeBox();
			selectArtist.clickHotArtists();
			List<WebElement> artistshorizontal = artistList.getHorizontalList();
			List<WebElement> artistvertical = artistList.getVerticalList();
			int count = 0;
			for (int i = 0; i < artistshorizontal.size(); i++) {
				if (artistshorizontal.get(i).getText().equals(artistvertical.get(i).getText())) {
					count++;
				}
			}
			if (count == artistshorizontal.size()) {
				System.out.println("Verify that the artists displayed on this page are aligned with the artists "
						+ "displayed at “HOT AT <jukebox name>” vertical list of the home page.");
			} else {
				System.out.println("Verify that the artists is not displayed on this page are aligned with the artists "
						+ "displayed at “HOT AT <jukebox name>” vertical list of the home page.");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
