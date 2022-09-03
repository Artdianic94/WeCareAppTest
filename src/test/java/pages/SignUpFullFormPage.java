package pages;

import elements.InputFields;
import models.uimodels.SignUpFormModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import staticdata.Locators;

import java.util.ArrayList;
import java.util.List;

public class SignUpFullFormPage extends BasePage{
    public SignUpFullFormPage(WebDriver driver) {
        super(driver);
    }
    public void openSignUpForm(){
        driver.findElement(Locators.SIGN_UP_FORM_BTN).click();
    }
    public void fillOutMainSignUpForm(SignUpFormModel signUpFormModel){
        new InputFields(driver, Locators.SIGN_UP_NAME_INPUT).inputText(signUpFormModel.getName());
        new InputFields(driver,Locators.SIGN_UP_EMAIL_INPUT).inputText(signUpFormModel.getEmail());
        new InputFields(driver,Locators.SIGN_UP_PHONE_INPUT).inputText(signUpFormModel.getPhone());
        new InputFields(driver,Locators.SIGN_UP_PASSWORD_INPUT).inputText(signUpFormModel.getPassword());
        new InputFields(driver,Locators.SIGN_UP_CONFIRM_PASS_INPUT).inputText(signUpFormModel.getConfirmPass());
    }

    public void choosePatientRole(){
        driver.findElement(Locators.SIGN_UP_ROLE_PATIENT_INPUT).click();
    }
    public void chooseDoctorRole(){
        driver.findElement(Locators.SIGN_UP_ROLE_DOCTOR_INPUT).click();
    }
    public void fillOutMainSignUpFormForPatient(SignUpFormModel signUpFormModel){
        new InputFields(driver,Locators.SIGN_UP_PATIENT_BIRTHDATE_INPUT).inputText(signUpFormModel.getBirthDate());
    }
    public void fillOutMainSignUpFormForDoctor(SignUpFormModel signUpFormModel){
        new InputFields(driver,Locators.SIGN_UP_DOCTOR_SPECIALTY_INPUT).inputText(signUpFormModel.getSpecialty());
        new InputFields(driver,Locators.SIGN_UP_DOCTOR_DOCUMENT_INPUT).inputText(signUpFormModel.getDocument());
    }
    public void saveSignUpForm(){
        driver.findElement(Locators.SAVE_SIGN_UP_BTN).click();
    }
    public List<String> getAllRedMessagesFromPage(){
        List<WebElement> redMessagesElements = driver.findElements(Locators.RED_MESSAGES);
        List<String> redMessagesList= new ArrayList<>();
        for (WebElement redMessagesElement : redMessagesElements) {
            redMessagesList.add(redMessagesElement.getText());
        }
        return redMessagesList;
    }
    public List<String> possibleRedMessages(){
        List<String> possibleRedMessagesList = new ArrayList<>();
        possibleRedMessagesList.add("Please enter your first and last name");
        possibleRedMessagesList.add("Please enter your email");
        possibleRedMessagesList.add("Invalid phone number");
        possibleRedMessagesList.add("Please enter your password");
        possibleRedMessagesList.add("Please enter your password");
        return possibleRedMessagesList;
    }
    public int areAnyMessagesOnPage(){
        int i=0;
        List<String> possibleRedMessagesList = possibleRedMessages();
        List<String> redMessagesList = getAllRedMessagesFromPage();
        for (int k=0;k<possibleRedMessagesList.size();k++){
            if(!redMessagesList.contains(redMessagesList.get(k))){
                i++;
            }
        }
        return i;
    }
}
