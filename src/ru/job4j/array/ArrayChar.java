package ru.job4j.array;

public class ArrayChar {
    public static boolean startWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < pref.length; index++) {
            if (word[index] != pref[index]) {
                result = false;
            }
        }
        return result;
    }
}
