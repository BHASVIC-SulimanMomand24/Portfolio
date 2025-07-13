import java.util.ArrayList;

public class Animal {
    private String type;
    private int level;
    private int stopCost;
    private int buyCost;
    private String funFact;
    private Player owner;

    public Animal(String name, String type, int level, int stopCost, int buyCost, String funFact) { // stores all the information about each animal
        this.type = type;
        this.level = level;
        this.stopCost = stopCost;
        this.buyCost = buyCost;
        this.funFact = funFact;
        this.owner = null;
    }

    public void stopNotification() { //this is used when someone else owns animal that you have landed on
        if (owner != null) {
            System.out.println("You have landed on " + owner.getName() + "'s pet " + getSpecies() + ", you have to pay $" + stopCost);
        } else {
            System.out.println("You can buy this animal");
        }
    }

    public boolean purchase(Player player) {
        if (player.getMoney() >= this.buyCost && owner == null) {
            this.owner = player;
            player.changeMoney(player.getMoney() - this.buyCost);
            return true;
        }
        System.out.println("You cannot buy this animal");
        return false;
    }

    public boolean upgrade(Player player) {
        if (player.getMoney() >= this.buyCost) {
            this.level += 1;
            this.stopCost += stopCost;
            player.changeMoney(player.getMoney() - this.buyCost);
            return true;
        }
        System.out.println("You cannot upgrade this animal");
        return false;
    }

    public void getInfo() {
        System.out.println("Species: " + this.type);
        System.out.println("Level: " + this.level);
        System.out.println("Stop cost: $" + this.stopCost);
        System.out.println("Buy cost: $" + this.buyCost);
        System.out.println("Owner: " + this.owner);
        System.out.println("Fun Fact: " + this.funFact);
    }

    public int getLevel() {
        return level;
    }

    public String getSpecies() {
        return type;
    }

    public int getStopCost() {
        return stopCost;
    }

    public int getBuyCost() {
        return buyCost;
    }

    public Player getOwner() {
        return owner;
    }
}
