package tests.uitests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.PrivateAccountPage;
import pages.SignUpFullFormPage;
import testdata.GetSignUpForm;
import testdata.GetSignUpFormForPatient;

public class OpenPersonalAccAfterSignUPTest extends BaseTest{
    @Test
    public void openPersonalAccountTest() {
        MainPage mainPage = new MainPage(driver);
        PrivateAccountPage privateAccountPage = new PrivateAccountPage(driver);
        SignUpFullFormPage signUpFullFormPage = new SignUpFullFormPage(driver);
        mainPage.openMainPage();
        mainPage.switchToSignUpSignIn();
        signUpFullFormPage.openSignUpForm();
        signUpFullFormPage.fillOutMainSignUpForm(GetSignUpForm.getSignUpFormWithData());
        signUpFullFormPage.choosePatientRole();
        signUpFullFormPage.fillOutMainSignUpFormForPatient(GetSignUpFormForPatient.getSignUpFormWithDataForPatient());
        signUpFullFormPage.saveSignUpForm();
        String actualResult = privateAccountPage.openPrivateAccount();
        String expectedResult = "Profile";
        Assert.assertEquals(actualResult,expectedResult,"Personal Account hasn't opened");
    }
}
