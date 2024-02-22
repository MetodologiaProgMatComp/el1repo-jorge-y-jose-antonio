package es.uah.matcomp.mp.e1.ejerciciosclases.Parte2.Ejercicio5;

public class MyLine {

    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1,int x2,int y2) {
        this.begin = new MyPoint(x1,y1);
        this.end = new MyPoint(x2,y2);
    }

    public MyLine(MyPoint begin,MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

}
