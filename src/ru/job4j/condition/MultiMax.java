package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (second > first && second >= third) {
            result = second;
        }
        if (third > first && third > second) {
            result = third;
        }
        return result;
    }

    public static void main(String[] args) {
        int msg = MultiMax.max(1, 4, 8);
        System.out.println(msg);
    }
}
