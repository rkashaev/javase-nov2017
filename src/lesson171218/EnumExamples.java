package lesson171218;



public class EnumExamples {
    public static void main(String[] args) {
        CatState s = CatState.EATING;

        System.out.println("before cat");

        Cat c = new Cat(CatState.EATING);
        if (c.state.canIPlay()) {
            System.out.println("I can play with the cat");
        } else {
            System.out.println("I can't play with the cat beacuse it's " + c.state);
        }

        System.out.println(s == c.state);

    }
}

class Cat {
    CatState state;

    public Cat(CatState state) {
        this.state = state;
    }
}

enum CatState {
    SLEEPING(false),
    HUNTING(false),
    EATING(true),
    PLAYING(true);

    boolean accessible;

    CatState(boolean accessible) {
        System.out.println("Creating an instance " + toString());
        this.accessible = accessible;
    }

    public boolean canIPlay() {
        return accessible;
    }
}

