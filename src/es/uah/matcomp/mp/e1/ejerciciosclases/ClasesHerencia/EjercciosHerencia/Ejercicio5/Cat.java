package es.uah.matcomp.mp.e1.ejerciciosclases.ClasesHerencia.EjercciosHerencia.Ejercicio5;

public class Cat extends Mammal{

    public Cat(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat[" + super.toString() + "]";
    }
}
