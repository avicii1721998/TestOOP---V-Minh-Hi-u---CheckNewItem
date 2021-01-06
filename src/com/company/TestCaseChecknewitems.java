package com.company;

//class contains test cases of check new item
public class TestCaseChecknewitems {
	//last_id: nhom 5: 5fc36b7cd80bf825601ba16c
    public static void Unittest1(String last_id, String category_id, String url) throws Exception{
        System.out.println("Test case 1: Check success ");
        Response res = callAPI.callAPICheckNewItems(last_id, category_id, url);
        if ((!"1000".equals(res.code)) && (!"9995".equals(res.code))) throw new AssertionError("wrong code");
        System.out.println("Finished");
    }
    //last_id: 
    public static void Unittest2(String last_id, String category_id, String url) throws Exception{
        System.out.println("Test case 2: last_id validate");
        Response res = callAPI.callAPICheckNewItems(last_id, category_id, url);
        if ((!"1003".equals(res.code)) && (!"1002".equals(res.code)) && (!"1004".equals(res.code))) throw new AssertionError("wrong code");
        if ((!"Parameter type is invalid".equals(res.message))) throw new AssertionError("wrong message");

        System.out.println("Finished");
    }
    //category_id: a
    public static void Unittest3(String last_id, String category_id, String url) throws Exception{
        System.out.println("Test case 3: category_id validate");
        Response res = callAPI.callAPICheckNewItems(last_id, category_id, url);
        if ((!"1003".equals(res.code)) && (!"1002".equals(res.code)) && (!"1004".equals(res.code))) throw new AssertionError("wrong code");
        if ((!"Parameter type is invalid".equals(res.message))) throw new AssertionError("wrong message");

        System.out.println("Finished");
    }

    public static void Unittest4(String last_id, String category_id, String url) throws Exception{
        System.out.println("Test case 4: Check success ");
        Response res = callAPI.callAPICheckNewItems(last_id, category_id, url);
        if ((!"1000".equals(res.code)) && (!"9995".equals(res.code))) throw new AssertionError("wrong code");
        System.out.println("Finished");
    }
    
    public static void Unittest5(String last_id, String category_id, String url) throws Exception{
        System.out.println("Test case 5: Check success ");
        Response res = callAPI.callAPICheckNewItems(last_id, category_id, url);
        if ((!"1001".equals(res.code)) && (!"9995".equals(res.code))) throw new AssertionError("wrong code");
        System.out.println("Finished");
    }
    
    public static void Unittest6(String last_id, String category_id, String url) throws Exception{
        System.out.println("Test case 6: Check success ");
        Response res = callAPI.callAPICheckNewItems(last_id, category_id, url);
        if ((!"1001".equals(res.code)) && (!"9995".equals(res.code))) throw new AssertionError("wrong code");
        System.out.println("Finished");
    }
}