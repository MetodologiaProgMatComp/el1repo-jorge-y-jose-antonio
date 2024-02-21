package es.uah.matcomp.mp.e1.ejerciciosclases.Ejercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getID() {

        String id = "A01";
        Account account = new Account(id, "Jose");

        assertEquals(id, account.getID());

    }

    @Test
    void getName() {

        String name = "Elena";
        Account account = new Account("A02", name);

        assertEquals(name, account.getName());

    }

    @Test
    void getBalance() {

        int balance = 1000;
        Account account = new Account("A03", "Susana", balance);

        assertEquals(balance, account.getBalance());

    }

    @Test
    void credit() {

        Account account = new Account("A04", "Guillermo");

        int amount = 200;
        int BalanceNuevo = account.credit(amount);

        assertEquals(amount, BalanceNuevo);
        assertEquals(amount, account.getBalance());

    }

    @Test
    void debit() {

        //Para comprobar cuando se tiene credito suficiente:
        int BalanceInicial = 500;
        Account account = new Account("A05", "Angela", BalanceInicial);


        int amount = 300;
        int BalanceNuevo = account.debit(amount);

        assertEquals(BalanceInicial - amount, BalanceNuevo);
        assertEquals(BalanceInicial - amount, account.getBalance());

        //Para cuando no tiene credito suficiente:
        Account accountI = new Account("A06", "Jose");

        int amountI = 100;
        int BalanceNuevoI = accountI.debit(amountI);

        assertEquals(0, BalanceNuevoI); // Debería mantenerse en 0
        assertEquals(0, accountI.getBalance()); // Debería mantenerse en 0

    }

    @Test
    void transferTo() {

        //Cuando se tienen fondos suficientes:
        int BalanceInicial1 = 800;
        int BalanceInicial2 = 200;
        Account account1 = new Account("A07", "Guillermo", BalanceInicial1);
        Account account2 = new Account("A08", "Jose", BalanceInicial2);

        int amount = 400;
        int BalanceNuevo1 = account1.transferTo(account2, amount);

        assertEquals(BalanceInicial1 - amount, BalanceNuevo1);
        assertEquals(BalanceInicial1 - amount, account1.getBalance());

        assertEquals(BalanceInicial2 + amount, account2.getBalance());

        //Cuando no se tienen fondos suficientes:
        Account account1I = new Account("A09", "Alvaro", 300);
        Account account2I = new Account("A10", "Angela");

        int amountI = 400;
        int BalanceNuevo1I = account1I.transferTo(account2I, amountI);

        assertEquals(300, BalanceNuevo1I); // Debería mantenerse en 300
        assertEquals(300, account1I.getBalance()); // Debería mantenerse en 300
        assertEquals(0, account2I.getBalance()); // No debería haber cambios (Deberia ser 0)

    }

    @Test
    void testToString() {

        Account account = new Account("A11", "Guillermo", 1500);

        String expectedString = "Account[id=A11, name=Guillermo, balance=1500]";
        assertEquals(expectedString, account.toString());

    }
}