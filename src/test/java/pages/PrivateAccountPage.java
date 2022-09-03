package pages;

import org.openqa.selenium.WebDriver;
import staticdata.Locators;

public class PrivateAccountPage extends BasePage{
    public PrivateAccountPage(WebDriver driver) {
        super(driver);
    }
    public String openPrivateAccount(){
        return driver.findElement(Locators.PROFILE_LABEL).getText();
    }
}
