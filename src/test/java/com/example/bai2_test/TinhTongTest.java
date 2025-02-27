package com.example.bai2_test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhTongTest {
    public int sumArray(int[] arr) {
    int sum = 0;
    for (int num : arr) {
        sum += num;
    }
    return sum;
}

    @Test
    public void testEmptyArray() {
        assertEquals(0, sumArray(new int[]{}), "Mảng rỗng phải trả về 0");
    }

    @Test
    public void testSingleElement() {
        assertEquals(5, sumArray(new int[]{5}), "Mảng một phần tử phải trả về chính nó");
    }

    @Test
    public void testAllPositiveNumbers() {
        assertEquals(15, sumArray(new int[]{1, 2, 3, 4, 5}), "Tổng các số dương phải đúng");
    }

    @Test
    public void testAllNegativeNumbers() {
        assertEquals(-15, sumArray(new int[]{-1, -2, -3, -4, -5}), "Tổng các số âm phải đúng");
    }

    @Test
    public void testMixedNumbers() {
        assertEquals(0, sumArray(new int[]{-3, -2, 5}), "Tổng của cả số âm và số dương phải đúng");
    }

    @Test
    public void testContainsZero() {
        assertEquals(10, sumArray(new int[]{0, 10, 0}), "Số 0 không ảnh hưởng đến tổng");
    }

    @Test
    public void testMaxIntValue() {
        assertEquals(Integer.MAX_VALUE, sumArray(new int[]{Integer.MAX_VALUE}), "Kiểm tra giới hạn Integer.MAX_VALUE");
    }

    @Test
    public void testMinIntValue() {
        assertEquals(Integer.MIN_VALUE, sumArray(new int[]{Integer.MIN_VALUE}), "Kiểm tra giới hạn Integer.MIN_VALUE");
    }

    @Test
    public void testOverflow() {
        assertEquals(-1, sumArray(new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE}), "Kiểm tra tràn số");
    }

}