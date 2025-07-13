public class Gorilla extends Mammal {

    Gorilla() {
        super(false, 2, 2,0);
    }

    private void move() {
        System.out.println("This animal walks and climbs");
    }

    private void eat() {
        System.out.println("This animal is a herbivore");
    }

    public void getInfo() {
        System.out.println("Gorilla: ");
        this.move();
        this.eat();
        this.birth();
    }
}