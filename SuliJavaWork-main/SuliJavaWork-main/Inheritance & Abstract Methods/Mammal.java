public class Mammal extends Animal {
    Mammal(boolean tail, int legs, int arms, int wings) {
        super(false, "fur", tail, legs, arms, wings);

    }
    void birth() {
        System.out.println("this animal gives birth");
    }
}
