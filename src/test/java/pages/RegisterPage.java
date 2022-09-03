package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import staticdata.Locators;

import java.util.ArrayList;
import java.util.List;

public class RegisterPage extends BasePage {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public List<String> getAllFieldNamesInSignUpForm() {
        List<String> labelsOnSignUpPage = new ArrayList<>();
        List<WebElement> elementsOnSignUpPage = driver.findElements(Locators.SIGNIN_SIGNUP_LABLES);
        for (WebElement webElement : elementsOnSignUpPage) {
            labelsOnSignUpPage.add((webElement.getText()));
        }
        return labelsOnSignUpPage;
    }

    public List<String> fieldsShouldBeInSignUpForm() {
        List<String> labelsShouldBeInSignUpForm = new ArrayList<>();
        labelsShouldBeInSignUpForm.add("Name");
        labelsShouldBeInSignUpForm.add("Email");
        labelsShouldBeInSignUpForm.add("Phone");
        labelsShouldBeInSignUpForm.add("Password");
        labelsShouldBeInSignUpForm.add("Confirm your password");
        labelsShouldBeInSignUpForm.add("Choose your role:");
        labelsShouldBeInSignUpForm.add("PATIENT");
        labelsShouldBeInSignUpForm.add("DOCTOR");
        return labelsShouldBeInSignUpForm;
    }

    public boolean areAllRequiredFieldsInSignUpForm() {
        List<String> labelsOnSignUpPage = getAllFieldNamesInSignUpForm();
        List<String> labelsShouldBeInSignUpForm = fieldsShouldBeInSignUpForm();
        boolean switchLabel = true;
        for (String s : labelsShouldBeInSignUpForm) {
            switchLabel = labelsOnSignUpPage.contains(s);
        }
        return switchLabel;
    }
}
