package test;

import java.util.ArrayList;
import java.util.List;

public class CommonElements {
    public void commonElements(int[] array1, int[] array2, int[] array3) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                for (int k = 0; k < array3.length; k++) {
                    if (array1[i] == array2[j] && array2[j] == array3[k] && array3[k] == array1[i]) {
                        list.add(array1[i]);
                    }
                }
            }
        }
        System.out.println("Common Elements in the three Array is :"+list);
    }

    public static void main(String[] args) {
        int[] array1 = {1, 5, 10, 20, 40, 80};
        int[] array2 = {6, 7, 20, 80, 100};
        int[] array3 = {3, 4, 15, 20, 30, 70, 80, 120};
        CommonElements c = new CommonElements();
        c.commonElements(array1, array2, array3);
    }


}
