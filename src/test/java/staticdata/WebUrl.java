package staticdata;

public class WebUrl {
    public static final String WECAREAPP_URL = "http://testtms.s3-website-us-east-1.amazonaws.com/";
    public static final String WECAREAPI_URL = "http://ec2-18-206-246-28.compute-1.amazonaws.com";
    public static final String WECAREAPI_USER= "/user-account";
    public static final String WECAREAPI_USER_ID= "/user-account/{id}";

    public String getUserApi() {
        String userApi = WECAREAPI_URL.concat(WECAREAPI_USER);
        return userApi;
    }
    public String getUserApiWithId(){
        String userAPIWithId = WECAREAPI_URL.concat(WECAREAPI_USER_ID);
        return userAPIWithId;
    }
}
