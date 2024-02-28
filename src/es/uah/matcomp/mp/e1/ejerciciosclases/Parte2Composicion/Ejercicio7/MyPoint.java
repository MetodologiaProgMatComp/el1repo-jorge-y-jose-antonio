package es.uah.matcomp.mp.e1.ejerciciosclases.Parte2Composicion.Ejercicio7;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int xn,int yn) {
        this.x = xn;
        this.y = yn;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        int[] XY = new int[2];
        XY[0] = x;
        XY[1] = y;
        return XY;
    }

    public void setXY(int x,int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }


    public double distance(int xn, int yn) {
        return Math.sqrt(Math.pow((this.x - xn),2) + Math.pow((this.y - yn),2));
    }

    public double distance(MyPoint another) {
        return Math.sqrt(Math.pow((this.x - another.getX()),2) + Math.pow((this.y - another.getY()),2));
    }

    public double distance() {
        return (Math.sqrt(Math.pow((this.x),2)+Math.pow((this.y),2)));
    }

}