package com.giaolang.mathutil.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {

    //chuan bị bộ data để riêng, sau đó fill vào lệnh test
    //mảng 2 chiều, gồm    giá trị kì vọng |   con n!
    public static Object[][] initTestData() {
        //trả về mảng 2 chiều
        //Object dataset = {,,,,};  //= {các phần tử mảng cách nhau dấu ,}
                                   //{5, 10, 15, 20}
        Object[][] dataset = {{5, 120},
                              {6, 720},
                              {4, 24},
                              {3, 6},
                              {2, 2},
                              {1, 1},
                              {0, 1}};  //[7][2]
        return dataset;
    }
    //@Test
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgRunsWell(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }


}