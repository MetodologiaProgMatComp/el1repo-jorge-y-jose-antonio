package es.uah.matcomp.mp.e1.ejerciciosclases.ClasesHerencia.EjercciosHerencia.Ejercicio2;

public class Point3D extends Point2D{
    private float z;

    public Point3D() {
        super();
        this.z = 0.0F;
    }

    public Point3D(float x,float y,float z) {
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] result = new float[3]; // construct an array of 3 elements
        result[0] = getX();
        result[1] = getY();
        result[2] = this.z;
        return result; // return the array
    }

    public void setXYZ(float x, float y, float z) {
        setX(x); // or super.setX(x), use setter in superclass
        setY(y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")";
    }
}
