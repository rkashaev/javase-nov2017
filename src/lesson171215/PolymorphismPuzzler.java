package lesson171215;

public class PolymorphismPuzzler {

    public static void main(String[] args) throws Exception {
        PA a = new PA();
        PB1 b1 = new PB1();
        PB2 b2 = new PB2();

        m(a);
        m(b1);
        m(b2);                            // 2

        System.out.println(a.str);
        System.out.println(b1.str);
        System.out.println(b2.str);        // 3
    }

    static void m(PA a) {
        //a.str = "string";
        a.setStr("string");
    }
}

class PA {
    public String str;

    public void setStr(String str) {
        this.str = str;
    }
}

class PB1 extends PA {
    public String str;

    public void setStr(String str) {
        this.str = str;
    }
}

class PB2 extends PA {
    public int str;                    // 1

    public void setStr(int str) {
        this.str = str;
    }
}