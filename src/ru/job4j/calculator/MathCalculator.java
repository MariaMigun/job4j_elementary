package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double divAndSubtr(double first, double second) {
        return divide(first, second)
                + subtract(first, second);
    }

    public static double allFunctionsSum(double first, double second) {
        return divide(first, second)
                + subtract(first, second)
                + sum(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета 1 равен: " + sumAndMultiply(20, 10));
        System.out.println("Результат расчета 2 равен: " + divAndSubtr(20, 10));
        System.out.println("Результат расчета 3 равен: " + allFunctionsSum(20, 10));
    }
}