package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean etalon = data[0];
        for (int index = 0; index < data.length; index++) {
            if (data[index] != etalon) {
                result = false;
                break;
            }
        }
        return result;
    }
}
