package tests.uitests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.PrivateAccountPage;
import pages.SignInPage;
import testdata.GetSignInForm;

public class LogOutTest extends BaseTest {
    @Test
    public void logOutTest() {
        MainPage mainPage = new MainPage(driver);
        PrivateAccountPage privateAccountPage = new PrivateAccountPage(driver);
        mainPage.openMainPage();
        mainPage.switchToSignUpSignIn();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.openSignInForm();
        signInPage.fillOutSignInForm(GetSignInForm.getSignInForm());
        signInPage.submitSignIn();
        privateAccountPage.logOut();
        String actualResult = mainPage.signInSignUpChoice();
        Assert.assertEquals(actualResult, "Sign Up", "User didn't log out");
    }
}
