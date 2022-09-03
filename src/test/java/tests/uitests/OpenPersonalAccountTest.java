package tests.uitests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.SignUpFullFormPage;
import testdata.GetSignUpForm;
import testdata.GetSignUpFormForPatient;

public class OpenPersonalAccountTest extends BaseTest{
    @Test
    public void openPersonalAccountTest() {
        MainPage mainPage = new MainPage(driver);
        SignUpFullFormPage signUpFullFormPage = new SignUpFullFormPage(driver);
        mainPage.openMainPage();
        mainPage.switchToSignUpSignIn();
        signUpFullFormPage.openSignUpForm();
        signUpFullFormPage.fillOutMainSignUpForm(GetSignUpForm.getSignUpFormWithData());
        signUpFullFormPage.choosePatientRole();
        signUpFullFormPage.fillOutMainSignUpFormForPatient(GetSignUpFormForPatient.getSignUpFormWithDataForPatient());
        signUpFullFormPage.saveSignUpForm();
        Assert.assertEquals(1,4,"");
    }
}
