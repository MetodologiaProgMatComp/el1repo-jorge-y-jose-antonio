package es.uah.matcomp.mp.e1.ejerciciosclases.ClasesHerencia.EjercciosHerencia.Ejercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {

    @Test
    void getX() {
        Point point = new Point();

        assertEquals(0.0F, point.getX());
    }

    @Test
    void setX() {
        Point point = new Point();

        point.setX(4.5F);
        assertEquals(4.5F, point.getX());
    }

    @Test
    void getY() {
        Point point = new Point();

        assertEquals(0.0F, point.getY());
    }

    @Test
    void setY() {
        Point point = new Point();

        point.setY(3.5F);
        assertEquals(3.5F, point.getY());
    }

    @Test
    void getXY() {
        Point point = new Point(2.0F, 4.0F);

        assertArrayEquals(new float[]{2.0F, 4.0F}, point.getXY());
    }

    @Test
    void setXY() {
        Point point = new Point(2.0F, 4.0F);

        point.setXY(3.0F, 5.0F);
        assertArrayEquals(new float[]{3.0F, 5.0F}, point.getXY());
    }

    @Test
    void testToString() {
        Point point = new Point(3.0F, 7.5F);
        assertEquals("(3.0,7.5)", point.toString());
    }
}