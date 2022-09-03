package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputFields {
    WebDriver driver;
    String fieldName;
    String inputXpath = "%s";

    public InputFields(WebDriver driver, String fieldName) {
        this.driver = driver;
        this.fieldName = fieldName;
    }

    public void inputText(String text) {
        inputXpath = String.format(inputXpath, fieldName);
        driver.findElement(By.id(inputXpath)).sendKeys(text);
    }
}
