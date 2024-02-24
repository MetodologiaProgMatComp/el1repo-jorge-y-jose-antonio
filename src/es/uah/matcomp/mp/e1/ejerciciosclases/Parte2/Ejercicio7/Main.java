package es.uah.matcomp.mp.e1.ejerciciosclases.Parte2.Ejercicio7;

public class Main {
    public static void main(String[] args) {

        MyPoint v1 = new MyPoint();
        MyPoint v2 = new MyPoint(0, 2);
        MyPoint v3 = new MyPoint(1, 1);

        MyTriangle t1 = new MyTriangle(v1,v2,v2);
        System.out.println(t1.toString());
        System.out.println("t1 perimeter is:" + t1.getPerimeter());
        System.out.println("t1 type is:" + t1.getType());

        MyTriangle t2 = new MyTriangle(1,-1,-5,7,-3,1);
        System.out.println(t2.toString());
        System.out.println("t2 perimeter is:" + t2.getPerimeter());
        System.out.println("t2 type is:" + t2.getType());

        MyTriangle t3 = new MyTriangle(0,0,0,0,0,0);
        System.out.println(t3.toString());
        System.out.println("t3 perimeter is:" + t3.getPerimeter());
        System.out.println("t3 type is:" + t3.getType());

    }
}
