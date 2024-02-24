package es.uah.matcomp.mp.e1.ejerciciosclases.Parte2.Ejercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getId() {
        Customer customer = new Customer(1, "Guillermo", 'm');
        Account account = new Account(101, customer, 500.0);

        assertEquals(101, account.getId());
    }

    @Test
    void getCustomer() {
        Customer customer = new Customer(1, "Guillermo", 'm');
        Account account = new Account(101, customer, 500.0);

        assertEquals(customer, account.getCustomer());
    }

    @Test
    void getBalance() {
        Customer customer = new Customer(1, "Guillermo", 'm');
        Account account = new Account(101, customer, 500.0);

        assertEquals(500.0, account.getBalance());
    }

    @Test
    void setBalance() {
        Customer customer = new Customer(1, "Guillermo", 'm');
        Account account = new Account(101, customer, 500.0);

        account.setBalance(1500.0);
        assertEquals(1500.0, account.getBalance());
    }

    @Test
    void testToString() {
        Customer customer = new Customer(1, "Guillermo", 'm');
        Account account = new Account(101, customer, 500.0);

        String StringEsperado = "Guillermo(1) Balance=$500,00";
        assertEquals(StringEsperado, account.toString());
    }

    @Test
    void getCustomerName() {
        Customer customer = new Customer(1, "Guillermo", 'm');
        Account account = new Account(101, customer, 500.0);

        assertEquals("Guillermo", account.getCustomerName());
    }

    @Test
    void deposit() {
        Customer customer = new Customer(1, "Guillermo", 'm');
        Account account = new Account(101, customer);

        account.deposit(1000.0);
        assertEquals(1000.0, account.getBalance());
    }

    @Test
    void withdraw() {
        //Con dinero suficiente
        Customer customer = new Customer(1, "Guillermo", 'm');
        Account account = new Account(101, customer, 500.0);

        account.withdraw(100.0);
        assertEquals(400.0, account.getBalance());

        //Sin dinero suficiente
        Customer customerI = new Customer(2, "Angela", 'f');
        Account accountI = new Account(102, customerI);

        account.withdraw(10000.0);
        assertEquals(0, accountI.getBalance());
    }
}