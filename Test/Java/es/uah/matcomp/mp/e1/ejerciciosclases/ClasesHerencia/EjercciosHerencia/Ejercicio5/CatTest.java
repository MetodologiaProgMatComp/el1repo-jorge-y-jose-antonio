package es.uah.matcomp.mp.e1.ejerciciosclases.ClasesHerencia.EjercciosHerencia.Ejercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CatTest {

    @Test
    void greets() {
        Cat cat = new Cat("Manuel Jose Alberto Tercero de Guadalajara");
        cat.greets();
    }

    @Test
    void testToString() {
        Cat cat = new Cat("Manuel Jose Alberto Tercero de Guadalajara");

        assertEquals("Cat[Mammal[Animal[name=Manuel Jose Alberto Tercero de Guadalajara]]]", cat.toString());
    }
}