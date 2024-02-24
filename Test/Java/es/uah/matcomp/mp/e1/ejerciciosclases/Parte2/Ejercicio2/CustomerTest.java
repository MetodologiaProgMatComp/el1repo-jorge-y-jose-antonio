package es.uah.matcomp.mp.e1.ejerciciosclases.Parte2.Ejercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getId() {
        Customer customer = new Customer(1, "Guillermo", 10);

        assertEquals(1, customer.getId());
    }

    @Test
    void getName() {
        Customer customer = new Customer(1, "Guillermo", 10);

        assertEquals("Guillermo", customer.getName());
    }

    @Test
    void getDiscount() {
        Customer customer = new Customer(1, "Guillermo", 10);

        assertEquals(10, customer.getDiscount());
    }

    @Test
    void setDiscount() {
        Customer customer = new Customer(1, "Guillermo", 10);

        customer.setDiscount(15);
        assertEquals(15, customer.getDiscount());
    }

    @Test
    void testToString() {
        Customer customer = new Customer(1, "Guillermo", 10);

        String StringEsperado = "Guillermo(1)(10%)";
        assertEquals(StringEsperado, customer.toString());
    }
}