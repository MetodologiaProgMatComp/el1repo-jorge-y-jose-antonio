package es.uah.matcomp.mp.e1.ejerciciosclases.PolimorfismoClasesAbstractasEInterfaces.Interfaces.MovableImplementaciónEnClasesMovablePointYMovableCircle;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed,int radius) {
        this.center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }

    public String toString() {
        return this.center.toString() + ",radius=" + this.radius;
    }

    @Override
    public void moveUp() {
        this.center.y = this.center.y - this.center.ySpeed;
    }

    @Override
    public void moveDown() {
        this.center.y = this.center.y + this.center.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.center.x = this.center.x - this.center.xSpeed;
    }

    @Override
    public void moveRight() {
        this.center.x = this.center.x + this.center.xSpeed;
    }
}