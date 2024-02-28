package es.uah.matcomp.mp.e1.ejerciciosclases.ClasesHerencia.EjercciosHerencia.Ejercicio5;

public class ProbarClases {
    public static void main(String[] args) {
        Animal animal = new Animal("Manue");
        System.out.println(animal); //Llamada al toString

        Mammal mamifero = new Mammal("Alberto");
        System.out.println(mamifero);   //Llamada al toString

        Cat gato = new Cat("Jose Luis");
        System.out.println(gato);   //Llamada al toString
        gato.greets();

        Dog perro = new Dog("Henry");
        Dog perrazo = new Dog("Marte");
        System.out.println(perro);   //Llamada al toString
        System.out.println(perrazo);   //Llamada al toString
        perro.greets();
        perrazo.greets(perro);

        //No se puede hacer la llamada greets() sobre Animal porque no está definida en esa clase,
        //sino en una de sus subclases y la herencia solo va hacia abajo
    }
}
