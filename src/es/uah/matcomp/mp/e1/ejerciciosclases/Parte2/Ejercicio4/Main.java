package es.uah.matcomp.mp.e1.ejerciciosclases.Parte2.Ejercicio4;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        //Example distance(x,y)
        MyPoint P1 = new MyPoint(3, 4);
        System.out.println(P1.distance(5, 6));
        //Example distance(another)
        MyPoint P2 = new MyPoint(3, 4);
        MyPoint P3 = new MyPoint(5, 6);
        System.out.println(P2.distance(P3));
        //Example distance()
        MyPoint P4 = new MyPoint(3, 4);
        System.out.println(P4.distance());

        // Test program to test all constructors and public methods
        MyPoint p1 = new MyPoint(); // Test constructor
        System.out.println(p1); // Test toString()
        p1.setX(8); // Test setters
        p1.setY(6);
        System.out.println("x is: " + p1.getX()); // Test getters
        System.out.println("y is: " + p1.getY());
        p1.setXY(3, 0); // Test setXY()
        System.out.println(p1.getXY()[0]); // Test getXY()
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);
        MyPoint p2 = new MyPoint(0, 4); // Test another constructor
        System.out.println(p2);
        // Testing the overloaded methods distance()
        System.out.println(p1.distance(p2)); // which version? -> Version 2 puntos
        System.out.println(p2.distance(p1)); // which version? -> Version 2 puntos
        System.out.println(p1.distance(5, 6)); // which version? -> Version punto a coordenadas
        System.out.println(p1.distance()); // which version? -> Version 1 punto a (0,0)


        MyPoint[] Puntos = new MyPoint[10];

        for (int i = 0; i < Puntos.length; i++) {
            Puntos[i] = new MyPoint(i + 1, i + 1);
        }


        DecimalFormat df = new DecimalFormat("#00.00");

        System.out.println("Matriz de distancias entre 10 puntos:");

        for (int i=0;i<10; i++) {
            for(int j=0;j<10;j++) {
                System.out.print(df.format(Puntos[i].distance(Puntos[j])) + "  ");
            }
            System.out.println(" ");
        }
    }
}
