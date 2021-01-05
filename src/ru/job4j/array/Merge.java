package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int tot = left.length + right.length;
        int [] resArray = new int [tot];
        for (int i = 0; i < resArray.length; i++) {
            if (left.length > i) {
                resArray[i] = left[i];
            } else {
                resArray[i] = right[i - left.length];
            }
            if ((i > 0) && (resArray[i] < resArray[i - 1])) {
                int empty = resArray[i - 1];
                resArray[i - 1] = resArray[i];
                resArray[i] = empty;
            }
        }
        return resArray;
    }
}
