package tests.uitests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class GreetingTest extends BaseTest {
    @Test
    public void greetingTextIsExistTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        String actualGreetingText = mainPage.getTheGreetingText();
        String expectedGreetingText = "We really are care about you health!";
        Assert.assertEquals(actualGreetingText, expectedGreetingText, "The requirement for the greeting has not been met");
    }
}
