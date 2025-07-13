public class Turtle extends Reptile {
    
    Turtle() {
        super(false,2,2,0);
    }
    
    private void move() {
        System.out.println("This animal crawls and swims");
    }
    
    private void eat() {
        System.out.println("This animal is an omnivore");
    }
    
    private void hibernate() {
        System.out.println("This animal hibernates");
    }
    
    public void getInfo() {
        System.out.println("Turtle: ");
        this.move();
        this.eat();
        this.birth();
        this.hibernate();
        System.out.println();
    }
}