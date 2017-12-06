package lesson171205;

public class Point4DBuilder {
    private int x = 0;
    private int y = 0;
    private int z = 0;
    private int t = 1;

    public Point4DBuilder setX(int x) {
        this.x = x;
        return this;
    }

    public Point4DBuilder setY(int y) {
        this.y = y;
        return this;
    }

    public Point4DBuilder setZ(int z) {
        this.z = z;
        return this;
    }

    public Point4DBuilder setT(int t) {
        this.t = t;
        return this;
    }

    public Point4D createPoint4D() {
        return new Point4D(x, y, z, t);
    }
}