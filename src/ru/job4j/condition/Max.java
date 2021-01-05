package ru.job4j.condition;

public class Max {
    public int maxnum(int first, int second) {
        boolean condition = first > second;
        int result = condition ? first : second;
        return result;
    }

    public int maxnum(int first, int second, int third) {
        boolean condition = maxnum(first, second) > third;
        int res = condition ? maxnum(first, second) : third;
        return res;
    }

    public int maxnum(int first, int second, int third, int fourth) {
        boolean condition = maxnum(first, second, third) > fourth;
        int res = condition ? maxnum(first, second, third) : fourth;
        return res;
    }
}
