package es.uah.matcomp.mp.e1.ejerciciosclases.ClasesHerencia.EjercciosHerencia.Ejercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Point3DTest {

    @Test
    void getZ() {
        Point3D point3D = new Point3D();

        assertEquals(0.0F, point3D.getZ());
    }

    @Test
    void setZ() {
        Point3D point3D = new Point3D();

        point3D.setZ(3.7F);
        assertEquals(3.7F, point3D.getZ());
    }

    @Test
    void getXYZ() {
        Point3D point3D = new Point3D(2.0F, 4.0F, 6.0F);

        assertArrayEquals(new float[]{2.0F, 4.0F, 6.0F}, point3D.getXYZ());
    }

    @Test
    void setXYZ() {
        Point3D point3D = new Point3D();

        point3D.setXYZ(3.0F, 5.0F, 7.0F);
        assertArrayEquals(new float[]{3.0F, 5.0F, 7.0F}, point3D.getXYZ());
    }

    @Test
    void testToString() {
        Point3D point3D = new Point3D(3.0F, 7.5F, 9.2F);

        assertEquals("(3.0,7.5,9.2)", point3D.toString());
    }
}