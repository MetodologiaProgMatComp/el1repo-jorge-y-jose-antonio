package es.uah.matcomp.mp.e1.ejerciciosclases.ClasesHerencia.EjerciciosIntroductorios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CylinderTest {

    @Test
    void getHeight() {
        Cylinder cylinder = new Cylinder();

        assertEquals(1, cylinder.getHeight());
    }

    @Test
    void getArea() {
        Cylinder cylinder = new Cylinder(4);

        assertEquals(2 * Math.PI * 1 * 4 + 2 * (Math.PI * 1 * 1), cylinder.getArea());
    }

    @Test
    void getVolume() {
        Cylinder cylinder = new Cylinder(2, 4);

        assertEquals(Math.PI * 2 * 2 * 4, cylinder.getVolume());
    }

    @Test
    void testToString() {
        Cylinder cylinder = new Cylinder(2, 4);

        assertEquals("Cylinder: subclass of Circle[radius=2.0 color=red] height=4.0", cylinder.toString());
    }
}