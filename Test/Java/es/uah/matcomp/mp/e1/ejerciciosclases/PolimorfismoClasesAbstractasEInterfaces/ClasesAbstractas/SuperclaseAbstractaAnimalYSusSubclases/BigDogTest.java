package es.uah.matcomp.mp.e1.ejerciciosclases.PolimorfismoClasesAbstractasEInterfaces.ClasesAbstractas.SuperclaseAbstractaAnimalYSusSubclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigDogTest {

    @Test
    void greets() {
        BigDog bigDog = new BigDog("Perrazoardo");

        bigDog.greets();
    }

    @Test
    void testGreets() {
        BigDog bigDog = new BigDog("Perrazoardo");
        Dog dog = new Dog("Perroberto");

        bigDog.greets(dog);
    }

    @Test
    void testGreets1() {
        BigDog bigDog = new BigDog("Perrazoardo");
        BigDog bigDog2 = new BigDog("Perrazoberto");

        bigDog.greets(bigDog2);
    }
}