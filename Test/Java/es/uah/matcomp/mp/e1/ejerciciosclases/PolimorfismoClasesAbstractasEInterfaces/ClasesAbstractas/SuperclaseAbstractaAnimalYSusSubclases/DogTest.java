package es.uah.matcomp.mp.e1.ejerciciosclases.PolimorfismoClasesAbstractasEInterfaces.ClasesAbstractas.SuperclaseAbstractaAnimalYSusSubclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void greets() {
        Dog dog = new Dog("Perroberto");

        dog.greets();
    }

    @Test
    void testGreets() {
        Dog dog = new Dog("Perroberto");
        Dog dog2 = new Dog("Perruardo");

        dog.greets(dog2);
    }
}