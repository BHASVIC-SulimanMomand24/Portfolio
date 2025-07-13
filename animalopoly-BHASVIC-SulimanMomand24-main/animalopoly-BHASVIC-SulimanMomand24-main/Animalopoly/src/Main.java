//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Player player = new Player('A', "Apple");
        Card card = new Card();
        Dice dice = new Dice();
        card.cardDeck();
        dice.rollDice(card, player, dice);
      }

}