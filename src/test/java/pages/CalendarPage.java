package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import staticdata.Locators;

import java.util.ArrayList;
import java.util.List;

public class CalendarPage extends BasePage {
    public CalendarPage(WebDriver driver) {
        super(driver);
    }

    public List<String> getCalendarLabelsOnPage() {
        List<WebElement> calendarLabelsElements = driver.findElements(Locators.CALENDAR_LABELS);
        List<String> calendarLabelsList = new ArrayList<>();
        for (WebElement calendarLabelsElement : calendarLabelsElements) {
            calendarLabelsList.add(calendarLabelsElement.getText());
        }
        return calendarLabelsList;
    }

    public List<String> requiredCalendarLabels() {
        List<String> requiredCalendarLabelsList = new ArrayList<>();
        requiredCalendarLabelsList.add("Enter working hours start");
        requiredCalendarLabelsList.add("Enter working hours end");
        requiredCalendarLabelsList.add("Enter duration of visit in minutes");
        return requiredCalendarLabelsList;
    }

    public int areAnyCalendarLabelsOnPage() {
        int i = 0;
        List<String> requiredCalendarLabelsList = requiredCalendarLabels();
        List<String> calendarLabelsOnPage = getCalendarLabelsOnPage();
        for (String s : requiredCalendarLabelsList) {
            if (calendarLabelsOnPage.contains(s)) {
                i++;
            }
        }
        return i;
    }
}
