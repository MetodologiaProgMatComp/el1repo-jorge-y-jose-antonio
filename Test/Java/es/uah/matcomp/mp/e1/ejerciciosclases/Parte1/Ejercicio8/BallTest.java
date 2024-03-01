package es.uah.matcomp.mp.e1.ejerciciosclases.Parte1.Ejercicio8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    @Test
    void getX() {

        float x = 15.5F;
        Ball ball = new Ball(x, 20.0F, 5, 2.0F, 1.5F);

        assertEquals(x, ball.getX());

    }

    @Test
    void setX() {

        Ball ball = new Ball(8.0F, 10.0F, 3, 1.0F, 0.5F);

        float XNuevo = 12.5F;
        ball.setX(XNuevo);

        assertEquals(XNuevo, ball.getX());

    }

    @Test
    void getY() {

        float y = 25.0F;
        Ball ball = new Ball(10.0F, y, 4, 0.8F, 1.2F);

        assertEquals(y, ball.getY());

    }

    @Test
    void setY() {

        Ball ball = new Ball(7.0F, 14.5F, 6, 0.5F, 1.0F);

        float YNuevo = 18.0F;
        ball.setY(YNuevo);

        assertEquals(YNuevo, ball.getY());

    }

    @Test
    void getRadius() {

        int radius = 7;
        Ball ball = new Ball(5.0F, 8.0F, radius, 0.7F, 0.9F);

        assertEquals(radius, ball.getRadius());

    }

    @Test
    void setRadius() {

        Ball ball = new Ball(2.0F, 3.0F, 10, 0.3F, 0.2F);

        int RadiusNuevo = 12;
        ball.setRadius(RadiusNuevo);

        assertEquals(RadiusNuevo, ball.getRadius());

    }

    @Test
    void getXDelta() {

        float xDelta = 2.5F;
        Ball ball = new Ball(3.0F, 4.0F, 5, xDelta, 1.0F);

        assertEquals(xDelta, ball.getXDelta());

    }

    @Test
    void setXDelta() {

        Ball ball = new Ball(6.0F, 7.0F, 8, 1.2F, 0.9F);

        float XDeltaNuevo = 3.0F;
        ball.setXDelta(XDeltaNuevo);

        assertEquals(XDeltaNuevo, ball.getXDelta());

    }

    @Test
    void getYDelta() {

        float yDelta = 1.8F;
        Ball ball = new Ball(9.0F, 10.0F, 11, 0.5F, yDelta);

        assertEquals(yDelta, ball.getYDelta());

    }

    @Test
    void setYDelta() {

        Ball ball = new Ball(12.0F, 13.0F, 14, 0.7F, 2.0F);

        float YDeltaNuevo = 1.0F;
        ball.setYDelta(YDeltaNuevo);

        assertEquals(YDeltaNuevo, ball.getYDelta());

    }

    @Test
    void move() {

        Ball ball = new Ball(4.0F, 5.0F, 6, 1.5F, 2.0F);

        ball.move();

        assertEquals(5.5F, ball.getX());
        assertEquals(7.0F, ball.getY());

    }

    @Test
    void reflectHorizontal() {

        Ball ball = new Ball(8.0F, 9.0F, 10, 1.2F, 1.8F);

        ball.reflectHorizontal();

        assertEquals(-1.2F, ball.getXDelta());

    }

    @Test
    void reflectVertical() {

        Ball ball = new Ball(2.0F, 3.0F, 4, 0.6F, 1.0F);

        ball.reflectVertical();

        assertEquals(-1.0F, ball.getYDelta());

    }

    @Test
    void testToString() {

        Ball ball = new Ball(6.0F, 7.0F, 8, 1.5F, 0.9F);

        String StringEsperado = "Ball[(6.0,7.0), speed=(1.5,0.9)]";
        assertEquals(StringEsperado, ball.toString());

    }
}