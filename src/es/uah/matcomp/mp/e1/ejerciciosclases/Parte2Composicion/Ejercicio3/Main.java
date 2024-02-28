package es.uah.matcomp.mp.e1.ejerciciosclases.Parte2Composicion.Ejercicio3;

public class Main {
    public static void main(String[] args) {

        // Test Customer class
        Customer c1 = new Customer(1001,"Jose Antonio", 'm');
        System.out.println(c1);
        System.out.println("id is: " + c1.getId());
        System.out.println("name is: " + c1.getName());
        System.out.println("gender is: " + c1.getGender());
        // Test Account class
        Account a1 = new Account(101, c1, 888.8);
        System.out.println(a1);
        a1.setBalance(999.9);
        System.out.println(a1);
        System.out.println("id is: " + a1.getId());
        System.out.println("customer is: " + a1.getCustomer()); // Customer's toString()
        System.out.println("amount is: " + a1.getBalance());
        System.out.println("customer's name is: " + a1.getCustomerName());
        //Nuevo costumer con el otro constructor
        Customer c2 = new Customer(1002, "Guillermo", 'm');
        Account a2 = new Account(102, c2);
        System.out.println(a2);
        a2.withdraw(100);
        a2.deposit(2305);
        System.out.println(a2);
        a2.withdraw(2300);
        System.out.println(a2);

    }
}
