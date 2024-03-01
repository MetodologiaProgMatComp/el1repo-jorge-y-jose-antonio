package es.uah.matcomp.mp.e1.ejerciciosclases.Parte1.Ejercicio2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getLength() {

        float LengthInicial = 3.5F;
        float width = 2.0F;
        Rectangle rectangle = new Rectangle(LengthInicial, width);

        float LengthDevuelta = rectangle.getLength();

        assertEquals(LengthInicial, LengthDevuelta);
        //Ver si develve lo que tiene que devolver

    }

    @Test
    void setLength() {

        Rectangle rectangle = new Rectangle();
        float NuevaLength = 4.5F;
        rectangle.setLength(NuevaLength);
        assertEquals(NuevaLength, rectangle.getLength());
        //Ver si si lo puesto coincide con el valor

    }

    @Test
    void getWidth() {

        float length = 5.0F;
        float WidthInicial = 4.2F;
        Rectangle rectangle = new Rectangle(length, WidthInicial);

        float WidthDevuelta = rectangle.getWidth();

        assertEquals(WidthInicial, WidthDevuelta);
        //Lo mismo que getLength

    }

    @Test
    void setWidth() {

        Rectangle rectangle = new Rectangle();
        float NuevoWidth = 2.0F;
        rectangle.setWidth(NuevoWidth);
        assertEquals(NuevoWidth, rectangle.getWidth());
        //Lo mismo que setLenght

    }

    @Test
    void getArea() {

        float length = 4.0F;
        float width = 3.0F;
        Rectangle rectangle = new Rectangle(length, width);
        float AreaEsperada = length * width;
        assertEquals(AreaEsperada, rectangle.getArea());
        //Ver si calcula bien el area

    }

    @Test
    void getPerimeter() {

        float length = 6.0F;
        float width = 2.5F;
        Rectangle rectangle = new Rectangle(length, width);
        float PerimeterEsperado = 2 * (width + length);
        assertEquals(PerimeterEsperado, rectangle.getPerimeter());
        //Ver si calcula bien el perimetro

    }

    @Test
    void testToString() {

        float length = 3.0F;
        float width = 2.0F;
        Rectangle rectangle = new Rectangle(length, width);
        String StringEsperada = "Rectangle[length=" + length + ", width=" + width + "]";
        assertEquals(StringEsperada, rectangle.toString());
        //Ver si coincide lo devuelto con lo esperado

    }
}