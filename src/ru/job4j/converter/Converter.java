package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsle = value/70;
        return rsle;
    }
    public static int rubleToDollar(int value) {
        int rsld = value/60;
        return rsld;
    }
    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollars.");
    }
}
