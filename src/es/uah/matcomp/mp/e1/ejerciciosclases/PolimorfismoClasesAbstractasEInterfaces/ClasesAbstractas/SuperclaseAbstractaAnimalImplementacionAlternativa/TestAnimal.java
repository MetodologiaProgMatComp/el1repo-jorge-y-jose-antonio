package es.uah.matcomp.mp.e1.ejerciciosclases.PolimorfismoClasesAbstractasEInterfaces.ClasesAbstractas.SuperclaseAbstractaAnimalImplementacionAlternativa;

public class TestAnimal {
    public static void main(String[] args) {
        // Using the subclasses
        Cat cat1 = new Cat();
        cat1.greeting(); //Imprime el greeting de Cat
        Dog dog1 = new Dog();
        dog1.greeting(); //Imprime el greeting de Dog
        BigDog bigDog1 = new BigDog();
        bigDog1.greeting(); //Imprime el greeting de BigDog

        // Using Polymorphism
        Animal animal1 = new Cat();
        animal1.greeting(); //Imprime el greeting de Cat
        Animal animal2 = new Dog();
        animal2.greeting(); //Imprime el greeting de Dog
        Animal animal3 = new BigDog();
        animal3.greeting(); //Imprime el greeting de BigDog
        //Animal animal4 = new Animal(); La clase animal es abstracta, por lo que no puede ser instanciada

        // Downcast
        Dog dog2 = (Dog)animal2;
        //BigDog bigDog2 = (BigDog)animal3;
        //No se puede downcastear a una clase menor, al no ser Dog una clase abstracta
        //Dog dog3 = (Dog)animal3;
        //No se puede upcastear a una clase mayor que no esta definida como abstracta, en este caso Dog
        //Cat cat2 = (Cat)animal2;
        //No se puede hacer un cast a una clase que no esta relacionada con esta, en este caso Cat y dog

        //A partir de aqui da error (al no tener ya puesto los dog y demas)
        //dog2.greeting(dog3);
        //dog3.greeting(dog2);
        //dog2.greeting(bigDog2);
        //bigDog2.greeting(dog2);
        //bigDog2.greeting(bigDog1);
    }
}
