package tests.uitests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.SignUpFullFormPage;
import testdata.GetSignUpForm;
import testdata.GetSignUpFormForPatient;

public class SignUpFormWithoutDataTest extends BaseTest {
    @Test
    public void fillOutSignUpForm() {
        MainPage mainPage = new MainPage(driver);
        SignUpFullFormPage signUpFullFormPage = new SignUpFullFormPage(driver);
        mainPage.openMainPage();
        mainPage.switchToSignUpSignIn();
        signUpFullFormPage.openSignUpForm();
        signUpFullFormPage.fillOutMainSignUpForm(GetSignUpForm.getSignUpForm());
        signUpFullFormPage.choosePatientRole();
        signUpFullFormPage.fillOutMainSignUpFormForPatient(GetSignUpFormForPatient.getSignUpFormForPatient());
        signUpFullFormPage.saveSignUpForm();
        int actualResult = signUpFullFormPage.areAnyMessagesOnPage();
        Assert.assertEquals(actualResult, 0, "An unfilled profile has been created");
    }
}
