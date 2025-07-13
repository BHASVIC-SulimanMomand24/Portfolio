import java.util.Random;

public class Dice {
    private int die1;
    private int die2;

    public  void rollDice(Card card, Player player, Dice dice)  { //rolls the dice
        Random rand = new Random();
        die1 = rand.nextInt(6) + 1;
        die2 = rand.nextInt(6) + 1;
        System.out.println("you rolled a: " + dice.getSum()); //displays what has been rolled
        if(isDouble()) { // draws a card if player has rolled a double
            System.out.println("you rolled a Double!!");
            card.drawCard(player);
        }
    }
    public int getDie1() {
        return die1;
    } //used in gui to display die1
    public int getDie2() {
        return die2;
    } //used in gui to display die2
    public int getSum() {
        return die1 + die2;
    }

    private boolean isDouble() {
        return die1 == die2;
    } //checks if a double is rolled
}
