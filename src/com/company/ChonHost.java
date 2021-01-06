package com.company;

import java.util.Scanner;

//Lớp nhằm mục đích  ra Host muốn test
//Phương thức HOST sẽ trả về chuỗi là link url tương ứng

public class ChonHost {

    public static String HOST() throws Exception {
        String linkurl;
        System.out.println(" 1  nhóm Hàn Trung Kiên\n" +
                " 2 nhóm Nguyễn Thị Thuỳ Dung\n" +
                " 3 nhóm Lưu Quang Đông\n" +
                " 4 nhóm Phùng Việt Duy\n" +
                " 5 nhóm Cao Văn Duy\n" +
                " 6 nhóm Lê Xuân Quang\n");
            Scanner sc = new Scanner(System.in);
            String pk1 = sc.next();
            int pick0 = Integer.parseInt(pk1);
            ChonAPI api = new ChonAPI();
            switch (pick0) {

                case 1:
                    linkurl = api.chonAPIHost1();
                    break;
                case 2:
                    linkurl = api.chonAPIHost2();
                    break;
                case 3:
                    linkurl = api.chonAPIHost3();
                    break;
                case 4:
                    linkurl = api.chonAPIHost4();
                    break;
                case 5:
                    linkurl = api.chonAPIHost5();
                    break;
                case 6:
                    linkurl = api.chonAPIHost6();
                    break;
                default:
                    linkurl = api.chonAPIHost1();
                    break;
            }
            return linkurl;
    }

}
