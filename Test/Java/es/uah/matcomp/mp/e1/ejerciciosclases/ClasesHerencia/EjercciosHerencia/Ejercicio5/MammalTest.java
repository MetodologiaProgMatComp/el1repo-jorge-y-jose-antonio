package es.uah.matcomp.mp.e1.ejerciciosclases.ClasesHerencia.EjercciosHerencia.Ejercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MammalTest {

    @Test
    void testToString() {
        Mammal mammal = new Mammal("Manue");
        assertEquals("Mammal[Animal[name=Manue]]", mammal.toString());
    }
}