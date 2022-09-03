package tests.apitests.restassuredtests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import models.apimodels.AddPatientModel;
import models.apimodels.Phones;
import org.apache.log4j.Level;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import staticdata.MyData;
import staticdata.WebUrl;
import utilities.GenerateFakeMessage;


import java.util.Base64;
import java.util.List;

import static io.restassured.RestAssured.given;

public class BaseRestAssuredTest {
    WebUrl webUrl = new WebUrl();
    MyData myData = new MyData();

    @Test
    public void addNewPatient() {
        String encoding = Base64.getEncoder().encodeToString((myData.getEmail() + ":" + myData.getPassword()).getBytes());
        AddPatientModel addPatientModel = new AddPatientModel();
        Phones phones = new Phones();
        phones.setNumber(GenerateFakeMessage.getAnyPhoneNumber());
        addPatientModel.setFirstName(GenerateFakeMessage.getAnyFirstName());
        addPatientModel.setLastName(GenerateFakeMessage.getAnyLastName());
        addPatientModel.setPhones(List.of(phones));
        addPatientModel.setRole(GenerateFakeMessage.getRolePatient());
        addPatientModel.setEmail(GenerateFakeMessage.getAnyEmail());
        addPatientModel.setPassword(GenerateFakeMessage.getAnyPassword());
        given()
                .when()
                .formParam("email", myData.getEmail())
                .formParam("password", myData.getPassword())
                .post(webUrl.getWecareapiUrl())
                .then()
                .log()
                .all()
                .statusCode(200);
        given()
                .header("Authorization", "Basic " + encoding)
                .when()
                .contentType(ContentType.JSON)
                .log()
                .all()
                .and()
                .body(addPatientModel)
                .when()
                .post(webUrl.getPatientApi())
                .then()
                .log()
                .all()
                .statusCode(200);
    }

//    @Test
//    public void deletePatient()  {
//
//    }
}
