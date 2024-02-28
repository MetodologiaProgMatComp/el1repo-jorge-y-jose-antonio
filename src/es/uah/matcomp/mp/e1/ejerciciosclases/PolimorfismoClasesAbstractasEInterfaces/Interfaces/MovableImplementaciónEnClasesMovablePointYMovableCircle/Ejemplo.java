package es.uah.matcomp.mp.e1.ejerciciosclases.PolimorfismoClasesAbstractasEInterfaces.Interfaces.MovableImplementaciónEnClasesMovablePointYMovableCircle;


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

        MovableCircle circle = new MovableCircle(1,1,1,1,1);

        System.out.println(circle);    //Llamo al toString

        circle.moveUp();
        System.out.println(circle);    //Llamo al toString

        circle.moveLeft();
        System.out.println(circle);    //Llamo al toString

        circle.moveDown();
        System.out.println(circle);    //Llamo al toString

        circle.moveRight();
        System.out.println(circle);    //Llamo al toString
    }
}
