package tests.uitests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.PrivateAccountPage;
import pages.SignInPage;
import testdata.GetSignInForm;

public class OpenPerAccAfterSignInTest extends BaseTest{
    @Test
    public void openPerAccAfterSignInTest() {
        MainPage mainPage = new MainPage(driver);
        PrivateAccountPage privateAccountPage = new PrivateAccountPage(driver);
        mainPage.openMainPage();
        mainPage.switchToSignUpSignIn();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.openSignInForm();
        signInPage.fillOutSignInForm(GetSignInForm.getSignInForm());
        signInPage.submitSignIn();
        String actualResult = privateAccountPage.openPrivateAccount();
        String expectedResult = "Profile";
        Assert.assertEquals(actualResult,expectedResult,"Personal Account hasn't opened");

    }
}
