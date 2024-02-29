package es.uah.matcomp.mp.e1.ejerciciosclases.PolimorfismoClasesAbstractasEInterfaces.Interfaces.MovableImplementacionEnClaseMovablePoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {

    @Test
    void testToString() {
        MovablePoint movablePoint = new MovablePoint(1, 1, 1, 1);

        assertEquals("(1,1) speed=(1,1)",movablePoint.toString());
    }

    @Test
    void moveUp() {
        MovablePoint movablePoint = new MovablePoint(1, 1, 1, 1);
        movablePoint.moveUp();

        assertEquals("(1,0) speed=(1,1)",movablePoint.toString());
    }

    @Test
    void moveDown() {
        MovablePoint movablePoint = new MovablePoint(1, 1, 1, 1);
        movablePoint.moveDown();

        assertEquals("(1,2) speed=(1,1)",movablePoint.toString());
    }

    @Test
    void moveLeft() {
        MovablePoint movablePoint = new MovablePoint(1, 1, 1, 1);
        movablePoint.moveLeft();

        assertEquals("(0,1) speed=(1,1)",movablePoint.toString());
    }

    @Test
    void moveRight() {
        MovablePoint movablePoint = new MovablePoint(1, 1, 1, 1);
        movablePoint.moveRight();

        assertEquals("(2,1) speed=(1,1)",movablePoint.toString());
    }
}