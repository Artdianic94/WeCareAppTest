package tests.uitests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.SignInPage;

public class SignInFormFieldsTest extends BaseTest {
    @Test
    public void fieldsNameSignInFormTest() {
        MainPage mainPage = new MainPage(driver);
        SignInPage signInPage = new SignInPage(driver);
        mainPage.openMainPage();
        mainPage.switchToSignUpSignIn();
        signInPage.openSignInForm();
        boolean actualResult = signInPage.areAllRequiredFieldsInSignInForm();
        Assert.assertTrue(actualResult, "Field names in the Sign In form don't meet requirements");
    }
}
