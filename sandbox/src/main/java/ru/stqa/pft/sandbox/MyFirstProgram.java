package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("world");
        hello("мир");

        double len = 5;
        System.out.println("площадь квадрата со стороной " + len + "= " + area(len));

        double a = 2;
        double b = 3;
        System.out.println("площадь прямоугольника со сторонами " + a + " и "+ b + " равна " + areaSquare(a,b));
    }

    public static void hello(String somebody) {

        System.out.println("hello " + somebody);
    }

    public static double area(double l) {
        return l * l;
    }

    public static double areaSquare(double a, double b){
        return a * b;
    };
}