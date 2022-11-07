package ru.job4j.calculator;

public class FitTest {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 168;
        double man = Fit.manWeight(height);
        System.out.println("Man 168 is " + man);
        short height2 = 160;
        double woman = Fit.womanWeight(height2);
        System.out.println("Woman 160 is " + woman);

    }

}

