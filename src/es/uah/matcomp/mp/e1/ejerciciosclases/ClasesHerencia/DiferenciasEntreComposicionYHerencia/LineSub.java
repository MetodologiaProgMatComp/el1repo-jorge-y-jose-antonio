package es.uah.matcomp.mp.e1.ejerciciosclases.ClasesHerencia.DiferenciasEntreComposicionYHerencia;

public class LineSub extends Point {
    // A line needs two points: begin and end.
    // The begin point is inherited from its superclass Point.
    // Private variables
    Point end; // Ending point

    // Constructors
    public LineSub (int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY); // construct the begin Point
        this.end = new Point(endX, endY); // construct the end Point
    }
    public LineSub (Point begin, Point end) { // caller to construct the Points
        super(begin.getX(), begin.getY()); // need to reconstruct the begin Point
        this.end = end;
    }

    // Public methods
    // Inherits methods getX() and getY() from superclass Point

    public void setEnd(Point end) {
        this.end = end;
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public Point getEnd() {
        return end;
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }


    public void setBegin(Point begin) {
        super.setXY(begin.getX(), begin.getY());
    }

    public void setBeginX(int x) {
        super.setX(x);
    }

    public void setBeginY(int y) {
        super.setY(y);
    }

    public void setBeginXY(int x, int y) {
        super.setXY(x, y);
    }

    public Point getBegin() {
        return (Point)this;
    }

    public int getBeginX() {
        return super.getX();
    }

    public int getBeginY() {
        return super.getY();
    }

    @Override
    public String toString() {
        return "Line[Begin:" + super.toString() + ",End:" + end + "]";
    }

    public double getLength() {
        return super.distance(end);
    }

    public double getGradient() {
        return Math.atan2((end.getX() - super.getX()), (end.getY() - super.getY()));
    }

}
