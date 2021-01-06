package com.company;

//Lớp Constant chứa các link url gọi tới các API của 6 nhóm đã xây dựng
//Phonenumber:
//0956774556
//Password:
//tyufrt5
//UUID:
//jkafagasdga7

public class Constant {
    // 1 - nhÃ³m HÃ n Trung KiÃªn
    public static String DOMAIN_HOST_1 = "http://it4895.herokuapp.com/it4895";
    // 2 - nhÃ³m Nguyá»…n Thá»‹ Thuá»³ Dung
    public static String DOMAIN_HOST_2 = "https://luandz.cf/it4788";
    // 3 - nhÃ³m LÆ°u Quang Ä�Ã´ng
    public static String DOMAIN_HOST_3 = "https://bk-it4895.herokuapp.com/it4788";
    // 4 - nhÃ³m PhÃ¹ng Viá»‡t Duy
    public static String DOMAIN_HOST_4 = "https://hust-fb-it4895.herokuapp.com/it4788";
    // 5 - nhÃ³m Cao VÄƒn Duy
    public static String DOMAIN_HOST_5 = "https://it4895-nhom5-v2.herokuapp.com/it4788";
    // 6 - nhÃ³m LÃª XuÃ¢n Quang
    public static String DOMAIN_HOST_6 = "https://project-facebook-clone.herokuapp.com/it4788/user";

    public static Nhom1API APInhom1;
    public static Nhom2API APInhom2;
    public static Nhom3API APInhom3;
    public static Nhom4API APInhom4;
    public static Nhom5API APInhom5;
    public static Nhom6API APInhom6;

    //12 API
    /*
    SIGN_UP
    LOG_IN
    LOG_OUT
    CHANGE_PASS
    GET_VERIFY_CODE
    CHECK_VERIFY_CODE
	check_new_item
     */

    public static class Nhom1API{
        public static String SIGN_UP = DOMAIN_HOST_1 + "/signup";
        public static String LOG_IN = DOMAIN_HOST_1 + "/login";
        public static String LOG_OUT = DOMAIN_HOST_1 + "/logout";
        public static String CHANGE_PASS = DOMAIN_HOST_1 + "/change_password";
        public static String GET_VERIFY_CODE = DOMAIN_HOST_1 + "/get_verify_code";
        public static String CHECK_VERIFY_CODE = DOMAIN_HOST_1 + "/check_verify_code";
        public static String check_new_item = DOMAIN_HOST_1 + "/check_new_item";
    }

    public static class Nhom2API{
        public static String SIGN_UP = DOMAIN_HOST_2 + "/signup";
        public static String LOG_IN = DOMAIN_HOST_2 + "/login";
        public static String LOG_OUT = DOMAIN_HOST_2 + "/logout";
        public static String CHANGE_PASS = DOMAIN_HOST_2 + "/change_password";
        public static String GET_VERIFY_CODE = DOMAIN_HOST_2 + "/get_verify_code";
        public static String CHECK_VERIFY_CODE = DOMAIN_HOST_2 + "/check_verify_code";
        public static String check_new_item = DOMAIN_HOST_2 + "/check_new_item";
    }

    public static class Nhom3API{
        public static String SIGN_UP = DOMAIN_HOST_3 + "/signup";
        public static String LOG_IN = DOMAIN_HOST_3 + "/login";
        public static String LOG_OUT = DOMAIN_HOST_3 + "/logout";
        public static String CHANGE_PASS = DOMAIN_HOST_3 + "/change_password";
        public static String GET_VERIFY_CODE = DOMAIN_HOST_3 + "/get_verify_code";
        public static String CHECK_VERIFY_CODE = DOMAIN_HOST_3 + "/check_verify_code";
        public static String check_new_item = DOMAIN_HOST_3 + "/check_new_item";
    }

    public static class Nhom4API{
        public static String SIGN_UP = DOMAIN_HOST_4 + "/signup";
        public static String LOG_IN = DOMAIN_HOST_4 + "/login";
        public static String LOG_OUT = DOMAIN_HOST_4 + "/logout";
        public static String CHANGE_PASS = DOMAIN_HOST_4 + "/change_password";
        public static String GET_VERIFY_CODE = DOMAIN_HOST_4 + "/get_verify_code";
        public static String CHECK_VERIFY_CODE = DOMAIN_HOST_4 + "/check_verify_code";
        public static String check_new_item = DOMAIN_HOST_4 + "/check_new_item";
    }

    public static class Nhom5API{
        public static String SIGN_UP = DOMAIN_HOST_5 + "/signup";
        public static String LOG_IN = DOMAIN_HOST_5 + "/login";
        public static String LOG_OUT = DOMAIN_HOST_5 + "/logout";
        public static String CHANGE_PASS = DOMAIN_HOST_5 + "/change_password";
        public static String GET_VERIFY_CODE = DOMAIN_HOST_5 + "/get_verify_code";
        public static String CHECK_VERIFY_CODE = DOMAIN_HOST_5 + "/check_verify_code";
        public static String check_new_item = DOMAIN_HOST_5 + "/check_new_item";

    }

    public static class Nhom6API{
        public static String SIGN_UP = DOMAIN_HOST_6 + "/signup";
        public static String LOG_IN = DOMAIN_HOST_6 + "/login";
        public static String LOG_OUT = DOMAIN_HOST_6 + "/logout";
        public static String CHANGE_PASS = DOMAIN_HOST_6 + "/change_password";
        public static String GET_VERIFY_CODE = DOMAIN_HOST_6 + "/get_verify_code";
        public static String CHECK_VERIFY_CODE = DOMAIN_HOST_6 + "/check_verify_code";
        public static String check_new_item = DOMAIN_HOST_6 + "/check_new_item";
    }
}
