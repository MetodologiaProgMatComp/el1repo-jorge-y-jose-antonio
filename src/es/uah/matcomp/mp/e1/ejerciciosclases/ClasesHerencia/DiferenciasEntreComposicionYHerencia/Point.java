package es.uah.matcomp.mp.e1.ejerciciosclases.ClasesHerencia.DiferenciasEntreComposicionYHerencia;

public class Point {
    // Private variables
    private int x; // x co-ordinate
    private int y; // y co-ordinate

    // Constructor
    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Public methods
    public String toString() {
        return "Point: (" + x + "," + y + ")";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXY() {
        int[] XY = new int[2];
        XY[0] = x;
        XY[1] = y;
        return XY;
    }

    public double distance(int xn, int yn) {

        return Math.sqrt(Math.pow((this.x - xn),2) + Math.pow((this.y - yn),2));
    }

    public double distance(Point another) {
        return Math.sqrt(Math.pow((this.x - another.getX()),2) + Math.pow((this.y - another.getY()),2));
    }

    public double distance() {
        return (Math.sqrt(Math.pow((this.x),2)+Math.pow((this.y),2)));
    }
}
