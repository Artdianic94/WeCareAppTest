package staticdata;

public class WebUrl {
    public static final String WECAREAPP_URL = "http://testtms.s3-website-us-east-1.amazonaws.com/";
    public static final String WECAREAPI_URL = "http://ec2-18-206-246-28.compute-1.amazonaws.com/";
    public static final String WECAREAPI_PATIENT = "user-account/patient";
    public static final String WECAREAPI_DOCTOR = "user-account/doctor";
    public static final String WECAREAPI_PATIENT_ID = "user-account/patient/{id}";

    public String getPatientApi() {
        String patientApi = WECAREAPI_URL.concat(WECAREAPI_PATIENT);
        return patientApi;
    }
    public String getDoctorApi (){
        String doctorApi = WECAREAPI_URL.concat(WECAREAPI_DOCTOR);
        return doctorApi;
    }

    public String getWecareapiUrl() {
        return WECAREAPI_URL;
    }
}
