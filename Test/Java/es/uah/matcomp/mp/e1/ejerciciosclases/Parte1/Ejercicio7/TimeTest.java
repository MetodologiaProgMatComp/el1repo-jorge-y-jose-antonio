package es.uah.matcomp.mp.e1.ejerciciosclases.Parte1.Ejercicio7;

import es.uah.matcomp.mp.e1.ejerciciosclases.Parte1.Ejercicio8.Ejercicio7.Time;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void getHour() {

        int hour = 12;
        Time time = new Time(hour, 30, 45);

        assertEquals(hour, time.getHour());

    }

    @Test
    void getMinute() {

        int minute = 45;
        Time time = new Time(5, minute, 20);

        assertEquals(minute, time.getMinute());

    }

    @Test
    void getSecond() {

        int second = 20;
        Time time = new Time(3, 15, second);

        assertEquals(second, time.getSecond());

    }

    @Test
    void setHour() {

        Time time = new Time(9, 40, 15);

        int HourNueva = 18;
        time.setHour(HourNueva);

        assertEquals(HourNueva, time.getHour());

    }

    @Test
    void setMinute() {

        Time time = new Time(2, 10, 30);

        int MinuteNuevo = 55;
        time.setMinute(MinuteNuevo);

        assertEquals(MinuteNuevo, time.getMinute());

    }

    @Test
    void setSecond() {

        Time time = new Time(4, 25, 45);

        int SecondNuevo = 0;
        time.setSecond(SecondNuevo);

        assertEquals(SecondNuevo, time.getSecond());

    }

    @Test
    void setTime() {

        Time time = new Time(7, 15, 30);

        int HourNueva = 14;
        int MinuteNuevo = 40;
        int SecondNuevo = 5;

        time.setTime(HourNueva, MinuteNuevo, SecondNuevo);

        assertEquals(HourNueva, time.getHour());
        assertEquals(MinuteNuevo, time.getMinute());
        assertEquals(SecondNuevo, time.getSecond());

    }

    @Test
    void testToString() {

        Time time = new Time(9, 25, 15);

        String StringEsperado = "09:25:15";
        assertEquals(StringEsperado, time.toString());


    }

    @Test
    void nextSecond() {

        Time time = new Time(23, 59, 59);

        Time TimeDespues = time.nextSecond();

        assertEquals(0, TimeDespues.getHour());
        assertEquals(0, TimeDespues.getMinute());
        assertEquals(0, TimeDespues.getSecond());

        Time time2 = new Time(12, 30, 40);

        Time TimeDespues2 = time2.nextSecond();

        assertEquals(12, TimeDespues2.getHour());
        assertEquals(30, TimeDespues2.getMinute());
        assertEquals(41, TimeDespues2.getSecond());

        Time time3 = new Time(12, 30, 59);

        Time TimeDespues3 = time3.nextSecond();

        assertEquals(12, TimeDespues3.getHour());
        assertEquals(31, TimeDespues3.getMinute());
        assertEquals(0, TimeDespues3.getSecond());

        Time time4 = new Time(12, 59, 59);

        Time TimeDespues4 = time4.nextSecond();

        assertEquals(13, TimeDespues4.getHour());
        assertEquals(0, TimeDespues4.getMinute());
        assertEquals(0, TimeDespues4.getSecond());

    }

    @Test
    void previousSecond() {

        Time time = new Time(0, 0, 1);

        Time TimeAntes = time.previousSecond();

        assertEquals(0, TimeAntes.getHour());
        assertEquals(0, TimeAntes.getMinute());
        assertEquals(0, TimeAntes.getSecond());

        Time time2 = new Time(0, 0, 0);

        Time TimeAntes2 = time2.previousSecond();

        assertEquals(23, TimeAntes2.getHour());
        assertEquals(59, TimeAntes2.getMinute());
        assertEquals(59, TimeAntes2.getSecond());

        Time time3 = new Time(20, 12, 0);

        Time TimeAntes3 = time3.previousSecond();

        assertEquals(20, TimeAntes3.getHour());
        assertEquals(11, TimeAntes3.getMinute());
        assertEquals(59, TimeAntes3.getSecond());

        Time time4 = new Time(20, 0, 0);

        Time TimeAntes4 = time4.previousSecond();

        assertEquals(19, TimeAntes4.getHour());
        assertEquals(59, TimeAntes4.getMinute());
        assertEquals(59, TimeAntes4.getSecond());

    }
}