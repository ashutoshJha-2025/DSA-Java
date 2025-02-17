public class LearnInterface {
    public static void main(String[] args) {
        Monkey m1 = new Monkey();
        m1.ancestors();
        m1.eats();
    }
}

interface Animal {

    int Legs = 4;        // the value of int is by default final;

    void eats();
    void drinks();

    default void walk() {               // This default method in interface means it is not compulsory to add this in our implementation.
        System.out.println("Animal is walking");
    }
}

interface Human {
    void ancestors();
    void drinks();
}

class Monkey implements Animal, Human {

    @Override
    public void eats() {
      System.out.println("Monkey eats banana");
    }

    @Override
    public void ancestors() {
        System.out.println("Both monkey nd human have tailbone");
    }

    @Override
    public void drinks() {
        System.out.println("Monkey is drinking water");
    }
}
