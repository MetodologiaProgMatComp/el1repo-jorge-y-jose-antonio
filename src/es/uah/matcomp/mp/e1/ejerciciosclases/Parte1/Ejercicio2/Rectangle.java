package es.uah.matcomp.mp.e1.ejerciciosclases.Parte1.Ejercicio2;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle() { //Constructor default
        this.length = 1.0F;
        this.width = 1.0F;
    }

    public Rectangle(float l,float w){ //Constructor general
        this.length = l;
        this.width = w;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getArea(){
        return width * length;
    }

    public float getPerimeter(){
        return (2 * width) + (2 * length);
    }

    public String toString() {
        return "Rectangle[length=" + length + ", width=" + width + "]";
    }
}
