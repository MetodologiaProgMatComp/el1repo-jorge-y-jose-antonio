package es.uah.matcomp.mp.e1.ejerciciosclases.Parte2.Ejercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    @Test
    void getId() {
        Customer customer = new Customer(1, "Guillermo", 10);
        Invoice invoice = new Invoice(101, customer, 100.0);

        assertEquals(101, invoice.getId());
    }

    @Test
    void getCustomer() {
        Customer customer = new Customer(1, "Guillermo", 10);
        Invoice invoice = new Invoice(101, customer, 100.0);

        assertEquals(customer, invoice.getCustomer());
    }

    @Test
    void setCustomer() {
        Customer customer1 = new Customer(1, "Guillermo", 10);
        Invoice invoice = new Invoice(101, customer1, 100.0);

        Customer customer2 = new Customer(2,"Angela",20);

        invoice.setCustomer(customer2);
        assertEquals(customer2, invoice.getCustomer());
    }

    @Test
    void getAmount() {
        Customer customer = new Customer(1, "Guillermo", 10);
        Invoice invoice = new Invoice(101, customer, 100.0);

        assertEquals(100.0, invoice.getAmount());
    }

    @Test
    void setAmount() {
        Customer customer = new Customer(1, "Guillermo", 10);
        Invoice invoice = new Invoice(101, customer, 100.0);

        invoice.setAmount(250.0);
        assertEquals(250.0, invoice.getAmount());
    }

    @Test
    void getCustomerId() {
        Customer customer = new Customer(1, "Guillermo", 10);
        Invoice invoice = new Invoice(101, customer, 100.0);

        assertEquals(1, invoice.getCustomerId());
    }

    @Test
    void getCustomerName() {
        Customer customer = new Customer(1, "Guillermo", 10);
        Invoice invoice = new Invoice(101, customer, 100.0);

        assertEquals("Guillermo", invoice.getCustomerName());
    }

    @Test
    void getCustomerDiscount() {
        Customer customer = new Customer(1, "Guillermo", 10);
        Invoice invoice = new Invoice(101, customer, 100.0);

        assertEquals(10, invoice.getCustomerDiscount());
    }

    @Test
    void getAmountAfterDiscount() {
        Customer customer = new Customer(1, "Guillermo", 10);
        Invoice invoice = new Invoice(101, customer, 100.0);

        assertEquals(90, invoice.getAmountAfterDiscount());
    }

    @Test
    void testToString() {
        Customer customer = new Customer(1, "Guillermo", 10);
        Invoice invoice = new Invoice(101, customer, 100.0);

        String StringEsperado = "Invoice[Id=101, Customer=Guillermo(1)(10%), amount=100.0]";
        assertEquals(StringEsperado, invoice.toString());
    }

}