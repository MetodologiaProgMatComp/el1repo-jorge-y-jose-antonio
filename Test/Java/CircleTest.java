import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getColor() {
        Circle circle = new Circle();

        assertEquals("red", circle.getColor());
    }

    @Test
    void setRadius() {
        Circle circle = new Circle(8.0);

        circle.setRadius(5.0);
        assertEquals(5.0, circle.getRadius());
    }

    @Test
    void setColor() {
        Circle circle = new Circle();

        circle.setColor("yellow");
        assertEquals("yellow", circle.getColor());
    }

    @Test
    void getRadius() {
        Circle circle = new Circle();

        assertEquals(1.0, circle.getRadius());
    }

    @Test
    void getArea() {
        Circle circle = new Circle();

        assertEquals(Math.PI, circle.getArea());
    }

    @Test
    void testToString() {
        Circle circle = new Circle(8.0, "blue");

        assertEquals("Circle[radius=8.0 color=blue]", circle.toString());
    }
}