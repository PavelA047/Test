package TestPack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TestClassTest {
    TestClass tc;

    @BeforeEach
    void prepare() {
        tc = new TestClass();
    }

    @Test
    void method() {
        int[] actual = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] exp = {5, 6, 7, 8, 9};
        Assertions.assertEquals(Arrays.toString(exp), Arrays.toString(tc.method1(actual)));
    }

    @Test
    void method2() {
        int[] actual = {5, 6, 7, 8, 9};
        Assertions.assertThrows(RuntimeException.class, () -> tc.method1(actual));
    }

    @Test
    void method3() {
        int[] actual = {3, 4, 5, 6};
        int[] exp = {5, 6};
        Assertions.assertEquals(Arrays.toString(exp), Arrays.toString(tc.method1(actual)));
    }

    @Test
    void method8() {
        int[] actual = {};
        Assertions.assertThrows(RuntimeException.class, () -> tc.method1(actual));
    }

    @Test
    void method4() {
        int[] actual = {1, 2, 3, 5, 6, 7, 8, 9};
        Assertions.assertFalse(tc.method2(actual));
    }

    @Test
    void method5() {
        int[] actual = {2, 3, 4, 5, 6, 7, 8, 9};
        Assertions.assertFalse(tc.method2(actual));
    }

    @Test
    void method6() {
        int[] actual = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assertions.assertTrue(tc.method2(actual));
    }

    @Test
    void method7() {
        int[] actual = {};
        Assertions.assertFalse(tc.method2(actual));
    }
}