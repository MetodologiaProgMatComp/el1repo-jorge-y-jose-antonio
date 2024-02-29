package es.uah.matcomp.mp.e1.ejerciciosclases.ClasesHerencia.DiferenciasEntreComposicionYHerencia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineSubTest {

    @Test
    void setEnd() {
        LineSub line = new LineSub(new Point(1, 2), new Point(3, 4));

        Point pointNuevo = new Point(5, 6);
        line.setEnd(pointNuevo);
        assertEquals(pointNuevo, line.getEnd());
    }

    @Test
    void setEndX() {
        LineSub line = new LineSub(1, 2, 3, 4);

        line.setEndX(5);
        assertEquals(5, line.getEndX());
    }

    @Test
    void setEndY() {
        LineSub line = new LineSub(1, 2, 3, 4);

        line.setEndY(5);
        assertEquals(5, line.getEndY());
    }

    @Test
    void setEndXY() {
        LineSub line = new LineSub(1, 2, 3, 4);

        line.setEndXY(5, 6);
        assertEquals(5, line.getEndX());
        assertEquals(6, line.getEndY());
    }

    @Test
    void getEnd() {
        Point point = new Point(3, 4);

        LineSub line = new LineSub(new Point(1, 2),point);

        assertEquals(point, line.getEnd());
    }

    @Test
    void getEndX() {
        LineSub line = new LineSub(1, 2, 3, 4);

        assertEquals(3, line.getEndX());
    }

    @Test
    void getEndY() {
        LineSub line = new LineSub(1, 2, 3, 4);

        assertEquals(4, line.getEndY());
    }

    @Test
    void setBegin() {
        LineSub line = new LineSub(new Point(1, 2), new Point(3, 4));


        Point pointNuevo = new Point(5, 6);

        line.setBegin(pointNuevo);
        assertEquals(5, line.getBeginX());
        assertEquals(6,line.getBeginY());
    }

    @Test
    void setBeginX() {
        LineSub line = new LineSub(1, 2, 3, 4);

        line.setBeginX(5);
        assertEquals(5, line.getBeginX());
    }

    @Test
    void setBeginY() {
        LineSub line = new LineSub(1, 2, 3, 4);

        line.setBeginY(5);
        assertEquals(5, line.getBeginY());
    }

    @Test
    void setBeginXY() {
        LineSub line = new LineSub(1, 2, 3, 4);

        line.setBeginXY(5,6);
        assertEquals(5, line.getBeginX());
        assertEquals(6, line.getBeginY());
    }

    @Test
    void getBegin() {
        Point point = new Point(1, 2);

        LineSub line = new LineSub(point, new Point(3, 4));

        assertEquals(point, line.getBegin());
    }

    @Test
    void getBeginX() {
        LineSub line = new LineSub(1, 2, 3, 4);

        assertEquals(1, line.getBeginX());
    }

    @Test
    void getBeginY() {
        LineSub line = new LineSub(1, 2, 3, 4);

        assertEquals(2, line.getBeginY());
    }

    @Test
    void testToString() {
        LineSub line = new LineSub(new Point(1, 2), new Point(3, 4));

        assertEquals("Line[Begin:Point: (1,2),End:Point: (3,4)]", line.toString());
    }

    @Test
    void getLength() {
        LineSub line = new LineSub(new Point(1, 2), new Point(4, 6));

        assertEquals(5.0, line.getLength());
    }

    @Test
    void getGradient() {
        LineSub line = new LineSub(new Point(1, 2), new Point(4, 6));

        assertEquals(0.6435011087932844, line.getGradient());
    }
}