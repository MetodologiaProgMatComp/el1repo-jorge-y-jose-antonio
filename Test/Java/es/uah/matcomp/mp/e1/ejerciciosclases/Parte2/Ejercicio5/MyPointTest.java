package es.uah.matcomp.mp.e1.ejerciciosclases.Parte2.Ejercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {

    @Test
    void getX() {
        MyPoint point = new MyPoint();
        assertEquals(0, point.getX());
    }

    @Test
    void getY() {
        MyPoint point = new MyPoint();
        assertEquals(0, point.getY());
    }

    @Test
    void setX() {
        MyPoint point = new MyPoint();

        point.setX(5);
        assertEquals(5, point.getX());
    }

    @Test
    void setY() {
        MyPoint point = new MyPoint();

        point.setY(8);
        assertEquals(8, point.getY());
    }

    @Test
    void getXY() {
        MyPoint point = new MyPoint(7, 9);

        int[] XYEsperado = {7, 9};
        assertArrayEquals(XYEsperado, point.getXY());
    }

    @Test
    void setXY() {
        MyPoint point = new MyPoint();

        point.setXY(2, 6);
        assertEquals(2, point.getX());
        assertEquals(6, point.getY());
    }

    @Test
    void testToString() {
        MyPoint point = new MyPoint(1, 2);
        assertEquals("(1,2)", point.toString());
    }

    @Test
    void distance() {
        MyPoint point1 = new MyPoint(1, 2);
        double distance = point1.distance(4, 6);
        assertEquals(5.0, distance);
    }

    @Test
    void testDistance() {
        MyPoint point1 = new MyPoint(1, 2);
        MyPoint point2 = new MyPoint(4, 6);
        double distance = point1.distance(point2);
        assertEquals(5.0, distance);
    }

    @Test
    void testDistance1() {
        MyPoint point = new MyPoint(3, 4);
        double distance = point.distance();
        assertEquals(5.0, distance);
    }
}