package com.company;

//params test cho get_verify_code, check_verify_code, login, logout,changepass
//phonenumber = 0145667889
//password = thankbut2
//uuid = c8fa4694-40c5-11eb-b378-0242ac130002
//Phonenumber:
//0167889564
//Password:
//tyuioef2
//UUID:
//75e797e6-4655-11eb-b378-0242ac130002
//Phonenumber:
//0156774338
//Password:
//tgfyuhg6
//UUID:
//75e797e6-4655-11eb-b378-0242ac130002

public class TestAPItudong {
    public static void giaodientudong() throws Exception {
        System.out.println("Chào mừng tới test tự động");
        String url = ChonHost.HOST(); //Lấy link url của Host và API đã được chọn
        System.out.println(url);
        if (url.contains("signup")) {
            System.out.println(url); //kiểm tra lại link url
            System.out.println("Đăng ký tài khoản");
            Input.SignUp.nhap();
            TestCaseSignUp.Unittest1(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, url);
            TestCaseSignUp.Unittest2(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, url);
            TestCaseSignUp.Unittest3("987654321", "1234567", "019d4ad6-4077-11eb-b378-0242ac130002", url);
            TestCaseSignUp.Unittest4("0972112000", "0", "f6dad910-4076-11eb-b378-0242ac130002", url);
            TestCaseSignUp.Unittest5("", "", "", url);
        }else if(url.contains("check_new_item")) {
        	System.out.println(url); //kiểm tra lại link url
            System.out.println("Check new item");
            Input.CheckNewItems.nhap();
            TestCaseChecknewitems.Unittest1(Input.CheckNewItems.last_id, Input.CheckNewItems.category_id, url);
            TestCaseChecknewitems.Unittest2("", Input.CheckNewItems.category_id, url);
            TestCaseChecknewitems.Unittest3(Input.CheckNewItems.last_id, "a", url);
            TestCaseChecknewitems.Unittest4("sdf", Input.CheckNewItems.category_id, url);
            TestCaseChecknewitems.Unittest5(Input.CheckNewItems.last_id, Input.CheckNewItems.category_id, url);
            TestCaseChecknewitems.Unittest6(Input.CheckNewItems.last_id, Input.CheckNewItems.category_id, url);
        } else if(url.contains("get_verify_code")) {
            ChonTestAPIGetverifycode.link = url;
            String signuplink = url.replace("get_verify_code", "signup");
            System.out.println("Đăng ký tài khoản");
            Input.SignUp.nhap();
            Response res = callAPI.callAPISignUp(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, signuplink);
            TestCaseGetverifycode.Unittest1(url);
            TestCaseGetverifycode.Unittest3(url);
            TestCaseGetverifycode.Unittest4(url);
            TestCaseGetverifycode.Unittest5(url);
        } else if(url.contains("check_verify_code")){
            ChonTestAPICheck_verify_code.link = url;

            System.out.println("Nhập vào tài khoản đã được đăng ký và lấy mã xác thực");
            Input.SignUp.nhap();
            String phonenumber = Input.SignUp.phonenumber;
            String password = Input.SignUp.password;
            String uuid = Input.SignUp.uuid;


            String getverifylink = url.replace("check_verify_code", "get_verify_code");
            ResponseGet_verify_code resget = callAPI.callAPIGVC(Input.SignUp.phonenumber, getverifylink);
            String verifycode = resget.data.verifyCode;

            TestCaseCheckverifycode.Unittest1(url, verifycode);
            TestCaseCheckverifycode.Unittest2(url, verifycode);
            TestCaseCheckverifycode.Unittest3(url, verifycode);
            TestCaseCheckverifycode.Unittest4(url, verifycode);
            TestCaseCheckverifycode.Unittest5(url, verifycode);
            TestCaseCheckverifycode.Unittest6(url, verifycode);
//            123456789
//            0321654789
        } else if (url.contains("login")) {
            String signuplink = url.replace("login", "signup");
            System.out.println(url); //kiểm tra lại link url
            System.out.println("Nhập vào tài khoản đã được kích hoạt mã xác thực");
            Input.SignUp.nhap();
            TestCaseLogin.Unittest1(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, url);
            TestCaseLogin.Unittest2("0912222333", Input.SignUp.password, Input.SignUp.uuid, url);
            TestCaseLogin.Unittest3("912222333", Input.SignUp.password, Input.SignUp.uuid, url);
            TestCaseLogin.Unittest4(Input.SignUp.phonenumber, "0", Input.SignUp.uuid, url);
            TestCaseLogin.Unittest5("", "", Input.SignUp.uuid, url);
            TestCaseLogin.Unittest6(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, url);
            TestCaseLogin.Unittest7(Input.SignUp.phonenumber, Input.SignUp.phonenumber, Input.SignUp.uuid, url);
            TestCaseLogin.Unittest8(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, url);
            TestCaseLogin.Unittest9(Input.SignUp.phonenumber, Input.SignUp.password, "", url);
        }else if (url.contains("logout")) {
            String loginlink = url.replace("logout", "login"); //gán link url gọi tới API login
            String signuplink = url.replace("logout", "signup"); //gán link url gọi tới API login

            //Đăng nhập tài khoản đã có để thực thi test case
            System.out.println("Đăng ký tài khoản: ");

            System.out.println("Nhập vào tài khoản đã đượcc kíchc hoạt mã xác thực");
            Input.SignUp.nhap();
            System.out.println(url);

            TestCaseLogout.Unittest1(url, loginlink);
            TestCaseLogout.UnitTest2(url, loginlink);
            TestCaseLogout.UnitTest3(url, loginlink);
            TestCaseLogout.UnitTest4(url, loginlink);
        } else if(url.contains("change_password")) {
            String loginlink = url.replace("change_password", "login");
            System.out.println(url);
            System.out.println(loginlink);
            //Đăng nhập tài khoản đã có để thực thi test case
            System.out.println("Đăng nhập tài khoản: ");
            Input.Login.nhap();

            TestCaseChangePass.Unittest1(url, loginlink);
            TestCaseChangePass.Unittest2(url, loginlink);
            TestCaseChangePass.Unittest3(url, loginlink);
            TestCaseChangePass.Unittest4(url, loginlink);
            TestCaseChangePass.Unittest5(url, loginlink);
            TestCaseChangePass.Unittest6(url, loginlink);
            TestCaseChangePass.Unittest7(url, loginlink);
            TestCaseChangePass.Unittest8(url, loginlink);
            TestCaseChangePass.Unittest9(url, loginlink);
        }
    }
}