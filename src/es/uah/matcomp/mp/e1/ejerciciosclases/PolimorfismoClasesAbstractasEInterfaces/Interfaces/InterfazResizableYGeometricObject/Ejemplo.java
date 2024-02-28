package es.uah.matcomp.mp.e1.ejerciciosclases.PolimorfismoClasesAbstractasEInterfaces.Interfaces.InterfazResizableYGeometricObject;

public class Ejemplo {
    public static void main(String[] args) {

        //Para el circle normal.
        Circle c1 = new Circle(1);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        //Para el ResizableCircle
        ResizableCircle rc1  = new ResizableCircle(1);
        System.out.println(rc1);
        rc1.resize(200);
        System.out.println(rc1);
        rc1.resize(25);
        System.out.println(rc1);

    }
}
