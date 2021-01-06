package com.company;

import java.util.Scanner;

public class ChonTestAPICheck_verify_code {
    static String link;
    static String verifycode;
    public static void TestCheck_verify_code() throws Exception {
        boolean k = true;
        while (k) {
            System.out.println("1 - Người dùng truyền đúng số điện thoại và đúng mã xác thực đến server\n\n "+
                    "2 - Người dùng gửi sai định dạng số điện thoại.\n\n"+
                    "3 - Người dùng truyền một số điện thoại đúng định dạng nhưng không có trong danh sách\n" +
                    "và mã xác thực đúng định dạng\n\n" +
                    "4 - Người dùng truyền một số điện thoại đã được phép đăng nhập từ trước và mã xác thực\n" +
                    "đúng định dạng\n\n"+
                    "5 - Người dùng truyền một số điện thoại hợp lệ (đã hoàn tất signup nhưng hoàn tất bước\n" +
                    "này) và mã xác thực của một số điện thoại khác.\n\n" +
                    "6 - Người dùng truyền một số điện thoại hợp lệ (đã hoàn tất signup nhưng hoàn tất bước\n" +
                    "này) và một tham số khác nhưng không truyền mã xác thực.\n\n");
            Scanner sc = new Scanner(System.in);
            String pk = sc.next();
            int pick = Integer.parseInt(pk);
            switch (pick) {
                case 1:
                    TestCaseCheckverifycode.Unittest1(link,verifycode);
                    break;
                case 2:
                    TestCaseCheckverifycode.Unittest2(link, verifycode);
                    break;
                case 3:
                    TestCaseCheckverifycode.Unittest3(link, verifycode);
                    break;
                case 4:
                    TestCaseCheckverifycode.Unittest4(link,verifycode);
                    break;
                case 5:
                    TestCaseCheckverifycode.Unittest5(link, verifycode);
                    break;
                case 6:
                    TestCaseCheckverifycode.Unittest3(link, verifycode);
                    break;
                default:
                    k=false;
                    break;
            }
        }
    }
}