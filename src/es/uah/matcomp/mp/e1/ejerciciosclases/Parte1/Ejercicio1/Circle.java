package es.uah.matcomp.mp.e1.ejerciciosclases.Parte1.Ejercicio1;

public class Circle {
    private double radius;
    public Circle() { //Constructor default
        this.radius = 1.0;
    }
    public Circle(double r) { //Constructor general
        this.radius = r;
    }

    //Devuelve el radio del circulo
    public double getRadius() {
        return radius;
    }

    //Funcion para establecer el radio
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Devuelve el area del circulo
    public double getArea() {
        return radius * radius * Math.PI;
    }

    //Devuelve la circunferencia (longitud) del circulo
    public double getCircumference() {
        return 2 * radius * Math.PI;
    }

    //La funcion toString
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}
