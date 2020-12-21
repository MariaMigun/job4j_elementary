package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (Math.max(result, second) < third) {
            result = third;
        } else {
            result =  Math.max(result, second);
        }
        return result;
    }


    public static void main(String[] args) {
        int msg = MultiMax.max(1, 4, 8);
        System.out.println(msg);
    }
}
