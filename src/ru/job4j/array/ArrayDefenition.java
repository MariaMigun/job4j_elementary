package ru.job4j.array;

public class ArrayDefenition {
    public static void main(String[] args) {
        short [] ages = new short[10];
        System.out.println("Размер массива равен: " + ages.length);
        String [] surnames = new String[100500];
        System.out.println("Размер массива равен: " + surnames.length);
        float [] prices = new float[40];
        System.out.println("Размер массива равен: " + prices.length);
        String [] names = new String[4];
        names[0] = "John Wane";
        names[1] = "John Lennon";
        names[2] = "Charly Manson";
        names[3] = "Kurt Cobain";
        System.out.println(names[0] + "; " + names[1] + "; " + names[2] + "; " + names[3]);

    }
}
