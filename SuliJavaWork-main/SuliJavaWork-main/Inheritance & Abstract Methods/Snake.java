public class Snake extends Reptile {

    Snake() {
        super(true,0,0,0);
    }
    
    private void move() {
        System.out.println("This animal slithers");
    }
    
    private void eat() {
        System.out.println("This animal is a carnivore");
    }

    private void hibernate() {
        System.out.println("This animal hibernates");
    }

    public void getInfo() {
        System.out.println("Snake: ");
        this.move();
        this.eat();
        this.hibernate();
    }
}