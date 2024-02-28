package es.uah.matcomp.mp.e1.ejerciciosclases.ClasesHerencia.ClaseCilinderConComposicion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CylinderTest {

    @Test
    void getHeight() {
        Cylinder cylinder = new Cylinder();

        assertEquals(1.0, cylinder.getHeight());
    }

    @Test
    void getArea() {
        Cylinder cylinder = new Cylinder();

        assertEquals(12.566370614359172, cylinder.getArea());
    }

    @Test
    void getVolume() {
        Cylinder cylinder = new Cylinder();

        assertEquals(3.141592653589793, cylinder.getVolume());
    }

    @Test
    void testToString() {
        Cylinder cylinder = new Cylinder();

        assertEquals("Cylinder: subclass of Circle[radius=1.0 color=red] height=1.0", cylinder.toString());
    }
}