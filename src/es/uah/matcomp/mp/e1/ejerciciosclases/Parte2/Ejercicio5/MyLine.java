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

    public MyPoint getBegin() {
        return begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        this.begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        this.begin.setY(y);
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        this.end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        this.end.setY(y);
    }

    public int[] getBeginXY() {
        return begin.getXY();
    }

    public void setBeginXY(int x,int y) {
        this.begin.setXY(x,y);
    }

    public int[] getEndXY() {
        return end.getXY();
    }

    public void setEndXY(int x,int y) {
        this.end.setXY(x,y);
    }

    public double getLength(){
        return begin.distance(end);
    }

    public double getGradient() {
        return Math.atan2((end.getX() - begin.getX()),(end.getY() - begin.getY()));
    }

    public String toString() {
        return "MyLine[Begin=" + begin.toString() + ",End=" + end.toString() + "]";
    }

}
