package test;

import java.util.*;

public class TwoInOne {
    public void mergingOfTwoArrays(int[] array1, int[] array2) {
        Queue<Integer> arr1 = new LinkedList<>();
        Queue<Integer> arr2 = new LinkedList<>();

        int[] array3 = new int[2 * array1.length];

        for (int i = 0; i < array1.length; i++) {
            arr1.add(array1[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            arr2.add(array2[i]);
        }
        System.out.println("Array 1 is :" + arr1);
        System.out.println("Array 2 is :" + arr2);
        int start = 0;
        int end = array3.length - 1;
        int i = 0;
        while (start <= end) {
            if (i % 2 == 0) {
                array3[i++] = arr1.remove();
                start++;
            } else {
                array3[i++] = arr2.remove();
                end--;
            }

        }
        System.out.println("Merging of two sorted arrays into one :" + Arrays.toString(array3));
    }

    public static void main(String[] args) {
        int[] array1 = {1, 5, 10, 20, 40};
        int[] array2 = {6, 7, 20, 80, 100};
        TwoInOne t = new TwoInOne();
        t.mergingOfTwoArrays(array1, array2);
    }
}
