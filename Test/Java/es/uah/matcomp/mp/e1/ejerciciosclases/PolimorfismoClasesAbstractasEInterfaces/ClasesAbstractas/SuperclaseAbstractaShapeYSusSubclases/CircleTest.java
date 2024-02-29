package es.uah.matcomp.mp.e1.ejerciciosclases.PolimorfismoClasesAbstractasEInterfaces.ClasesAbstractas.SuperclaseAbstractaShapeYSusSubclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle circle = new Circle();

        assertEquals(1, circle.getRadius());
    }

    @Test
    void setRadius() {
        Circle circle = new Circle(5.0);

        circle.setRadius(8.0);
        assertEquals(8, circle.getRadius());
    }

    @Test
    void getArea() {
        Circle circle = new Circle();

        assertEquals(Math.PI, circle.getArea());
    }

    @Test
    void getPerimeter() {
        Circle circle = new Circle();

        assertEquals(2 * Math.PI, circle.getPerimeter());
    }

    @Test
    void testToString() {
        Circle circle = new Circle(3.5, "blue", true);

        assertEquals("Circle[Shape[color=blue,filled=true],radius=3.5]", circle.toString());
    }
}