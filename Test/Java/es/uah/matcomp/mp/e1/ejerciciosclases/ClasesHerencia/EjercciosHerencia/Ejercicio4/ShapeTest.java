package es.uah.matcomp.mp.e1.ejerciciosclases.ClasesHerencia.EjercciosHerencia.Ejercicio4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void getColor() {
        Shape shape = new Shape();

        assertEquals("red", shape.getColor());
    }

    @Test
    void setColor() {
        Shape shape = new Shape();

        shape.setColor("green");
        assertEquals("green", shape.getColor());
    }

    @Test
    void isFilled() {
        Shape shape = new Shape();

        assertTrue(shape.isFilled());
    }

    @Test
    void setFilled() {
        Shape shape = new Shape();

        shape.setFilled(false);
        assertFalse(shape.isFilled());
    }

    @Test
    void testToString() {
        Shape shape = new Shape("yellow", true);

        assertEquals("Shape[color=yellow,filled=true]", shape.toString());
    }
}