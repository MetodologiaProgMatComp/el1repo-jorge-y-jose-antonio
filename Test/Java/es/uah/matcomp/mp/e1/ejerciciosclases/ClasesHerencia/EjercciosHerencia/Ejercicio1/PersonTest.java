package es.uah.matcomp.mp.e1.ejerciciosclases.ClasesHerencia.EjercciosHerencia.Ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @Test
    void getName() {
        Person person = new Person("Guillermo", "Av del Ejercito 17");

        assertEquals("Guillermo", person.getName());
    }

    @Test
    void getAddress() {
        Person person = new Person("Guillermo", "Av del Ejercito 17");

        assertEquals("Av del Ejercito 17", person.getAddress());
    }

    @Test
    void setAddress() {
        Person person = new Person("Guillermo", "Av del Ejercito 17");

        person.setAddress("Calle constitucion 23");
        assertEquals("Calle constitucion 23", person.getAddress());
    }

    @Test
    void testToString() {
        Person person = new Person("Guillermo", "Av del Ejercito 17");
        assertEquals("Person[name=Guillermo ,address=Av del Ejercito 17]", person.toString());
    }
}