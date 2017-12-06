package lesson171205;

public class ComplexConstructorExample {


    public static void main(String[] args) {
        new Point4DBuilder().setX(1).setY(1).setZ(1).createPoint4D();
        new Point4DBuilder().setY(1).setZ(1).createPoint4D();
        new Point4DBuilder().setX(1).setY(1).createPoint4D();
        new Point4DBuilder().createPoint4D();

    }
}

class Point4D {
    private int x;
    private int y;
    private int z;
    private int t;

    public Point4D(int x, int y, int z, int t) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.t = t;
    }

    public Point4D(int x, int y, int z) {
        this(x,y,z,1);
    }

    public Point4D(int x, int y) {
        this(x,y,0,1);
    }

    public Point4D(int x) {
        this(x,0,0,1);
    }

    public Point4D() {
        this(0,0,0,1);
    }


}

