package es.uah.matcomp.mp.e1.ejerciciosclases.Parte2Composicion.Ejercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLineTest {

    @Test
    void getBegin() {
        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(3, 4);
        MyLine line = new MyLine(begin, end);

        assertEquals(begin, line.getBegin());
    }

    @Test
    void getEnd() {
        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(3, 4);
        MyLine line = new MyLine(begin, end);

        assertEquals(end, line.getEnd());
    }

    @Test
    void setBegin() {
        MyLine line = new MyLine(1, 2, 3, 4);
        MyPoint BeginNuevo = new MyPoint(5, 6);

        line.setBegin(BeginNuevo);
        assertEquals(BeginNuevo, line.getBegin());
    }

    @Test
    void setEnd() {
        MyLine line = new MyLine(1, 2, 3, 4);
        MyPoint EndNuevo = new MyPoint(7, 8);

        line.setEnd(EndNuevo);
        assertEquals(EndNuevo, line.getEnd());
    }

    @Test
    void getBeginX() {
        MyLine line = new MyLine(1, 2, 3, 4);

        assertEquals(1, line.getBeginX());
    }

    @Test
    void setBeginX() {
        MyLine line = new MyLine(1, 2, 3, 4);

        line.setBeginX(5);
        assertEquals(5, line.getBeginX());
    }

    @Test
    void getBeginY() {
        MyLine line = new MyLine(1, 2, 3, 4);

        assertEquals(2, line.getBeginY());
    }

    @Test
    void setBeginY() {
        MyLine line = new MyLine(1, 2, 3, 4);

        line.setBeginY(6);
        assertEquals(6, line.getBeginY());
    }

    @Test
    void getEndX() {
        MyLine line = new MyLine(1, 2, 3, 4);

        assertEquals(3, line.getEndX());
    }

    @Test
    void setEndX() {
        MyLine line = new MyLine(1, 2, 3, 4);

        line.setEndX(7);
        assertEquals(7, line.getEndX());
    }

    @Test
    void getEndY() {
        MyLine line = new MyLine(1, 2, 3, 4);

        assertEquals(4, line.getEndY());
    }

    @Test
    void setEndY() {
        MyLine line = new MyLine(1, 2, 3, 4);

        line.setEndY(8);
        assertEquals(8, line.getEndY());
    }

    @Test
    void getBeginXY() {
        MyLine line = new MyLine(1, 2, 3, 4);

        int[] BeginXYEsperado = {1, 2};
        assertArrayEquals(BeginXYEsperado, line.getBeginXY());
    }

    @Test
    void setBeginXY() {
        MyLine line = new MyLine(1, 2, 3, 4);

        line.setBeginXY(5, 6);
        assertEquals(5, line.getBeginX());
        assertEquals(6, line.getBeginY());
    }

    @Test
    void getEndXY() {
        MyLine line = new MyLine(1, 2, 3, 4);

        int[] EndXYEsperado = {3, 4};
        assertArrayEquals(EndXYEsperado, line.getEndXY());
    }

    @Test
    void setEndXY() {
        MyLine line = new MyLine(1, 2, 3, 4);

        line.setEndXY(7, 8);
        assertEquals(7, line.getEndX());
        assertEquals(8, line.getEndY());
    }

    @Test
    void getLength() {
        MyLine line = new MyLine(1, 2, 4, 6);

        assertEquals(5.0, line.getLength());
    }

    @Test
    void getGradient() {
        MyLine line = new MyLine(1, 2, 3, 4);

        assertEquals(0.7853981633974483, line.getGradient());
    }

    @Test
    void testToString() {
        MyLine line = new MyLine(1, 2, 3, 4);

        assertEquals("MyLine[Begin=(1,2),End=(3,4)]", line.toString());
    }
}