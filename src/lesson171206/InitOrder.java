package lesson171206;

public class InitOrder {
    public static void main(String s[]) {
        Point p = new Point();
        System.out.println(p.x + "," + p.y);


        new SingleClassInitOrder(10);
    }
}

class Point {
    int getX() {
        return x;
    }


    int y = getX();
    int x = 3;
}


class SingleClassInitOrder {
    int x = 0;

    {
        System.out.print("1 ");
    }

    static {
        System.out.print("4 ");
    }

    public SingleClassInitOrder() {
        System.out.print("constructor 1 ");
    }

    public SingleClassInitOrder(int x) {
        this();
        System.out.print("constructor 2 ");
    }

    {
        System.out.print("2 ");
    }

    int y = 10;
    {
        System.out.print("3 ");
    }

    static {
        System.out.print("5 ");
    }

}