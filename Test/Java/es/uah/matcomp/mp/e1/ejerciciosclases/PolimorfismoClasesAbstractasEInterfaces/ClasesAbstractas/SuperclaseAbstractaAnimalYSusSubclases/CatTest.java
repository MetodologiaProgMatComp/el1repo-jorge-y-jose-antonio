package es.uah.matcomp.mp.e1.ejerciciosclases.PolimorfismoClasesAbstractasEInterfaces.ClasesAbstractas.SuperclaseAbstractaAnimalYSusSubclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void greets() {
        Cat cat = new Cat("Don Bigotes");

        cat.greets();
    }
}