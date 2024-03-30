package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Locators;

import java.time.Duration;

public class AutorizationPage {
    private final WebDriver browser;

    public AutorizationPage(WebDriver browser) {this.browser = browser;}

    public AutorizationPage clickActionNumberBar() {
        WebDriverWait webDriverWait = new WebDriverWait(browser, Duration.ofSeconds(10));
        WebElement searchMainPageButton = webDriverWait.until(
                ExpectedConditions.visibilityOfElementLocated(Locators.AutorizationPage.ACTION_NUMBER_BAR)
        );
        searchMainPageButton.click();
        return this;
    }
    public AutorizationPage inputNumberString(String login) {
        WebDriverWait webDriverWait = new WebDriverWait(browser, Duration.ofSeconds(10));
        WebElement bookvoedLoginBar = webDriverWait.until(
                ExpectedConditions.visibilityOfElementLocated(Locators.AutorizationPage.ACTION_NUMBER_BAR)
        );
        bookvoedLoginBar.sendKeys(login);
        bookvoedLoginBar.sendKeys(Keys.RETURN);
        return this;
    }

    public AutorizationPage clickCodeButton() {
        WebDriverWait webDriverWait = new WebDriverWait(browser, Duration.ofSeconds(10));
        WebElement clickCodeButton= webDriverWait.until(
                ExpectedConditions.visibilityOfElementLocated(Locators.AutorizationPage.GET_CODE_BUTTON)
        );
        //browser.manage().timeouts().scriptTimeout(Duration.ofSeconds());
        clickCodeButton.click();
        return this;
    }
    public AutorizationPage inputCodeString(String login) {
        WebDriverWait webDriverWait = new WebDriverWait(browser, Duration.ofSeconds(10));
        WebElement bookvoedCodeBar = webDriverWait.until(
                ExpectedConditions.visibilityOfElementLocated(Locators.AutorizationPage.CODE_BAR)
        );
        bookvoedCodeBar.sendKeys(login);
        bookvoedCodeBar.sendKeys(Keys.RETURN);
        return this;
    }
    public AutorizationPage clickContinueButton() {
        WebDriverWait webDriverWait = new WebDriverWait(browser, Duration.ofSeconds(10));
        WebElement clickContinueButton= webDriverWait.until(
                ExpectedConditions.visibilityOfElementLocated(Locators.AutorizationPage.CONTINUE_BUTTON)
        );
        clickContinueButton.click();
        return this;
    }
    public boolean IsErrorMsgDisplayed(){
        WebDriverWait webDriverWait = new WebDriverWait(browser, Duration.ofSeconds(10));
        return webDriverWait.until(
                ExpectedConditions.visibilityOfElementLocated(Locators.AutorizationPage.ERROR_MSG)
        ).isDisplayed();
    }

    public String getErrorMsg(){
        WebDriverWait webDriverWait = new WebDriverWait(browser, Duration.ofSeconds(10));
        return webDriverWait.until(
                ExpectedConditions.visibilityOfElementLocated(Locators.AutorizationPage.ERROR_MSG)
        ).getText();
    }

}
