package es.uah.matcomp.mp.e1.ejerciciosclases.PolimorfismoClasesAbstractasEInterfaces.Interfaces.InterfazResizableYGeometricObject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResizableCircleTest {

    @Test
    void testToString() {
        ResizableCircle resizableCircle = new ResizableCircle(5.0);

        assertEquals("ResizableCircle[Circle[radius=5.0]]", resizableCircle.toString());
    }

    @Test
    void resize() {
        ResizableCircle resizableCircle = new ResizableCircle(2.0);

        resizableCircle.resize(50);
        assertEquals(Math.PI,resizableCircle.getArea());
    }
}