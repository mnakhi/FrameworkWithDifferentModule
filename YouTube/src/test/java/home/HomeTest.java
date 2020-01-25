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
    public void testUserCanClickOnHamburgerMenuIcon(){
        driver.get("https://www.youtube.com/");
        HomePage hp1 = new HomePage();
        hp1.useHamburgerMenuIcon();
    }
    @Test
    public void testUserCanClickOnHome(){
        driver.get("https://www.youtube.com/");
        HomePage hp1 = new HomePage();
        hp1.clickingOnHomeButton();
    }
    @Test
    public void testUserCanClickOnTrending(){
        driver.get("https://www.youtube.com/");
        HomePage hp1 = new HomePage();
        hp1.clickingOnTrending();
    }
    @Test
    public void testUserCanGoToSignInPage(){
        driver.get("https://www.youtube.com/");
        HomePage hp1 = new HomePage();
        hp1.clickOnSignIn();
    }
    @Test
    public void testUserCanGoToSubscriptionPage(){
        driver.get("https://www.youtube.com/");
        HomePage hp1 = new HomePage();
        hp1.clickingOnSubscriptions();
    }
    @Test
    public void testUserCanGoToLibraryPage(){
        driver.get("https://www.youtube.com/");
        HomePage hp1 = new HomePage();
        hp1.clickingOnLibrary();
    }
}
