package es.uah.matcomp.mp.e1.ejerciciosclases.Parte2Composicion.Ejercicio6;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(10, 10);

        MyCircle c1 = new MyCircle();

        System.out.println("c1:" + c1.toString());
        System.out.println("c1 center is:" + c1.getCenter());
        System.out.println("c1 radius is:" + c1.getRadius());
        System.out.println("c1 area is:" + c1.getArea());

        MyCircle c2 = new MyCircle(p1,10);

        System.out.println("c2:" + c2.toString());
        c2.setCenter(p2);
        c2.setRadius(5);
        System.out.println("New c2 center x is:" + c2.getCenterX());
        System.out.println("New c2 center y is:" + c2.getCenterY());
        System.out.println("New c2 radius is:" + c2.getRadius());
        System.out.println("c2 circumference is:" + c2.getCircumference());

        MyCircle c3 = new MyCircle(2,2,3);
        c3.setCenterXY(3,3);
        System.out.println("c3 center is:" + Arrays.toString(c2.getCenterXY()));
        System.out.println("Distance between c2 and c3 is:" + c3.distance(c2));

        c3.setCenterX(2);
        c3.setCenterY(2);
        System.out.println("c3:" + c3.toString());

    }
}
