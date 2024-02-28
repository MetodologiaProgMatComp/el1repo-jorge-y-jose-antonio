package es.uah.matcomp.mp.e1.ejerciciosclases.Parte2Composicion.Ejercicio6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircleTest {

    @Test
    void getCenter() {
        MyPoint center = new MyPoint(3, 4);
        MyCircle circle = new MyCircle(center, 2);

        assertEquals(center, circle.getCenter());
    }

    @Test
    void setCenter() {
        MyCircle circle = new MyCircle(1, 2, 3);
        MyPoint CenterNuevo = new MyPoint(4, 5);

        circle.setCenter(CenterNuevo);
        assertEquals(CenterNuevo, circle.getCenter());
    }

    @Test
    void getRadius() {
        MyCircle circle = new MyCircle();

        assertEquals(1, circle.getRadius());
    }

    @Test
    void setRadius() {
        MyCircle circle = new MyCircle(1, 2, 3);

        circle.setRadius(4);
        assertEquals(4, circle.getRadius());
    }

    @Test
    void getCenterX() {
        MyCircle circle = new MyCircle();

        assertEquals(0, circle.getCenterX());
    }

    @Test
    void setCenterX() {
        MyCircle circle = new MyCircle(1, 2, 3);

        circle.setCenterX(5);
        assertEquals(5, circle.getCenterX());
    }

    @Test
    void getCenterY() {
        MyCircle circle = new MyCircle();

        assertEquals(0, circle.getCenterY());
    }

    @Test
    void setCenterY() {
        MyCircle circle = new MyCircle(1, 2, 3);

        circle.setCenterY(6);
        assertEquals(6, circle.getCenterY());
    }

    @Test
    void getCenterXY() {
        MyCircle circle = new MyCircle(1, 2, 3);

        int[] CenterXYEsperado = {1, 2};
        assertArrayEquals(CenterXYEsperado, circle.getCenterXY());
    }

    @Test
    void setCenterXY() {
        MyCircle circle = new MyCircle(1, 2, 3);

        circle.setCenterXY(7, 8);
        assertEquals(7, circle.getCenterX());
        assertEquals(8, circle.getCenterY());
    }

    @Test
    void testToString() {
        MyCircle circle = new MyCircle(1, 2, 3);

        assertEquals("MyCircle[Radius=3,Center=(1,2)]", circle.toString());
    }

    @Test
    void getArea() {
        MyCircle circle = new MyCircle(1, 2, 4);

        assertEquals(4 * 4 * Math.PI, circle.getArea());
    }

    @Test
    void getCircumference() {
        MyCircle circle = new MyCircle(1, 2, 4);

        assertEquals(8 * Math.PI, circle.getCircumference());
    }

    @Test
    void distance() {
        MyCircle circle1 = new MyCircle(1, 2, 3);
        MyCircle circle2 = new MyCircle(4, 5, 6);

        assertEquals(4.242640687119285, circle1.distance(circle2));
    }
}