package es.uah.matcomp.mp.e1.ejerciciosclases.PolimorfismoClasesAbstractasEInterfaces.ClasesAbstractas.SuperclaseAbstractaAnimalYSusSubclases;

public class Ejemplo {
    public static void main(String[] args) {
        Animal a1 = new Cat("Miauberto");
        a1.greets();

        Cat c1 = (Cat)a1;
        c1.greets();

        Animal a2 = new Dog("Guauberto");
        a2.greets();

        Dog d1 = (Dog)a2;
        d1.greets();

        Animal a3 = new Dog("Perruardo");
        Dog d2 = (Dog)a3;
        d2.greets(d1);

        Animal a4 = new BigDog("Perrazuardo");
        a4.greets();

        BigDog bd1 = new BigDog("Perro Manuel");
        bd1.greets();
        bd1.greets(d2);

        BigDog bd2 = new BigDog("Juan Perro");
        bd1.greets(bd2);
    }
}
