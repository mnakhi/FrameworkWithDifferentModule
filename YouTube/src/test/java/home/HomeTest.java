package home;

import common.CommonAPI;
import org.testng.annotations.Test;

public class HomeTest extends CommonAPI {
    @Test
   public void testUserCanSearchUsingSearchBox() {
       driver.get("https://www.youtube.com/");
       HomePage hp = new HomePage();
       hp.searchBuySearchButton("Passenger song");
   }
   @Test
   public void testUserCanClickOnYouTubeAppsIcon() {
       driver.get("https://www.youtube.com/");
       HomePage hp1 = new HomePage();
       hp1.useAppsIcon();
   }
    @Test
    public void testUserCanClickOnYouTubeVideoIcon(){
        driver.get("https://www.youtube.com/");
        HomePage hp1 = new HomePage();
        hp1.useVideoIcon();
    }
    @Test
    public void testUserCanClickOnYouTubeSettings(){
        driver.get("https://www.youtube.com/");
        HomePage hp1 = new HomePage();
        hp1.useSettings();
    }
    @Test
    public void testUserCanClickOn(){
        driver.get("https://www.youtube.com/");
        HomePage hp1 = new HomePage();
        hp1.useHamburgerMenuIcon();
    }
}
