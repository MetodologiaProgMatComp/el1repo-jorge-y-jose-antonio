package es.uah.matcomp.mp.e1.ejerciciosclases.ClasesHerencia.DiferenciasEntreComposicionYHerencia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    void testToString() {
        Line line = new Line(new Point(1, 2), new Point(3, 4));

        assertEquals("Line[Begin:Point: (1,2),End:Point: (3,4)]", line.toString());
    }

    @Test
    void getBegin() {
        Point point = new Point(1, 2);
        Line line = new Line(point,new Point(3, 4));

        assertEquals(point, line.getBegin());
    }

    @Test
    void setBegin() {
        Line line = new Line(new Point(1, 2), new Point(3, 4));

        Point pointNuevo = new Point(5, 6);
        line.setBegin(pointNuevo);
        assertEquals(pointNuevo, line.getBegin());
    }

    @Test
    void getEnd() {
        Point point = new Point(3, 4);
        Line line = new Line(new Point(1, 2),point);

        assertEquals(point, line.getEnd());
    }

    @Test
    void setEnd() {
        Line line = new Line(new Point(1, 2), new Point(3, 4));

        Point pointNuevo = new Point(5, 6);
        line.setEnd(pointNuevo);
        assertEquals(pointNuevo, line.getEnd());
    }

    @Test
    void getBeginX() {
        Line line = new Line(1, 2, 3, 4);

        assertEquals(1, line.getBeginX());
    }

    @Test
    void setBeginX() {
        Line line = new Line(1, 2, 3, 4);

        line.setBeginX(5);
        assertEquals(5, line.getBeginX());
    }

    @Test
    void getBeginY() {
        Line line = new Line(1, 2, 3, 4);

        assertEquals(2, line.getBeginY());
    }

    @Test
    void setBeginY() {
        Line line = new Line(1, 2, 3, 4);

        line.setBeginY(5);
        assertEquals(5, line.getBeginY());
    }

    @Test
    void getEndX() {
        Line line = new Line(1, 2, 3, 4);

        assertEquals(3, line.getEndX());
    }

    @Test
    void setEndX() {
        Line line = new Line(1, 2, 3, 4);

        line.setEndX(5);
        assertEquals(5, line.getEndX());
    }

    @Test
    void getEndY() {
        Line line = new Line(1, 2, 3, 4);

        assertEquals(4, line.getEndY());
    }

    @Test
    void setEndY() {
        Line line = new Line(1, 2, 3, 4);

        line.setEndY(5);
        assertEquals(5, line.getEndY());
    }

    @Test
    void getBeginXY() {
        Line line = new Line(new Point(1, 2), new Point(3, 4));

        int[] esperado = {1, 2};
        assertArrayEquals(esperado, line.getBeginXY());
    }

    @Test
    void setBeginXY() {
        Line line = new Line(new Point(1, 2), new Point(3, 4));

        line.setBeginXY(5, 6);
        int[] esperado = {5, 6};
        assertArrayEquals(esperado, line.getBeginXY());
    }

    @Test
    void getEndXY() {
        Line line = new Line(new Point(1, 2), new Point(3, 4));

        int[] esperado = {3, 4};
        assertArrayEquals(esperado, line.getEndXY());
    }

    @Test
    void setEndXY() {
        Line line = new Line(new Point(1, 2), new Point(3, 4));

        line.setEndXY(5, 6);
        int[] expected = {5, 6};
        assertArrayEquals(expected, line.getEndXY());
    }

    @Test
    void getLength() {
        Line line = new Line(new Point(1, 2), new Point(4, 6));

        assertEquals(5.0, line.getLength());
    }

    @Test
    void getGradient() {
        Line line = new Line(new Point(1, 1), new Point(2, 2));

        assertEquals(0.7853981633974483,line.getGradient());
    }
}