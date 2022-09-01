package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputFields {
    WebDriver driver;
    String fieldName;
    String inputXpath = "//input[@id='%s']";

    public InputFields(WebDriver driver, String fieldName) {
        this.driver = driver;
        this.fieldName = fieldName;
    }

    public void inputText(String text) {
        inputXpath = String.format(inputXpath, fieldName);
        driver.findElement(By.xpath(inputXpath)).sendKeys(text);
    }
}
