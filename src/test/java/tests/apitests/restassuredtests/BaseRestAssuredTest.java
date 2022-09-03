package tests.apitests.restassuredtests;

import io.restassured.http.ContentType;
import models.apimodels.AddPatientModel;
import org.testng.annotations.Test;
import staticdata.WebUrl;
import utilities.GenerateFakeMessage;


import static io.restassured.RestAssured.given;

public class BaseRestAssuredTest {
    WebUrl webUrl = new WebUrl();

    @Test
    public void addNewPatient() {
        AddPatientModel addPatientModel = new AddPatientModel();
        addPatientModel.setRole(GenerateFakeMessage.getRolePatient());
        addPatientModel.setEmail(GenerateFakeMessage.getAnyEmail());
        addPatientModel.setPassword(GenerateFakeMessage.getAnyPassword());
        addPatientModel.setName(GenerateFakeMessage.getAnyFirstName());
        addPatientModel.setPhone(GenerateFakeMessage.getAnyPhoneNumber());
        addPatientModel.setImage(GenerateFakeMessage.getAnyLastName());
        addPatientModel.setBirthDate(GenerateFakeMessage.getBirthDateForAPI());
        given()
                .when()
                .contentType(ContentType.JSON)
                .log()
                .all()
                .and()
                .body(addPatientModel)
                .when()
                .post(webUrl.getUserApi())
                .then()
                .log()
                .all()
                .statusCode(200);
    }
}
