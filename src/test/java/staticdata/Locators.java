package staticdata;

import org.openqa.selenium.By;

public class Locators {
    public static final By MAIN_PAGE_INFO = By.xpath("//main/div/h1");
    public static final By MAIN_PAGE_BTN_SIGNUP_SIGNIN = By.xpath("//main/div/button");
    public static final By SIGNIN_SIGNUP_LABLES = By.xpath("//label");
    public static final By SIGN_UP_FORM_BTN = By.xpath("//h3[contains(.,'Up' )]");
    public static final String SIGN_UP_NAME_INPUT = "name";
    public static final String SIGN_UP_EMAIL_INPUT = "email";
    public static final String SIGN_UP_PHONE_INPUT = "phone";
    public static final String SIGN_UP_PASSWORD_INPUT = "password";
    public static final String SIGN_UP_CONFIRM_PASS_INPUT = "confirm";
    public static final By SIGN_UP_ROLE_PATIENT_INPUT = By.xpath("//label[contains(.,'PATIENT')]");
    public static final By SIGN_UP_ROLE_DOCTOR_INPUT = By.xpath("//label[contains(.,'DOCTOR')]");
    public static final String SIGN_UP_PATIENT_BIRTHDATE_INPUT = "birthDate";
    public static final String SIGN_UP_DOCTOR_SPECIALTY_INPUT = "specialty";
    public static final String SIGN_UP_DOCTOR_DOCUMENT_INPUT = "document";
    public static final By SAVE_SIGN_UP_BTN = By.xpath("//button[contains(.,'Su' )]");
    public static final By RED_MESSAGES = By.xpath("//p");
    public static final By SIGN_IN_FORM_BTN = By.xpath("//h3[contains(.,'In')]");
    public static final By PROFILE_LABEL = By.xpath("//h1[contains(.,'Profile')]");
    public static final String SIGN_IN_EMAIL_INPUT = "email";
    public static final String SIGN_IN_PASSWORD_INPUT = "password";
    public static final By CALENDAR_BTN = By.xpath("//a[contains(.,'Calendar' )]");
    public static final By CALENDAR_LABELS = By.xpath("//label");
    public static final By LOG_OUT_BTN =By.xpath("//button[contains(.,'SignOut')]");
    public static final By LOG_UP_CHOICE = By.xpath("//h3[contains(.,'Up')]");
}
