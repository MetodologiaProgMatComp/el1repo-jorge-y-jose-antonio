package es.uah.matcomp.mp.e1.ejerciciosclases.ClasesHerencia.EjercciosHerencia.Ejercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DogTest {

    @Test
    void greets() {
        Dog dog = new Dog("Marte");

        dog.greets();
    }

    @Test
    void testGreets() {
        Dog dog = new Dog("Marte");
        Dog dogazo = new Dog("Henry");

        dog.greets(dogazo);
    }

    @Test
    void testToString() {
        Dog dog = new Dog("Marte");

        assertEquals("Dog[Mammal[Animal[name=Marte]]]", dog.toString());
    }
}