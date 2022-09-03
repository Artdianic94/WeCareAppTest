package testdata;

import models.uimodels.SignInFormModel;
import utilities.GenerateFakeMessage;

public class GetSignInForm {
    public static SignInFormModel getSignInForm(){
        return SignInFormModel.builder()
                .email(GenerateFakeMessage.getSpecialEmail())
                .password(GenerateFakeMessage.getSpecialPassword())
                .build();
    }
}
