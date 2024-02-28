package es.uah.matcomp.mp.e1.ejerciciosclases.ClasesHerencia.ClaseCilinderConComposicion;

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

        circle.setRadius(5.0);
        assertEquals(5.0, circle.getRadius());
    }

    @Test
    void setColor() {
        Circle circle = new Circle();

        circle.setColor("green");
        assertEquals("green", circle.getColor());
    }

    @Test
    void getRadius() {
        Circle circle = new Circle();

        assertEquals(1.0, circle.getRadius());
    }

    @Test
    void getArea() {
        Circle circle = new Circle(4.0);

        assertEquals(Math.PI * 4.0 * 4.0, circle.getArea());
    }

    @Test
    void testToString() {
        Circle circle = new Circle(2.5, "yellow");

        assertEquals("Circle[radius=2.5 color=yellow]", circle.toString());
    }
}