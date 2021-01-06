package com.company;

import java.util.Scanner;

//Lớpra muốn kiểm tra với API Change password

public class ChonTestAPICheck_new_items {
    static String loginlink;
    static String link;
    public static void TestCheck_new_items() throws Exception {
        boolean k = true;
        while (k) {
            //Giao diện hiển thị
            System.out.println("Chọn Test Case: ");
            System.out.println("1 - Người dùng truyền đúng mã last_id, category_id đúng định dạng\n\n"+
                    "2 - Người dùng gửi sai mã last_id (không truyền hoặc giá trị\r\n"
                    + "không hợp lệ) \n\n"+
                    "3 - Người dùng gửi sai category_id (không truyền hoặc giá trị\r\n"
                    + "không hợp lệ) \n\n"+
                    "4 - Người dùng truyền các tham số hợp lệ nhưng giá trị new_items trả về không hợp lệ. \n\n "+
                    "5 - Ứng dụng đã truyền đủ các dữ liệu tham số hợp lệ nhưng server bị lỗi không lấy được\r\n"
                    + "giá trị new_items này.\n\n"+
                    "6 - Ứng dụng đã truyền đủ các dữ liệu tham số hợp lệ nhưng trong quá trình kiểm tra thì\r\n"
                    + "mạng bị ngắt kết nối.");

            //Chọn Test Case
            Scanner sc = new Scanner(System.in);
            String pk = sc.next();
            int pick = Integer.parseInt(pk);
            switch (pick) {
            case 1:
                Input.CheckNewItems.nhap();
                TestCaseChecknewitems.Unittest1(Input.CheckNewItems.last_id, Input.CheckNewItems.category_id, link);
                break;
            case 2:
                Input.CheckNewItems.nhap();
                TestCaseChecknewitems.Unittest2(Input.CheckNewItems.last_id, Input.CheckNewItems.category_id, link);
                break;
            case 3:
                Input.CheckNewItems.nhap();
                TestCaseChecknewitems.Unittest3(Input.CheckNewItems.last_id, Input.CheckNewItems.category_id, link);
                break;
            case 4:
                Input.CheckNewItems.nhap();
                TestCaseChecknewitems.Unittest4(Input.CheckNewItems.last_id, Input.CheckNewItems.category_id, link);
                break;
            case 5:
                Input.CheckNewItems.nhap();
                TestCaseChecknewitems.Unittest5(Input.CheckNewItems.last_id, Input.CheckNewItems.category_id, link);
                break;
            case 6:
                Input.CheckNewItems.nhap();
                TestCaseChecknewitems.Unittest6(Input.CheckNewItems.last_id, Input.CheckNewItems.category_id, link);
                break;
            default:
                    k = false;
                    break;
            }
        }
    }
}