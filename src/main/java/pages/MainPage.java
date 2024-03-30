package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Locators;
public class MainPage {

    private WebDriver browser;

    public MainPage(WebDriver browser){
        this.browser = browser;
    }

    public void inputSearchString(String login) {
        WebElement bookvoedMainPageBar = browser.findElement(Locators.MainPage.SEARCH_BAR);
        bookvoedMainPageBar.sendKeys(login);
    }

    public MainPage clickSearchButton() {
        WebElement searchMainPageButton = browser.findElement(Locators.MainPage.SEARCH_BAR);
        searchMainPageButton.click();
        return this;
    }
    public MainPage clickSearch() {
        WebElement searchMainPageButton = browser.findElement(Locators.MainPage.SEARCH_BUTTON);
        searchMainPageButton.click();
        return this;
    }
    public MainPage closeRegionButton() {
        try{
        WebElement RegionMainPageButton = browser.findElement(Locators.MainPage.CLOSE_REGION_BUTTON);
        RegionMainPageButton.click();
        }
        catch (Exception e){
            System.out.println("Button not found");
        }
        return this;
    }
    public MainPage closeCookiesButton() {
        try{
            WebElement RegionMainPageButton = browser.findElement(Locators.MainPage.CLOSE_COOKIES_BUTTON);
            RegionMainPageButton.click();
        }
        catch (Exception e){
            System.out.println("Button not found");
        }
        return this;
    }
    public MainPage closeLowButton() {
        try{
            WebElement RegionMainPageButton = browser.findElement(Locators.MainPage.CLOSE_LOW_BUTTON);
            RegionMainPageButton.click();
        }
        catch (Exception e){
            System.out.println("Button not found");
        }
        return this;
    }
    public AutorizationPage clickCabinetButton() {
        WebElement searchMainPageButton = browser.findElement(Locators.MainPage.CABINET_BUTTON);
        searchMainPageButton.click();
        return new AutorizationPage(browser);
    }
}