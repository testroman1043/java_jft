package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,4);
        double dist = p1.distance(p2);
        System.out.println("Расстояние между точкой " + p1.x +"," + p1.y +" и "+ p2.x +"," + p2.y + " равно "+ dist);

        System.out.println("Расстояние между точкой " + p2.x +"," + p2.y +" и "+ p1.x +"," + p1.y + " равно "+ distance(p2,p1));


    }


    public static double distance(Point p1, Point p2){

        double x1 = p1.x;
        double x2 = p2.x;
        return Math.sqrt((x2-x1)*(x2-x1)+(p2.y- p1.y)*(p2.y- p1.y));
    }




}