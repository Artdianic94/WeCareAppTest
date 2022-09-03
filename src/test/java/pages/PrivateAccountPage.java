package pages;

import org.openqa.selenium.WebDriver;
import staticdata.Locators;

public class PrivateAccountPage extends BasePage {
    public PrivateAccountPage(WebDriver driver) {
        super(driver);
    }

    public String openPrivateAccount() {
        return driver.findElement(Locators.PROFILE_LABEL).getText();
    }

    public void openCalendar() {
        driver.findElement(Locators.CALENDAR_BTN).click();
    }

    public void logOut() {
        driver.findElement(Locators.LOG_OUT_BTN).click();
    }
}
