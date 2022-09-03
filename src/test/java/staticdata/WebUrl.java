package staticdata;

public class WebUrl {
    public static final String WECAREAPP_URL = "http://testtms.s3-website-us-east-1.amazonaws.com/";
    public static final String WECAREAPI_URL = "http://ec2-18-206-246-28.compute-1.amazonaws.com";
    public static final String WECAREAPI_USER= "/user-account";
    public static final String WECAREAPI_PATIENT_ID = "/user-account/patient/{id}";

    public String getUserApi() {
        String patientApi = WECAREAPI_URL.concat(WECAREAPI_USER);
        return patientApi;
    }

    public String getWecareapiUrl() {
        return WECAREAPI_URL;
    }
}
