package testdata;

import models.uimodels.SignUpFormModel;
import utilities.GenerateFakeMessage;

public class GetSignUpFormForDoctor {
    public static SignUpFormModel getSignUpFormForDoctor(){
        return SignUpFormModel.builder()
                .specialty("")
                .document("")
                .build();
    }
    public static SignUpFormModel getSignUpFormWithDataForDoctor(){
        return SignUpFormModel.builder()
                .specialty(GenerateFakeMessage.getDoctorSpeciality())
                .document(GenerateFakeMessage.getAnyDocNumber())
                .build();
    }
}
