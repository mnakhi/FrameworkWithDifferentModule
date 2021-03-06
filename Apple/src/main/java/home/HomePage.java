package home;

import common.CommonAPI;
import org.openqa.selenium.By;

public class HomePage extends CommonAPI {
    public void clickingOnAppleIcon(){
        driver.findElement(By.id("ac-gn-firstfocus")).click();
    }
    public void selectingFromTopNavOptions(String name){
        driver.findElement(By.linkText(name)).click();
    }
    public void searchButton(String name){
        driver.findElement(By.id("ac-gn-link-search")).click();
        driver.findElement(By.id("ac-gn-searchform-input")).sendKeys(name);
        driver.findElement(By.cssSelector("button[id='ac-gn-searchform-submit']")).click();
    }
    public void clickOnLinkedButton(String name){
        driver.findElement(By.linkText(name)).click();
    }
    public void clickOnShoppingCart(){
        driver.findElement(By.xpath("//*[@id=\"ac-gn-bag-small\"]/div/a")).click();
    }
}
