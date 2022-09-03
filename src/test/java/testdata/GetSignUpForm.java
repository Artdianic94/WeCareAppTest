package testdata;

import models.uimodels.SignUpFormModel;
import utilities.GenerateFakeMessage;

public class GetSignUpForm{
    public static SignUpFormModel getSignUpForm(){
        return SignUpFormModel.builder()
                .name("")
                .email("")
                .phone("")
                .password("")
                .confirmPass("")
                .build();
    }
    public static SignUpFormModel getSignUpFormWithData(){
        String password = GenerateFakeMessage.getAnyPassword();
        return SignUpFormModel.builder()
                .name(GenerateFakeMessage.getAnyFirstName()+" "+GenerateFakeMessage.getAnyLastName())
                .email(GenerateFakeMessage.getAnyEmail())
                .phone(GenerateFakeMessage.getAnyPhoneNumber())
                .password(password)
                .confirmPass(password)
                .build();
    }
}
