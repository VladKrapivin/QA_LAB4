package utils;

import org.openqa.selenium.By;
public interface Locators {

    public interface MainPage{

        By SEARCH_BAR = By.xpath("//*[@id=\"searchBar\"]/div/div[1]/input[2]");
        By CLOSE_REGION_BUTTON = By.xpath("//*[@id=\"cityDetect\"]/div/div/div[2]");
        By CLOSE_COOKIES_BUTTON = By.xpath("//*[@id=\"popmechanic-form-81024\"]/div[2]");
        By CLOSE_LOW_BUTTON = By.xpath("//*[@id=\"cookieNoticeUser\"]/div[2]/a");
        By SEARCH_BUTTON = By.xpath("//*[@id=\"searchBar\"]/div/button[2]");
        By CABINET_BUTTON = By.xpath("//*[@id=\"h_cab\"]/a");
    }

    public interface AutorizationPage {

        By ACTION_NUMBER_BAR = By.xpath("//*[@id=\"bottom_action-bac-phone_auth_form-phone-input\"]");
        By GET_CODE_BUTTON = By.xpath("//*[@data-gtm=\"fa_button_submit\"]");
        By CODE_BAR = By.xpath("//*[@id=\"bottom_action-bac-phone_auth_form-code-input\"]");
        By CONTINUE_BUTTON = By.xpath("//*[@id=\"bottom_action-bac-phone_auth_form\"]/form/div[4]");
        By ERROR_MSG = By.xpath("//*[@id=\"bottom_action-bac-phone_auth_form-code\"]/p");
    }
}