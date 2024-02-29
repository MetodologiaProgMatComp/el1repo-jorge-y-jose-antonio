package es.uah.matcomp.mp.e1.ejerciciosclases.PolimorfismoClasesAbstractasEInterfaces.Interfaces.MovableImplementaciónEnClasesMovablePointYMovableCircle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovableCircleTest {

    @Test
    void testToString() {
        MovableCircle movableCircle = new MovableCircle(1, 1, 1, 1, 1);

        assertEquals("(1,1) speed=(1,1),radius=1", movableCircle.toString());
    }

    @Test
    void moveUp() {
        MovableCircle movableCircle = new MovableCircle(1, 1, 1, 1, 1);

        movableCircle.moveUp();
        assertEquals("(1,0) speed=(1,1),radius=1",movableCircle.toString());
    }

    @Test
    void moveDown() {
        MovableCircle movableCircle = new MovableCircle(1, 1, 1, 1, 1);

        movableCircle.moveDown();
        assertEquals("(1,2) speed=(1,1),radius=1",movableCircle.toString());
    }

    @Test
    void moveLeft() {
        MovableCircle movableCircle = new MovableCircle(1, 1, 1, 1, 1);

        movableCircle.moveLeft();
        assertEquals("(0,1) speed=(1,1),radius=1",movableCircle.toString());
    }

    @Test
    void moveRight() {
        MovableCircle movableCircle = new MovableCircle(1, 1, 1, 1, 1);

        movableCircle.moveRight();
        assertEquals("(2,1) speed=(1,1),radius=1",movableCircle.toString());
    }
}