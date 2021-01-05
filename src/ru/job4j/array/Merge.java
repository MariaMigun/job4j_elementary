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
        }
        for (int index = 1; index < resArray.length; index++) {
            for (int j = index - 1; j < resArray.length; j++) {
                if (resArray[index] < resArray[j]) {
                    int empty = resArray[j];
                    resArray[j] = resArray[index];
                    resArray[index] = empty;
                }
                if ((j > 0) && (resArray[j] < resArray[j - 1])) {
                    int empty = resArray[j - 1];
                    resArray[j - 1] = resArray[j];
                    resArray[j] = empty;
                }
            }
        }
        return resArray;
    }
}
