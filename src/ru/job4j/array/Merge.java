package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int [] resArray = new int [left.length + right.length];
        int leftPoint = 0;
        int rightPoint = 0;
        int rslPoint = 0;
        while (leftPoint + rightPoint != resArray.length) {
            if (leftPoint != left.length && rightPoint != right.length) {
                resArray[rslPoint++] = left[leftPoint] < right[rightPoint] ? left[leftPoint++] : right[rightPoint++];
            } else if (leftPoint != left.length) {
                resArray[rslPoint++] = left[leftPoint++];
            } else {
                resArray[rslPoint++] = right[rightPoint++];
            }
        }
        return resArray;
    }
}
