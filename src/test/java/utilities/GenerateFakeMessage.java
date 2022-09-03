package utilities;

import com.github.javafaker.Faker;

public class GenerateFakeMessage {
    public static String getAnyFirstName() {
        Faker faker = new Faker();
        return faker.name().firstName();
    }
    public static String getAnyLastName() {
        Faker faker = new Faker();
        return faker.name().lastName();
    }
    public static String getAnyEmail() {
        Faker faker = new Faker();
        return faker.internet().emailAddress();
    }
    public static int getAnyId() {
        Faker faker = new Faker();
        return faker.number().numberBetween(0,1000);
    }
    public static String getAnyPhoneNumber() {
        Faker faker = new Faker();
        return faker.phoneNumber().subscriberNumber(10);
    }
    public static String getRolePatient(){
        return "PATIENT";
    }
    public static String getAnyPassword(){
        Faker faker = new Faker();
        return faker.internet().password(5,10);
    }
    public static String getDoctorSpeciality(){
        Faker faker = new Faker();
        return faker.job().field();
    }
    public static String getAnyDocNumber(){
        Faker faker = new Faker();
        return faker.internet().password(5,10);
    }
    public static String getAnyBirthDate(){
        Faker faker = new Faker();
        return faker.date().toString();
    }
}
