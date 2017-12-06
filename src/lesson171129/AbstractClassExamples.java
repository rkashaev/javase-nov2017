package lesson171129;


public class AbstractClassExamples {

    public static void main(String[] args) {
        AbstractPizza p1 = new Margarita();

        p1.cook();

        AbstractPizza p2 = new Pepperoni();

        p2.cook();


    }

}

abstract class AbstractPizza {
    public void cook() {

        System.out.println("Preparing a " + getName());

        prepareDough();

        formDough();

        addToppings();

        bake();

        pack();
    }

    private void pack() {
        System.out.println("packing");
    }

    private void bake() {
        System.out.println("baking pizza");
    }

    private void formDough() {
        System.out.println("forming dough");
    }

    private void prepareDough() {
        System.out.println("preparing dough");
    }

    protected abstract void addToppings();

    protected abstract String getName();

}

class Margarita extends AbstractPizza {

    @Override
    protected void addToppings() {
        System.out.println("Adding tomato and cheese");
    }

    @Override
    protected String getName() {
        return "Margarita";
    }
}

class Pepperoni extends AbstractPizza {

    @Override
    protected void addToppings() {
        System.out.println("Adding tomato, pepper and lots of meat!");
    }

    @Override
    protected String getName() {
        return "Pepperoni";
    }
}