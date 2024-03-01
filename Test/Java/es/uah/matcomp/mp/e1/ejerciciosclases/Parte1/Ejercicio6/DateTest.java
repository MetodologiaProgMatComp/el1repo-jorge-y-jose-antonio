package es.uah.matcomp.mp.e1.ejerciciosclases.Parte1.Ejercicio6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void getDay() {

        int day = 5;
        Date date = new Date(day, 2, 2022);

        assertEquals(day, date.getDay());

    }

    @Test
    void getMonth() {

        int month = 7;
        Date date = new Date(1, month, 2023);

        assertEquals(month, date.getMonth());

    }

    @Test
    void getYear() {

        int year = 2024;
        Date date = new Date(15, 11, year);

        assertEquals(year, date.getYear());

    }

    @Test
    void setDay() {

        Date date = new Date(25, 6, 2025);

        int DayNuevo = 12;
        date.setDay(DayNuevo);

        assertEquals(DayNuevo, date.getDay());

    }

    @Test
    void setMonth() {

        Date date = new Date(18, 9, 2026);

        int MonthNuevo = 3;
        date.setMonth(MonthNuevo);

        assertEquals(MonthNuevo, date.getMonth());

    }

    @Test
    void setYear() {

        Date date = new Date(7, 4, 2027);

        int YearNuevo = 2030;
        date.setYear(YearNuevo);

        assertEquals(YearNuevo, date.getYear());

    }

    @Test
    void setDate() {

        Date date = new Date(20, 12, 2035);

        int DayNuevo = 8;
        int MonthNuevo = 5;
        int YearNuevo = 2040;

        date.setDate(DayNuevo, MonthNuevo, YearNuevo);

        assertEquals(DayNuevo, date.getDay());
        assertEquals(MonthNuevo, date.getMonth());
        assertEquals(YearNuevo, date.getYear());

    }

    @Test
    void testToString() {

        Date date = new Date(10, 3, 2028);

        String StringEsperado = "10/03/2028";
        assertEquals(StringEsperado, date.toString());

    }
}