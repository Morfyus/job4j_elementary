package ru.job4j.condition;

public class Max {
  public static int max(int left, int right) {
        boolean value = left > right;
        int result = value ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int rsl = Max.max(32, 30);
        System.out.println(rsl);
        int rsl1 = Max.max(32, 34);
        System.out.println(rsl1);
        int rsl2 = Max.max(32, 32);
        System.out.println(rsl2);
    }
}