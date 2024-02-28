package es.uah.matcomp.mp.e1.ejerciciosclases.ClasesHerencia.EjerciciosIntroductorios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    @Test
    void getColor() {
        Circle circle = new Circle();

        assertEquals("red", circle.getColor());
    }

    @Test
    void setRadius() {
        Circle circle = new Circle();

        circle.setRadius(2.5);
        assertEquals(2.5, circle.getRadius());
    }

    @Test
    void setColor() {
        Circle circle = new Circle();

        circle.setColor("green");
        assertEquals("green", circle.getColor());    }

    @Test
    void getRadius() {
        Circle circle = new Circle();

        assertEquals(1.0, circle.getRadius());
    }

    @Test
    void getArea() {
        Circle circle = new Circle(4.0);

        assertEquals(16.0 * Math.PI, circle.getArea());
    }

    @Test
    void testToString() {
        Circle circle = new Circle(2.0, "yellow");

        assertEquals("Circle[radius=2.0 color=yellow]", circle.toString());
    }
}