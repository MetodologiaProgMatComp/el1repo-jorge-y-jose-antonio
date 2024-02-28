package es.uah.matcomp.mp.e1.ejerciciosclases.Parte2Composicion.Ejercicio5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(1, 1);

        MyLine l1 = new MyLine(p1,p2);

        System.out.println("Begin: " + l1.getBegin());
        System.out.println("End: " + l1.getEnd());
        System.out.println("Line is: " + l1);   //Llamada al toString
        System.out.println("Length is: " + l1.getLength());
        System.out.println("Gradient is: " + l1.getGradient());

        MyLine l2 = new MyLine(2,2,3,3);
        System.out.println("Begin: " + Arrays.toString(l2.getBeginXY()));
        System.out.println("End: " + Arrays.toString(l2.getEndXY()));
        l2.setBeginXY(1,2);
        l2.setEndXY(2,1);
        System.out.println("Begin x coordenate: " + l2.getBeginX());
        System.out.println("Begin y coordenate: " + l2.getBeginY());
        System.out.println("End x coordenate: " + l2.getEndX());
        System.out.println("End x coordenate: " + l2.getEndY());

        MyLine l3 = new MyLine(0,0,10,10);
        l3.setBeginX(1);
        l3.setBeginY(1);
        l3.setEndX(9);
        l3.setEndY(9);
        System.out.println("Line is: " + l3);

        MyPoint p3 = new MyPoint(5, 0);
        MyPoint p4 = new MyPoint(0, 5);

        l3.setBegin(p3);
        l3.setEnd(p4);

        System.out.println("Begin: " + l3.getBegin());
        System.out.println("End: " + l3.getEnd());
        System.out.println("Line is: " + l3);
        System.out.println("Length is: " + l3.getLength());
        System.out.println("Gradient is: " + l3.getGradient());

    }

}
