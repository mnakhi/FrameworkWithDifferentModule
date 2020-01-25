package home;

import common.CommonAPI;
import org.testng.annotations.Test;

public class HomeTest extends CommonAPI {
    @Test
    public void testUserAbleToClickOnDropdownMenu(){
        driver.get("https://www.macys.com/");
        HomePage hm =new HomePage();
        hm.clickingOnDropdown();
    }
    @Test
    public void testUserAbleToGoToSpecificPagesBySelectingFromDropdownOption(){
        driver.get("https://www.macys.com/");
        HomePage hm = new HomePage();
        hm.clickingOnSpecificDepartment("Women");
    }
    @Test
    public void testUserCanSelectFromTopNavBar() {
        driver.get("https://www.macys.com/");
        HomePage hm = new HomePage();
        hm.clickingOnTopNavBarItem("STORES");
    }
    @Test
    public void testUserCanGoToSignInPage(){
        driver.get("https://www.macys.com/");
        HomePage hm = new HomePage();
        hm.signIn();
    }
    @Test
    public void testUserCanCheckOnNearbyStoreInformation(){
        driver.get("https://www.macys.com/");
        HomePage hm = new HomePage();
        hm.nearbyStoreInfo();
    }
    @Test
    public void testUserCanSearchUsingSearchBox() {
        driver.get("https://www.macys.com/");
        HomePage hm = new HomePage();
        hm.searchBySearchBox("Coats");

    }

}
