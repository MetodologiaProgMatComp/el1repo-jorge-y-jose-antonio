package es.uah.matcomp.mp.e1.ejerciciosclases.ClasesHerencia.EjercciosHerencia.Ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StaffTest {

    @Test
    void getSchool() {
        Staff staff = new Staff("Guillermo", "Av del Ejercito 17", "Alvarfañez de Minaya", 50000.0);

        assertEquals("Alvarfañez de Minaya", staff.getSchool());
    }

    @Test
    void setSchool() {
        Staff staff = new Staff("Guillermo", "Av del Ejercito 17", "Alvarfañez de Minaya", 50000.0);

        staff.setSchool("IES Buero Vallejo");
        assertEquals("IES Buero Vallejo", staff.getSchool());
    }

    @Test
    void getPay() {
        Staff staff = new Staff("Guillermo", "Av del Ejercito 17", "Alvarfañez de Minaya", 50000.0);

        assertEquals(50000.0, staff.getPay());
    }

    @Test
    void setPay() {
        Staff staff = new Staff("Guillermo", "Av del Ejercito 17", "Alvarfañez de Minaya", 50000.0);

        staff.setPay(23000.0);
        assertEquals(23000.0, staff.getPay());
    }

    @Test
    void testToString() {
        Staff staff = new Staff("Guillermo", "Av del Ejercito 17", "Alvarfañez de Minaya", 50000.0);

        assertEquals("Staff[Person[name=Guillermo ,address=Av del Ejercito 17] ,school=Alvarfañez de Minaya ,pay=50000.0]", staff.toString());
    }
}