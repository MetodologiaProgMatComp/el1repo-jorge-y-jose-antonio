package es.uah.matcomp.mp.e1.ejerciciosclases.ClasesHerencia.EjercciosHerencia.Ejercicio2;

public class Point2D {
    private float x;
    private float y;

    public Point2D() {
        this.x = 0.0F;
        this.y = 0.0F;
    }

    public Point2D(float x,float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        float[] result = new float[2]; // construct an array of 2 elements
        result[0] = this.x;
        result[1] = this.y;
        return result; // return the array

    }

    public void setXY(float x,float y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
