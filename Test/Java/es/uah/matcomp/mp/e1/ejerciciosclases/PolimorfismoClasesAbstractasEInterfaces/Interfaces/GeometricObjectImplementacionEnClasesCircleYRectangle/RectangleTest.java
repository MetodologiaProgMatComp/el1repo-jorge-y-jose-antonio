package es.uah.matcomp.mp.e1.ejerciciosclases.PolimorfismoClasesAbstractasEInterfaces.Interfaces.GeometricObjectImplementacionEnClasesCircleYRectangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testToString() {
        Rectangle rectangle = new Rectangle(4.0, 5.0);

        assertEquals("Rectangle[width=4.0, length=5.0]", rectangle.toString());
    }

    @Test
    void getArea() {
        Rectangle rectangle = new Rectangle(4.0, 5.0);

        assertEquals(20.0, rectangle.getArea());
    }

    @Test
    void getPerimeter() {
        Rectangle rectangle = new Rectangle(4.0, 5.0);

        assertEquals(18.0, rectangle.getPerimeter());
    }
}