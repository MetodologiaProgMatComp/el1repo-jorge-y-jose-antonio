package es.uah.matcomp.mp.e1.ejerciciosclases.Parte1.Ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {

        double RadiusInicial = 2.0;
        Circle circle = new Circle(RadiusInicial);

        double RadiusDevuelto = circle.getRadius();

        assertEquals(RadiusInicial, RadiusDevuelto);
        //Probamos que devuelve el radio que debe

    }

    @Test
    void setRadius() {

        Circle circle = new Circle();
        double nuevoRadius = 3.5;
        circle.setRadius(nuevoRadius);
        assertEquals(nuevoRadius, circle.getRadius());
        //Probar que coloca bien el radio a radius

    }

    @Test
    void getArea() {

        double radius = 4.0;
        Circle circle = new Circle(radius);
        double AreaEsperada = Math.PI * radius * radius;
        assertEquals(AreaEsperada, circle.getArea());
        //Aseguramos que calcula bien el area

    }

    @Test
    void getCircumference() {

        double radius = 3.0;
        Circle circle = new Circle(radius);
        double CircumferenceEsperada = 2 * Math.PI * radius;
        assertEquals(CircumferenceEsperada, circle.getCircumference());
        //Aseguramos que calcula bien la circunferencia

    }

    @Test
    void testToString() {

        double radius = 2.5;
        Circle circle = new Circle(radius);
        String StringEsperada = "Circle[radius=" + radius + "]";
        assertEquals(StringEsperada, circle.toString());
        //Asegurar que devuelve el mismo string

    }
}