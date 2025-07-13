public class Reptile extends Animal {

    Reptile(boolean tail, int legs, int arms, int wings) {
        super(true, "scales",false,legs,arms,wings  );

    }
     void birth() {
        System.out.println("this animal lays eggs");
    }
}
