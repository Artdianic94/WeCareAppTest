package pages;

import org.openqa.selenium.WebDriver;
import staticdata.Locators;
import staticdata.WebUrl;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void openMainPage() {
        driver.get(WebUrl.WECAREAPP_URL);
    }

    public String getTheGreetingText() {
        return driver.findElement(Locators.MAIN_PAGE_INFO).getText();
    }
    public void switchToSignUpSignIn(){
        driver.findElement(Locators.MAIN_PAGE_BTN_SIGNUP_SIGNIN).click();
    }
}