package TestPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestClass {
    public int[] method1(int[] arr) {
        Integer[] integerArr = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            integerArr[i] = arr[i];
        }
        List<Integer> list = new ArrayList<>(Arrays.asList(integerArr));
        if (!list.contains(4)) {
            throw new RuntimeException("there is no 4");
        }
        list.subList(0, list.lastIndexOf(4) + 1).clear();
        int[] newArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            newArr[i] = list.get(i);
        }
        return newArr;
    }

    public boolean method2(int[] arr) {
        Integer[] integerArr = new Integer[arr.length];
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            integerArr[i] = arr[i];
        }
        List<Integer> list = new ArrayList<>(Arrays.asList(integerArr));
        if (list.isEmpty()) {
            flag = false;
        }
        for (Integer i : list) {
            if (i != 1 && i != 4) {
                flag = false;
            }
        }
        return flag;
    }
}
