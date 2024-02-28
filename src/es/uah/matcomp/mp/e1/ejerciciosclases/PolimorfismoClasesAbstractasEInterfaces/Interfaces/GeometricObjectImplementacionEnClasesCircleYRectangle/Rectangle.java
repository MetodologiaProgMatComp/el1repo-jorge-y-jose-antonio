package es.uah.matcomp.mp.e1.ejerciciosclases.PolimorfismoClasesAbstractasEInterfaces.Interfaces.GeometricObjectImplementacionEnClasesCircleYRectangle;

public class Rectangle implements GeometricObject {
    private double width;
    private double length;

    public Rectangle(double width,double length) {
        this.width = width;
        this.length = length;
    }

    public String toString() {
        return "Rectangle[width=" + width + ", length=" + length + "]";
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public double getPerimeter() {
        return (2 * this.width + 2 * this.length);
    }
}
