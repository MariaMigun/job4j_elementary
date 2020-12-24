package ru.job4j.loop;

public class Mortage {
    public static int year(double amount, double salary, double percent) {
        int year = 1;
        while ((((amount * percent / 100) + amount) - salary) > 0) {
            amount = ((amount * percent / 100) + amount) - salary;
            year = year + 1;
        }
        return year;
    }

    public static void main(String[] args) {
        System.out.println(year(100, 120, 50));
    }
}
