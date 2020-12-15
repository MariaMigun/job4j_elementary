package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl1 = x1 - x2;
        double rsl2 = y1 - y2;
        double third = Math.pow(rsl1, 2);
        double fourth = Math.pow(rsl2, 2);
        double fifth = third + fourth;
        double sixth = Math.sqrt(fifth);
        return sixth;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        System.out.println("result (0,0) to (2, 0) " + result1);
        double result2 = Point.distance(1, 2, 3, 4);
        System.out.println("result (0,0) to (2, 0) " + result2);
    }
}
