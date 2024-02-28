package es.uah.matcomp.mp.e1.ejerciciosclases.ClasesHerencia.EjercciosHerencia.Ejercicio4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    void getWidth() {
        Rectangle rectangle = new Rectangle();

        assertEquals(1.0, rectangle.getWidth(), 0.001);
    }

    @Test
    void setWidth() {
        Rectangle rectangle = new Rectangle();

        rectangle.setWidth(8.5);
        assertEquals(8.5, rectangle.getWidth());
    }

    @Test
    void getLength() {Rectangle rectangle = new Rectangle();

        assertEquals(1.0, rectangle.getLength(), 0.001);
    }

    @Test
    void setLength() {
        Rectangle rectangle = new Rectangle();

        rectangle.setLength(12.0);
        assertEquals(12.0, rectangle.getLength());
    }

    @Test
    void getArea() {
        Rectangle rectangle = new Rectangle(3.0, 4.0);

        assertEquals(12.0, rectangle.getArea());
    }

    @Test
    void getPerimeter() {
        Rectangle rectangle = new Rectangle(3.0, 4.0);

        assertEquals(14.0, rectangle.getPerimeter());
    }

    @Test
    void testToString() {
        Rectangle rectangle = new Rectangle(2.5, 4.0, "green", true);

        assertEquals("Rectangle[Shape[color=green,filled=true],width=2.5,length=4.0]", rectangle.toString());
    }
}