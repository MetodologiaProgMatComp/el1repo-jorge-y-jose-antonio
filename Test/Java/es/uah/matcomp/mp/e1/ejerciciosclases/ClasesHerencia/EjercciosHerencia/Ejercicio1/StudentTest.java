package es.uah.matcomp.mp.e1.ejerciciosclases.ClasesHerencia.EjercciosHerencia.Ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    @Test
    void getProgram() {
        Student student = new Student("Guillermo", "Av del Ejercito 17", "Matematicas y computacion", 2023,1150);

        assertEquals("Matematicas y computacion", student.getProgram());
    }

    @Test
    void setProgram() {
        Student student = new Student("Guillermo", "Av del Ejercito 17", "Matematicas y computacion", 2023,1150);

        student.setProgram("Matematicas");
        assertEquals("Matematicas", student.getProgram());
    }

    @Test
    void getYear() {
        Student student = new Student("Guillermo", "Av del Ejercito 17", "Matematicas y computacion", 2023,1150);

        assertEquals(2023, student.getYear());
    }

    @Test
    void setYear() {
        Student student = new Student("Guillermo", "Av del Ejercito 17", "Matematicas y computacion", 2023,1150);

        student.setYear(2025);
        assertEquals(2025, student.getYear());
    }

    @Test
    void getFee() {
        Student student = new Student("Guillermo", "Av del Ejercito 17", "Matematicas y computacion", 2023,1150);

        assertEquals(1150, student.getFee());
    }

    @Test
    void setFee() {
        Student student = new Student("Guillermo", "Av del Ejercito 17", "Matematicas y computacion", 2023,1150);

        student.setFee(500);
        assertEquals(500, student.getFee());
    }

    @Test
    void testToString() {
        Student student = new Student("Guillermo", "Av del Ejercito 17", "Matematicas y computacion", 2023,1150);

        assertEquals("Student[Person[name=Guillermo ,address=Av del Ejercito 17] ,program=Matematicas y computacion ,year=2023 ,fee=1150.0]", student.toString());
    }
}