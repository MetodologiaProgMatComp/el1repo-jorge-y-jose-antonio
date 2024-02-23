package es.uah.matcomp.mp.e1.ejerciciosclases.Parte2.Ejercicio5;

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

    }

}
