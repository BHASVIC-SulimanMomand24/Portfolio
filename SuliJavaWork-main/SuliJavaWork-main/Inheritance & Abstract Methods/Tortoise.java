public class Tortoise extends Reptile{
    
    Tortoise() {
        super(false, 2,2,0);
    }
    
    private void move() {
        System.out.println("This animal walks");
    }
    
    private void eat() {
        System.out.println("This animal is a herbivore");
    }

    private void hibernate() {
        System.out.println("This animal hibernates");
    }

    public void getInfo() {
        System.out.println("Tortoise: ");
        this.move();
        this.eat();
        this.hibernate();
        this.birth();
    }

    

}