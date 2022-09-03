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
        return "diart@yopmail.com";
    }

    public static String getAnyPhoneNumber() {
        return "+375293555555";
    }
    public static String getRolePatient(){
        return "PATIENT";
    }
    public static String getRoleDoctor(){return "DOCTOR";}
    public static String getAnyPassword(){
        return "12345";
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
        return "20071994";
    }
    public static String getBirthDateForAPI(){
        return "2022-09-03";
    }
}
