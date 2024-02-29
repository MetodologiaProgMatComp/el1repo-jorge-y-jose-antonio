package es.uah.matcomp.mp.e1.ejerciciosclases.PolimorfismoClasesAbstractasEInterfaces.ClasesAbstractas.SuperclaseAbstractaAnimalImplementacionAlternativa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigDogTest {

    @Test
    void greeting() {
        BigDog bigDog = new BigDog();

        bigDog.greeting();
    }

    @Test
    void testGreeting() {
        BigDog bigDog = new BigDog();
        Dog dog = new Dog();

        bigDog.greeting(dog);
    }
}