package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int [] funcValues = new int[5];
        for (int index = 0; index < funcValues.length; index++){
            funcValues[index] = index * 2 + 3;
        }
        for (int element : funcValues){
            System.out.println(element);
        }
    }
}
