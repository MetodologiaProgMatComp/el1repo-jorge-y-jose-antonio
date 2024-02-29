package es.uah.matcomp.mp.e1.ejerciciosclases.PolimorfismoClasesAbstractasEInterfaces.ClasesAbstractas.SuperclaseAbstractaShapeYSusSubclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getSide() {
        Square square = new Square();

        assertEquals(1, square.getSide());
    }

    @Test
    void setSide() {
        Square square = new Square(3.0);

        square.setSide(6.0);
        assertEquals(6, square.getSide());
    }

    @Test
    void setWidth() {
        Square square = new Square(3.0);

        square.setWidth(6.0);
        assertEquals(6, square.getSide());
    }

    @Test
    void setLength() {
        Square square = new Square(3.0);

        square.setLength(6.0);
        assertEquals(6, square.getSide());
    }

    @Test
    void testToString() {
        Square square = new Square(3.0, "blue", true);

        assertEquals("Square[Rectangle[Shape[color=blue,filled=true],width=3.0,length=3.0]]", square.toString());
    }
}