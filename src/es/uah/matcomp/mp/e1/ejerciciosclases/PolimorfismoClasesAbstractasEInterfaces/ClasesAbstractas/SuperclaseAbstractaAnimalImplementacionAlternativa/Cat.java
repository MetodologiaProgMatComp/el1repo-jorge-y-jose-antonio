package es.uah.matcomp.mp.e1.ejerciciosclases.PolimorfismoClasesAbstractasEInterfaces.ClasesAbstractas.SuperclaseAbstractaAnimalImplementacionAlternativa;

public class Cat extends Animal {
    @Override
    public void greeting() {
        System.out.println("Meow!");
    }
}
