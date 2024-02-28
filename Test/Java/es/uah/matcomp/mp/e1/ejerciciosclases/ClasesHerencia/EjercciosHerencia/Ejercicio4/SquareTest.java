package es.uah.matcomp.mp.e1.ejerciciosclases.ClasesHerencia.EjercciosHerencia.Ejercicio4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {

    @Test
    void getSide() {
        Square square = new Square();

        assertEquals(1.0, square.getSide());
    }

    @Test
    void setSide() {
        Square square = new Square();

        square.setSide(8.5);
        assertEquals(8.5, square.getSide());
    }

    @Test
    void setWidth() {
        Square square = new Square(5.0);

        square.setWidth(10.0);
        assertEquals(10.0, square.getSide());
        assertEquals(10.0, square.getWidth());
        assertEquals(10.0, square.getLength());
    }

    @Test
    void setLength() {
        Square square = new Square(5.0);

        square.setLength(10.0);
        assertEquals(10.0, square.getSide());
        assertEquals(10.0, square.getWidth());
        assertEquals(10.0, square.getLength());
    }

    @Test
    void testToString() {
        Square square = new Square(4.0, "green", true);

        assertEquals("Square[Rectangle[Shape[color=green,filled=true],width=4.0,length=4.0]]", square.toString());
    }
}