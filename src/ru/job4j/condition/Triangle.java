package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double bc, double ac) {
        return ((ab + bc) > ac) && ((ac + bc) > ab) && ((ab + ac) > bc);
    }

    public static void main(String[] args) {
        System.out.println(exist(2.2, 5, 3));
        System.out.println(exist(10, 50, 30));
    }
}
