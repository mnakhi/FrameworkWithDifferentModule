package home;

import common.CommonAPI;
import org.testng.annotations.Test;

public class HomeTest extends CommonAPI {
    @Test
    public void testUserCanClickOnAppleIcon(){
        driver.get("https://www.apple.com/");
        HomePage hm = new HomePage();
        hm.clickingOnAppleIcon();
    }
    @Test
    public void testUserCanSelectParticularOption(){
        driver.get("https://www.apple.com/");
        HomePage hm = new HomePage();
        hm.selectingFromTopNavOptions("iPad");
    }
    @Test
    public void testUserCanUseSearchButton(){
        driver.get("https://www.apple.com/");
        HomePage hm = new HomePage();
        hm.searchButton("iphone");
    }
    @Test
    public void testUserCanGoForAdditionalOption(){
        driver.get("https://www.apple.com/");
        HomePage hm = new HomePage();
        hm.clickOnLinkedButton("Learn more");
    }
    @Test
    public void testUserCanCheckShoppingCart(){
        driver.get("https://www.apple.com/");
        HomePage hm = new HomePage();
        hm.clickOnShoppingCart();
    }
}
