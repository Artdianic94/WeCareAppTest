package models.apimodels;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.extern.jackson.Jacksonized;


@lombok.Data
@ToString
@EqualsAndHashCode
@Jacksonized
public class AddPatientModel {
    private int id;
    private String role;
    private String email;
    private String password;
    private String name;
    private String phone;
    private String image;
    private String birthDate;

}
