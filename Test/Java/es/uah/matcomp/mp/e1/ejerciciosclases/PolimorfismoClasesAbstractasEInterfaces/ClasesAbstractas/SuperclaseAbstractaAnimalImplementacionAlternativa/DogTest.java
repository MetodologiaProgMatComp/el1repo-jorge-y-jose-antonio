package es.uah.matcomp.mp.e1.ejerciciosclases.PolimorfismoClasesAbstractasEInterfaces.ClasesAbstractas.SuperclaseAbstractaAnimalImplementacionAlternativa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void greeting() {
        Dog dog1 = new Dog();
        dog1.greeting();
    }

    @Test
    void testGreeting() {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.greeting(dog2);
    }
}