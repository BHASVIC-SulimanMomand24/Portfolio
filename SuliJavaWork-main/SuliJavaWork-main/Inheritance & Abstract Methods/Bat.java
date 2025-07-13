public class Bat extends Mammal {

	Bat() {
        super(false,2,2,2);
	}
	
    private void move() {
        System.out.println("This animal flies");
    }
    
    private void eat() {
        System.out.println("This animal is an omnivore");
    }

    
    private void hibernate() {
        System.out.println("This animal hibernates");
    }

    public void getInfo() {
        System.out.println("Bat: ");
        this.move();
        this.eat();
        this.hibernate();
        this.birth();
    }
}