package tests.uitests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CalendarPage;
import pages.MainPage;
import pages.PrivateAccountPage;
import pages.SignInPage;
import testdata.GetSignInForm;

public class OpenCalendarTest extends BaseTest{
    @Test
    public void openCalendarTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        mainPage.switchToSignUpSignIn();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.openSignInForm();
        signInPage.fillOutSignInForm(GetSignInForm.getSignInForm());
        signInPage.submitSignIn();
        PrivateAccountPage privateAccountPage = new PrivateAccountPage(driver);
        privateAccountPage.openCalendar();
        CalendarPage calendarPage = new CalendarPage(driver);
        int actualResult = calendarPage.areAnyCalendarLabelsOnPage();
        Assert.assertEquals(actualResult,3,"There are no required fields in the calendar");
    }
}
