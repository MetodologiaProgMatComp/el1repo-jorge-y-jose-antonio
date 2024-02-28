package es.uah.matcomp.mp.e1.ejerciciosclases.Parte2Composicion.Ejercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getId() {
        Customer customer = new Customer(1, "Guillermo", 'm');

        assertEquals(1, customer.getId());
    }

    @Test
    void getName() {
        Customer customer = new Customer(1, "Guillermo", 'm');

        assertEquals("Guillermo", customer.getName());
    }

    @Test
    void getGender() {
        Customer customer = new Customer(1, "Guillermo", 'm');

        assertEquals('m', customer.getGender());
    }

    @Test
    void testToString() {
        Customer customer = new Customer(1, "Guillermo", 'm');

        String StringEsperado = "Guillermo(1)";
        assertEquals(StringEsperado, customer.toString());
    }

}