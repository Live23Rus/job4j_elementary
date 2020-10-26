package ru.job4j;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int one = x2-x1;
        int two= y2-y1;
        double three= Math.pow(one,2);
        double four= Math.pow(two,2);
        double five= three+ four;
        double rsl= Math.sqrt(five);
        return rsl;
    }

    public static void main(String[] args) {
        int x1= 9;
        int y1= 7;
        int x2= 5;
        int y2= 2;
        double rsl2= distance(x1, y1, x2, y2);
        double result = Point.distance(9, 7, 5, 2);
        System.out.println("result (9, 7) to (5, 1) " + result);
    }
}
