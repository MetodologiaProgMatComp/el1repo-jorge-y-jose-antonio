package es.uah.matcomp.mp.e1.ejerciciosclases.ClasesHerencia.EjercciosHerencia.Ejercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Point2DTest {

    @Test
    void getX() {
        Point2D point = new Point2D();

        assertEquals(0.0F, point.getX());
    }

    @Test
    void setX() {
        Point2D point = new Point2D();

        point.setX(4.5F);
        assertEquals(4.5F, point.getX());
    }

    @Test
    void getY() {
        Point2D point = new Point2D();

        assertEquals(0.0F, point.getY());
    }

    @Test
    void setY() {
        Point2D point = new Point2D();

        point.setY(3.5F);
        assertEquals(3.5F, point.getY());
    }

    @Test
    void getXY() {
        Point2D point = new Point2D(2.0F, 4.0F);

        assertArrayEquals(new float[]{2.0F, 4.0F}, point.getXY());
    }

    @Test
    void setXY() {
        Point2D point = new Point2D(2.0F, 4.0F);

        point.setXY(3.0F, 5.0F);
        assertArrayEquals(new float[]{3.0F, 5.0F}, point.getXY());
    }

    @Test
    void testToString() {
        Point2D point = new Point2D(3.0F, 7.5F);
        assertEquals("(3.0,7.5)", point.toString());
    }
}