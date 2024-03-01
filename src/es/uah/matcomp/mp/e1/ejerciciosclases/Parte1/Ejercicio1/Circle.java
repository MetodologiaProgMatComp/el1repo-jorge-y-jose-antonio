package es.uah.matcomp.mp.e1.ejerciciosclases.Parte1.Ejercicio1;

public class Circle {

    private double radius = 1.0;

    public Circle(){};
    public Circle(double radius){

        this.radius = radius;

    }

    public double getRadius(){

        return radius;

    }
    public void setRadius(double radius){

        this.radius = radius;

    }
    public double getArea(){

        return Math.PI * Math.pow(radius,2.0);

    }
    public double getCircumference(){

        return Math.PI * 2 * radius;

    }

    public String toString(){

        return "Circle[radius = " + radius + "]";

    }

}
