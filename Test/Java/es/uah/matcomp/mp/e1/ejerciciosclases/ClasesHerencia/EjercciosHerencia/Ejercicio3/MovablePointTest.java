package es.uah.matcomp.mp.e1.ejerciciosclases.ClasesHerencia.EjercciosHerencia.Ejercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MovablePointTest {

    @Test
    void getXSpeed() {
        MovablePoint movablePoint = new MovablePoint(1.0F, 2.0F, 3.0F, 4.0F);

        assertEquals(3.0F, movablePoint.getXSpeed());
    }

    @Test
    void setXSpeed() {
        MovablePoint movablePoint = new MovablePoint();

        movablePoint.setXSpeed(2.5F);
        assertEquals(2.5F, movablePoint.getXSpeed());
    }

    @Test
    void getYSpeed() {
        MovablePoint movablePoint = new MovablePoint(1.0F, 2.0F, 3.0F, 4.0F);

        assertEquals(4.0F, movablePoint.getYSpeed());
    }

    @Test
    void setYSpeed() {
        MovablePoint movablePoint = new MovablePoint();

        movablePoint.setYSpeed(3.7F);
        assertEquals(3.7F, movablePoint.getYSpeed());
    }

    @Test
    void getSpeed() {
        MovablePoint movablePoint = new MovablePoint(2.0F, 3.0F, 4.0F, 5.0F);

        assertArrayEquals(new float[]{4.0F, 5.0F}, movablePoint.getSpeed());
    }

    @Test
    void setSpeed() {
        MovablePoint movablePoint = new MovablePoint();

        movablePoint.setSpeed(1.0F, 2.0F);
        assertArrayEquals(new float[]{1.0F, 2.0F}, movablePoint.getSpeed());
    }

    @Test
    void testToString() {
        MovablePoint movablePoint = new MovablePoint(4.0F, 5.0F);

        assertEquals("(0.0,0.0),speed=(4.0,5.0)", movablePoint.toString());
    }

    @Test
    void move() {
        MovablePoint movablePoint = new MovablePoint(1.0F, 2.0F, 0.5F, 0.5F);

        movablePoint.move();
        assertEquals(1.5F, movablePoint.getX());
        assertEquals(2.5F, movablePoint.getY());
    }
}