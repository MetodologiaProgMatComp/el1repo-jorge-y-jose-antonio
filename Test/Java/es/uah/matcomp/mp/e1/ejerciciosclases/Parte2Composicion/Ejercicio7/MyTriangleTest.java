package es.uah.matcomp.mp.e1.ejerciciosclases.Parte2Composicion.Ejercicio7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTriangleTest {

    @Test
    void testToString() {
        MyPoint v1 = new MyPoint(1, 2);
        MyPoint v2 = new MyPoint(3, 4);
        MyPoint v3 = new MyPoint(5, 6);
        MyTriangle triangle = new MyTriangle(v1, v2, v3);

        assertEquals("MyTriangle[v1=(1,2),v2=(3,4),v3=(5,6)]", triangle.toString());
    }

    @Test
    void getPerimeter() {
        MyTriangle triangle = new MyTriangle(0, 0, 0, 3, 4, 0);

        assertEquals(12.0, triangle.getPerimeter());
    }

    @Test
    void getType() {
        //Para equilatero
        MyTriangle triangleEquilatero = new MyTriangle(0, 0, 0, 0, 0, 0);
        assertEquals("Equilateral", triangleEquilatero.getType());

        //Para isosceles
        MyTriangle triangleIsosceles = new MyTriangle(0, 0, 0, 2, 2, 0);
        assertEquals("Isosceles", triangleIsosceles.getType());

        //Para escaleno
        MyTriangle triangleEscaleno = new MyTriangle(1, 1, 4, 3, 7, 2);
        assertEquals("Scalene", triangleEscaleno.getType());
    }
}