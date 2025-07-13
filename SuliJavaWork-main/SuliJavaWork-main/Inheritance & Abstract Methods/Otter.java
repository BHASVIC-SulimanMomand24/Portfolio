public class Otter extends  Mammal {
    
    Otter() {
      super(true, 2, 2, 0);
    }
    
    private void move() {
        System.out.println("This animal walks and swims");
    }
    
    private void eat() {
        System.out.println("This animal is an omnivore");
    }

    public void getInfo() {
        System.out.println("Otter: ");
        this.move();
        this.eat();
        this.birth();
    }
}