package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double per = a+b+c;
        double p = per / 2;
        double pa = p-a;
        double pb = p-b;
        double pc = p-c;
        double s2 = p * pa * pb * pc;
        double s = Math.sqrt(s2);
        return s;
    }
    public static void main(String[] args) {
        double s = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + s);
    }
}
