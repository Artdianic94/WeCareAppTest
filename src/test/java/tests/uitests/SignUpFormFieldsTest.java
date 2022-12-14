package tests.uitests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.RegisterPage;
import pages.SignUpFullFormPage;

public class SignUpFormFieldsTest extends BaseTest {
    @Test
    public void fieldsNameSignUpFormTest() {
        MainPage mainPage = new MainPage(driver);
        SignUpFullFormPage signUpFullFormPage = new SignUpFullFormPage(driver);
        mainPage.openMainPage();
        mainPage.switchToSignUpSignIn();
        signUpFullFormPage.openSignUpForm();
        RegisterPage registerPage = new RegisterPage(driver);
        boolean actualResult = registerPage.areAllRequiredFieldsInSignUpForm();
        Assert.assertTrue(actualResult, "Field names in the Sign Up form don't meet requirements");
    }
}
