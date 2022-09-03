package testdata;

import models.uimodels.SignUpFormModel;
import utilities.GenerateFakeMessage;

public class GetSignUpFormForPatient {
    public static SignUpFormModel getSignUpFormForPatient(){
        return SignUpFormModel.builder()
                .birthDate("")
                .build();
    }
    public static SignUpFormModel getSignUpFormWithDataForPatient(){
        return SignUpFormModel.builder()
                .birthDate(GenerateFakeMessage.getAnyBirthDate())
                .build();
    }
}
