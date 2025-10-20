package com.giaolang.mathutil.core;

public class MathUtility {

    //class này chưứa các hàm tiện ích dùng cho mọi nơi
    //hàm tiện ích dùng cho mọi nơi nghĩa là nó ko lưu lại kết quả xử lí của nó bên trong, vậy nó sẽ đc thiết kế là static method!!!

    //hàm tính n! = 1.2.3...n; trong đó n phải > 0
    //quy ước 0! = 1, 1! = 1, 2! = 1 * 2 = 2...
    //20! vừa đủ kiểu long, 18 con số 0; 21! long chứa ko nổi
    //ko có âm giai thừa
    //bài này giai thừa chỉ tính từ 0...20, ngoài vùng này gọi là ko hợp lệ n!!!
    //0...20 -> valid boundary validated boundary - vùng giá trị hợp lệ
    //0, 20 -> boundary value - biên giới của tập giá trị
    //         xích qua 1 xíu là sang vùng invalid boundary!!!
    //0, xích nhẹ sang trái 1 đơn vị, ko ổn, ko tính đc, -1 sao tính!!!

    //VIẾT HÀM THEO PHONG CÁCH ĐỆ QUY
    //5! = 1.2.3.4.5 = 4! . 5 = 5 X 4!
    //4! = 4 X 3!
    //3! = 3 X 2!
    //2! = 2 X 1!
    //1! = 1
    //            RETURN
    //KẾT LUẬN: N! = N x (N - 1)! CTHUC DE QUY
    //            RECURSION - GỌI LẠI CHÍNH MÌNH VỚI QUY MÔ NHỎ HƠN - BÚP BÊ NGA
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            //ném ngoại lệ, kèm câu "chửi", và dừng hàm ngay, ko có value nào đc trả về!!!
            throw new IllegalArgumentException("n must be between 0 and 20");
        }
        if (n == 1 || n == 0)
            return 1;

        return n * getFactorial(n - 1);
    }
    //KIỂM THỬ LẠI CODE ĐÃ TỐI ƯU - REGRESSION TESTING, TEST LẠI THỨ ĐÃ TỪNG TEST


//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20) {
//            //ném ngoại lệ, kèm câu "chửi", và dừng hàm ngay, ko có value nào đc trả về!!!
//            throw new IllegalArgumentException("n must be between 0 and 20");
//        }
//
//        //biến trung gian để tính phép nhân
//        long result = 1;
//
//        for (int i = 1; i <= n; i++) {
//            result *= i;  //result = result * i;  //thuật toán heo đất, ốc bu nhồi thịt, vào đây tiếp chiêu
//        }
//        return result;
//    }
}
