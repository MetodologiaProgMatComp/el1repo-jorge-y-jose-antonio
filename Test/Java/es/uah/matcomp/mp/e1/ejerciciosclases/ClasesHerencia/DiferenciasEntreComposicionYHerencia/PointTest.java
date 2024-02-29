package es.uah.matcomp.mp.e1.ejerciciosclases.ClasesHerencia.DiferenciasEntreComposicionYHerencia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void testToString() {
        Point point = new Point(2, 3);

        assertEquals("Point: (2,3)", point.toString());
    }

    @Test
    void getX() {
        Point point = new Point(2, 3);

        assertEquals(2,point.getX());
    }

    @Test
    void setX() {
        Point point = new Point(2, 3);

        point.setX(5);
        assertEquals(5,point.getX());
    }

    @Test
    void getY() {
        Point point = new Point(2, 3);

        assertEquals(3,point.getY());
    }

    @Test
    void setY() {
        Point point = new Point(2, 3);

        point.setY(5);
        assertEquals(5,point.getY());
    }

    @Test
    void setXY() {
        Point point = new Point(2, 3);

        point.setXY(5,8);
        assertEquals(5,point.getX());
        assertEquals(8,point.getY());
    }

    @Test
    void getXY() {
        Point point = new Point(2, 3);

        int[] esperado = {2, 3};
        assertArrayEquals(esperado, point.getXY());
    }

    @Test
    void distance() {
        Point point = new Point(1, 2);

        assertEquals(5,point.distance(4,6));
    }

    @Test
    void testDistance() {
        Point point = new Point(1, 2);
        Point point2 = new Point(4, 6);

        assertEquals(5,point.distance(point2));
    }

    @Test
    void testDistance1() {
        Point point = new Point(3, 4);

        assertEquals(5,point.distance());
    }
}