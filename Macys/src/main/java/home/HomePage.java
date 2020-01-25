package home;

import common.CommonAPI;
import org.openqa.selenium.By;

public class HomePage extends CommonAPI {
    public void clickingOnDropdown(){
        driver.findElement(By.id("shopByDepartmentDropdown")).click();
    }
    public void clickingOnSpecificDepartment(String department){
        driver.findElement(By.id("shopByDepartmentDropdown")).click();
        driver.findElement(By.linkText(department)).click();
    }
    public void clickingOnTopNavBarItem(String navInfo){
        driver.findElement(By.linkText(navInfo));
    }
    public void signIn(){
        driver.findElement(By.id("myRewardsLabel")).click();
    }
    public void nearbyStoreInfo(){
        driver.findElement(By.className("store-info-name")).click();
    }

    public void searchBySearchBox(String itemName){
        driver.findElement(By.id("globalSearchInputField")).sendKeys(itemName);
        driver.findElement(By.id("searchSubmit")).click();
    }
}
