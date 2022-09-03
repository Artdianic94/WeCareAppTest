package models.uimodels;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode
public class SignUpFormModel {
    private String name;
    private String email;
    private String phone;
    private String password;
    private String confirmPass;
    private String birthDate;
    private String specialty;
    private String document;
}
