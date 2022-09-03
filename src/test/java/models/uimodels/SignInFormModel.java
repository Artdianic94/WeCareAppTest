package models.uimodels;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode
public class SignInFormModel {
    private String email;
    private String password;
}
