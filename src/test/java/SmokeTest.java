import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AutorizationPage;
import pages.MainPage;
import pages.CartPage;


public class SmokeTest {

    private WebDriver browser;


    @Before
    public void precondition(){
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("https://www.bookvoed.ru/");
    }
    @Test
    public void checkSearchBar(){

        MainPage mainPage = new MainPage(browser);

        mainPage.closeRegionButton();

        mainPage.closeLowButton();

        mainPage.closeCookiesButton();

        mainPage.clickSearchButton();

        mainPage.inputSearchString("Ведьмак");

        mainPage.clickSearch();


    }

    @Test
    public void loginNegativeValidation(){

        final String validationErrorText = "Пожалуйста, проверьте код";

        MainPage mainPage = new MainPage(browser);
        AutorizationPage autorizationPage = mainPage.clickCabinetButton();
        String errorText = autorizationPage
                .clickActionNumberBar()
                .inputNumberString("9523091777")
                .clickCodeButton()
                .inputCodeString("12345")
                .clickContinueButton()
                .getErrorMsg();

        Assert.assertEquals(validationErrorText, errorText);
    }
    @After
    public void closeBrowser() {
        browser.quit();
    }
}
