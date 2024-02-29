package es.uah.matcomp.mp.e1.ejerciciosclases.PolimorfismoClasesAbstractasEInterfaces.ClasesAbstractas.SuperclaseAbstractaShapeYSusSubclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getWidth() {
        Rectangle rectangle = new Rectangle();

        assertEquals(1, rectangle.getWidth());
    }

    @Test
    void setWidth() {
        Rectangle rectangle = new Rectangle(2.0,3.0);

        rectangle.setWidth(8.0);
        assertEquals(8, rectangle.getWidth());
    }

    @Test
    void getLength() {
        Rectangle rectangle = new Rectangle();

        assertEquals(1, rectangle.getLength());
    }

    @Test
    void setLength() {
        Rectangle rectangle = new Rectangle(2.0,3.0);

        rectangle.setLength(8.0);
        assertEquals(8, rectangle.getLength());
    }

    @Test
    void getArea() {
        Rectangle rectangle = new Rectangle();

        assertEquals(1, rectangle.getArea());
    }

    @Test
    void getPerimeter() {
        Rectangle rectangle = new Rectangle();

        assertEquals(4, rectangle.getPerimeter());
    }

    @Test
    void testToString() {
        Rectangle rectangle = new Rectangle(3.0, 2.0, "blue", true);

        assertEquals("Rectangle[Shape[color=blue,filled=true],width=3.0,length=2.0]", rectangle.toString());
    }
}