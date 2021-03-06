package home;

import common.CommonAPI;
import org.openqa.selenium.By;

public class HomePage extends CommonAPI {
    public void searchBuySearchButton(String name){
        driver.findElement(By.id("search")).sendKeys(name);
        driver.findElement(By.id("search-icon-legacy")).click();
    }
    public void useAppsIcon(){
        driver.findElement(By.xpath("//button[@class='style-scope yt-icon-button' and @aria-label='YouTube apps']")).click();
    }
    public void useVideoIcon(){
        driver.findElement(By.xpath("//button[@class='style-scope yt-icon-button' and @aria-label='Create a video or post']")).click();
    }
    public void useSettings(){
        driver.findElement(By.xpath("//button[@class='style-scope yt-icon-button' and @aria-label='Settings']")).click();
    }
    public void useHamburgerMenuIcon(){
        driver.findElement(By.xpath("//button[@id='button' and @aria-label='Guide']")).click();
    }
    public void clickOnSignIn(){
        driver.findElement(By.cssSelector("ytd-button-renderer[id='sign-in-button']")).click();
    }
    public void clickingOnHomeButton(){
        driver.findElement(By.cssSelector("a[title='Home']")).click();
    }
    public void clickingOnTrending(){
        driver.findElement(By.xpath("//a[@id='endpoint' and @href='/feed/trending']")).click();
    }
    public void clickingOnSubscriptions(){
        driver.findElement(By.cssSelector("a[title='Subscriptions']")).click();
    }
    public void clickingOnLibrary(){
        driver.findElement(By.cssSelector("a[title='Library']")).click();
    }
}

