package com.company;

import java.util.Scanner;

//Lớpra muốn kiểm tra với API Change password

public class ChonTestAPIchangepass {
    static String loginlink;
    static String link;
    public static void TestChangepass() throws Exception {
        boolean k = true;
        while (k) {
            //Giao diện hiển thị
            System.out.println("Chọn Test Case: ");
            System.out.println("1 - Người dùng truyền đúng mã phiên đăng nhập và các tham số khác\n\n"+
                    " 2 - Người dùng gửi sai mã phiên đăng nhập (mã bị trống hoặc quá ngắn hoặc mã phiên\n" +
                    "đăng nhập cũ).\n\n"+
                    " 3 - Người dùng truyền đúng mã phiên đăng nhập nhưng hệ thống không thể thiết lập việc\n" +
                    "xử lý yêu cầu (do lỗi truy cập CSDL chẳng hạn)\n\n "+
                    " 4 - Người dùng truyền đúng mã phiên đăng nhập. Nhưng người dùng đã bị khóa tài khoản\n" +
                    "(do hệ thống khóa đi).\n\n"+
                    " 5 - Người dùng truyền đúng mã phiên đăng nhập, và các tham số khác nhưng mật khẩu cũ\n" +
                    "không đúng.\n\n"+
                    "6 - Người dùng truyền đúng mã phiên đăng nhập, và các tham số khác đầy đủ nhưng\n" +
                    "trong giao diện thì người dùng nhập hai mật khẩu cũ khác nhau\n\n"+
                    "7 - Người dùng truyền đúng mã phiên đăng nhập, và các tham số khác nhưng mật khẩu\n" +
                    "mới không hợp lệ (không đảm bảo dài ngắn hoặc chứa ký tự đặc biệt hoặc giống mật khẩu\n" +
                    "cũ).\n\n "+
                    "8 - Người dùng truyền đúng mã phiên đăng nhập, và các tham số khác đầy đủ nhưng mật\n" +
                    "khẩu mới gần giống mật khẩu cũ. Xâu con chung dài nhất của hai mật khẩu chiếm 80% trở\n" +
                    "lên kích thước của mật khẩu mới.\n\n"+
                    "9 - Người dùng truyền đúng mã phiên đăng nhập, và các tham số khác nhưng mật khẩu\n" +
                    "mới giống với một mật khẩu đã được dùng từ trước đây.\n\n"+
                    "10 để thoát\n");

            //Chọn Test Case
            Scanner sc = new Scanner(System.in);
            String pk = sc.next();
            int pick = Integer.parseInt(pk);
            switch (pick) {
                case 1:
                    TestCaseChangePass.Unittest1(link, loginlink);
                    break;
                case 2:
                    TestCaseChangePass.Unittest2(link, loginlink);
                    break;
                case 3:
                    TestCaseChangePass.Unittest3(link, loginlink);
                    break;
                case 4:
                    TestCaseChangePass.Unittest4(link, loginlink);
                    break;
                case 5:
                    TestCaseChangePass.Unittest5(link, loginlink);
                    break;
                case 6:
                    TestCaseChangePass.Unittest6(link, loginlink);
                    break;
                case 7:
                    TestCaseChangePass.Unittest7(link, loginlink);
                    break;
                case 8:
                    TestCaseChangePass.Unittest8(link, loginlink);
                    break;
                case 9:
                    TestCaseChangePass.Unittest9(link, loginlink);
                    break;
                default:
                    k = false;
                    break;
            }
        }
    }
}