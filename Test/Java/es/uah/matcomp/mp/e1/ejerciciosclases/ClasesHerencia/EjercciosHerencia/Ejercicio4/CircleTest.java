package es.uah.matcomp.mp.e1.ejerciciosclases.ClasesHerencia.EjercciosHerencia.Ejercicio4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    @Test
    void getRadius() {
        Circle circle = new Circle();

        assertEquals(1.0, circle.getRadius());
    }

    @Test
    void setRadius() {
        Circle circle = new Circle();

        circle.setRadius(7.5);
        assertEquals(7.5, circle.getRadius());
    }

    @Test
    void getArea() {
        Circle circle = new Circle(4.0);

        assertEquals(Math.PI * 4 * 4, circle.getArea());
    }

    @Test
    void getCircumference() {
        Circle circle = new Circle(4.0);

        assertEquals(2 * Math.PI * 4, circle.getCircumference());
    }

    @Test
    void testToString() {
        Circle circle = new Circle(2.5, "green", true);

        assertEquals("Circle[Shape[color=green,filled=true],radius=2.5]", circle.toString());
    }
}