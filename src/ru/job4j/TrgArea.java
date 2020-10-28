package ru.job4j;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p= ((a+b+c)/2);
        double pa=p-a;
        double pb=p-b;
        double pc=p-c;
        double one= p*a*b*c;
        double rsl= Math.sqrt(one);
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
