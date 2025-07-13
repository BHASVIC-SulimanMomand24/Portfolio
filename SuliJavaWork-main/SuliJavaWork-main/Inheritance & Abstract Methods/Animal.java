public abstract class Animal {
    private boolean coldBlooded;
    private String skinType;
    private boolean tail;
    private int legs;
    private int arms;
    private int wings;

    Animal(boolean coldBlooded, String skinType, boolean tail, int legs, int arms, int wings) {
        coldBlooded = false;
        skinType = "";
        this.tail = false;
        this.legs = 0;
        this.arms = 0;
        this.wings = 0;
    }

    public void getInfo() {
        System.out.println("Bat:");
        if (this.coldBlooded)
            System.out.println("This animal is cold-blooded");
        else
            System.out.println("This animal is warm-blooded");
        if (this.skinType != null)
            System.out.println("This animal is covered in " + this.skinType);
        if (this.tail)
            System.out.println("This animal has a tail");
        if (this.legs > 0)
            System.out.println("This animal has " + this.legs + " legs");
        if (this.arms > 0)
            System.out.println("This animal has " + this.arms + " arms");
        if (this.wings > 0)
            System.out.println("This animal has " + this.wings + " wings");

        System.out.println();
    }
}
