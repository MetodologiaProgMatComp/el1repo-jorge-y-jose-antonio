package es.uah.matcomp.mp.e1.ejerciciosclases.ClasesHerencia.ClaseCilinderConComposicion;

public class Cylinder {
    private Circle base; // Base circle, an instance of Circle class
    private double height;

    // Constructor with default color, radius and height
    public Cylinder() {
        base = new Circle(); // Call the constructor to construct the Circle
        height = 1.0;
    }
    public double getHeight() {
        return height;
    }

    //Metodo para obtener area
    public double getArea(){
        return (2 * Math.PI * base.getRadius() * height + 2 * base.getArea());
    }

    // A public method for computing the volume of cylinder
    // use superclass method getArea() to get the base area
    public double getVolume() {
        return base.getArea()*height;
    }

    public String toString() { // in Cylinder class
        return "Cylinder: subclass of " + base.toString() // use Circle's toString()
                + " height=" + height;
    }
}
