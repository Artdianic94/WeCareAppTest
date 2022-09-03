package models.apimodels;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@lombok.Data
@ToString
@EqualsAndHashCode
@Jacksonized
public class AddPatientModel {
    private int id;
    private String firstName;
    private String lastName;
    private List<Phones> phones;
    private String role;
    private String email;
    private String password;
}
