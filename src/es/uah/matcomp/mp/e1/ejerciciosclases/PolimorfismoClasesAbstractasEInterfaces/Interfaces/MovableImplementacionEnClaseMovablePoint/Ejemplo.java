package es.uah.matcomp.mp.e1.ejerciciosclases.PolimorfismoClasesAbstractasEInterfaces.Interfaces.MovableImplementacionEnClaseMovablePoint;

public class Ejemplo {
    public static void main(String[] args) {
        MovablePoint movible = new MovablePoint(1,1,1,1);
        System.out.println(movible);    //Llamo al toString

        movible.moveUp();
        System.out.println(movible);    //Llamo al toString

        movible.moveLeft();
        System.out.println(movible);    //Llamo al toString

        movible.moveDown();
        System.out.println(movible);    //Llamo al toString

        movible.moveRight();
        System.out.println(movible);    //Llamo al toString
    }
}
