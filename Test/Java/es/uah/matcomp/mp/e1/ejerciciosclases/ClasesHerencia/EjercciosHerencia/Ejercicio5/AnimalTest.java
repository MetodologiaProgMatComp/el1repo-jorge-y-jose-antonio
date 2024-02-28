package es.uah.matcomp.mp.e1.ejerciciosclases.ClasesHerencia.EjercciosHerencia.Ejercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalTest {

    @Test
    void testToString() {
        Animal animal = new Animal("Manue");
        assertEquals("Animal[name=Manue]", animal.toString());
    }
}