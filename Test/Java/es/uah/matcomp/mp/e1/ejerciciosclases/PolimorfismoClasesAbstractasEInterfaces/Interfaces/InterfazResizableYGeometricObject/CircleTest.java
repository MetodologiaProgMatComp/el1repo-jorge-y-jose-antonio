package es.uah.matcomp.mp.e1.ejerciciosclases.PolimorfismoClasesAbstractasEInterfaces.Interfaces.InterfazResizableYGeometricObject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testToString() {
        Circle circle = new Circle(5.0);

        assertEquals("Circle[radius=5.0]", circle.toString());
    }

    @Test
    void getArea() {
        Circle circle = new Circle(1.0);

        assertEquals(Math.PI, circle.getArea());
    }

    @Test
    void getPerimeter() {
        Circle circle = new Circle(1.0);

        assertEquals(2 * Math.PI, circle.getPerimeter());
    }
}