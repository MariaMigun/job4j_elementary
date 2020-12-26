package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int [] funcValue = new int[5];
        for (int index = 0; index < funcValue.length; index++){
            funcValue[index] = index * 2 + 3;
        }
        for (int index = 0; index < funcValue.length; index++){
            System.out.println(funcValue[index]);
        }
    }
}
