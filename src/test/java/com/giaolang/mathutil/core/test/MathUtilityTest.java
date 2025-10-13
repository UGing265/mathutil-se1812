package com.giaolang.mathutil.core.test;

import com.giaolang.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;

//import static com.giaolang.mathutil.core.MathUtility.getFactorial;
import static com.giaolang.mathutil.core.MathUtility.*;
//import static chỉ dành cho những hàm static, để giúp ta làm biếng gõ tên class chấm. Lẽ ra phải là MathUtility.getFactorial(2); thì nay chỉ cần gõ getFactorial(5); là đủ
//giả sử class có nhiều hàm static thì ta đổi qua dấu *;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test
    public void testFactorialGivenRightArg3RunsWell() {
        assertEquals(6, getFactorial(3));
    }

    @Test
    public void testFactorialGivenRightArg4RunsWell() {
        assertEquals(24, getFactorial(4));
    }

    @Test
    public void testFactorialGivenRightArg5RunsWell() {
        assertEquals(120, getFactorial(5));
    }

    @Test  //@Test là ghi chú, đánh dấu, kí hiệu - annotation báo hiệu rằng hàm này là hàm main() có thể run
    //1 class test có thể có nhiều @Test, vậy 1 class Test có thể có nhiều hàm main() - để ứng với nhiều kịch bản test, nhiều test case khác nhau đều đc run!!!
    //TEST CASE #1: Check/Verify getFactorial() method with valid parameter, e.g. n = 0
    //STEPS/PROCEDURE:
    //   1. Given a valid n, e.g. n = 0
    //   2. Call/invoke getFactorial(n = 0)
    //   3. Execute
    //EXPECTED RESULT:
    //   The method will return 1 as the result of 0!
    //STATUS:
    //   PASSED HAY FAILED ĐOÁN XEM, CHẠY APP ĐÃ!!!
    public void testFactorialGivenRightArg0RunsWell() {
        int n = 0;  //đầu vào
        long expectedValue = 1; //hope to see 0! = 1, kì vọng thoy
        //gọi hàm để xem actual
        long actualValue = getFactorial(n);
        assertEquals(expectedValue, actualValue);
        //vietsub: so sánh xem 0! có trả về con số 1 hay ko
        //                            actual       expected

        assertEquals(1, getFactorial(0));
        //              expected         actual
        //hàm assertEquals() so sánh giúp mình 2 value này, nó thảy ra 2 màu:
        //MÀU XANH PASED NẾU 2 ĐỨA BẰNG NHAU
        //MÀU ĐỎ FAILED NẾU 2 ĐỨA KO BẰNG NHAU!!!!!!!
       //MẮT VẪN PHẢI NHÌN, CHỈ NHÌN 2 MÀU!!!
    }
}