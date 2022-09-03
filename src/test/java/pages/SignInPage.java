package pages;

import elements.InputFields;
import models.uimodels.SignInFormModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import staticdata.Locators;

import java.util.ArrayList;
import java.util.List;

public class SignInPage extends BasePage {
    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void openSignInForm() {
        driver.findElement(Locators.SIGN_IN_FORM_BTN).click();
    }

    public List<String> getAllFieldNamesInSignInForm() {
        List<String> labelsOnSignInPage = new ArrayList<>();
        List<WebElement> elementsOnSignInPage = driver.findElements(Locators.SIGNIN_SIGNUP_LABLES);
        for (WebElement webElement : elementsOnSignInPage) {
            labelsOnSignInPage.add((webElement.getText()));
        }
        return labelsOnSignInPage;
    }

    public List<String> fieldsShouldBeInSignInForm() {
        List<String> labelsShouldBeInForm = new ArrayList<>();
        labelsShouldBeInForm.add("Email");
        labelsShouldBeInForm.add("Password");
        return labelsShouldBeInForm;
    }

    public boolean areAllRequiredFieldsInSignInForm() {
        List<String> labelsOnSignInPage = getAllFieldNamesInSignInForm();
        List<String> labelsShouldBeInForm = fieldsShouldBeInSignInForm();
        boolean switchLabel = false;
        for (String s : labelsShouldBeInForm) {
            switchLabel = labelsOnSignInPage.contains(s);
        }
        return switchLabel;
    }

    public void fillOutSignInForm(SignInFormModel signInFormModel) {
        new InputFields(driver, Locators.SIGN_IN_EMAIL_INPUT).inputText(signInFormModel.getEmail());
        new InputFields(driver, Locators.SIGN_IN_PASSWORD_INPUT).inputText(signInFormModel.getPassword());
    }

    public void submitSignIn() {
        driver.findElement(Locators.SAVE_SIGN_UP_BTN).click();
    }
}
