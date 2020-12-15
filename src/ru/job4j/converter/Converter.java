package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsle = value / 70;
        return rsle;
    }

    public static int rubleToDollar(int value) {
        int rsld = value / 60;
        return rsld;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;

        System.out.println("140 rubles are 2. Test result :" + out + " euro." + passed);
        int dollar = Converter.rubleToDollar(in);
        System.out.println("140 rubles are 2. Test result :" + dollar + " dollars." + passed);
    }
}
