import java.util.ArrayList;
import java.util.Random;
public class Card {
    private final ArrayList<Card> cards = new ArrayList<>();
    private String desc;
    private int moneyEffect = 0;

    public Card() {;
    }

    public Card(String desc, int moneyEffect) {
        this.desc = desc;
        this.moneyEffect = moneyEffect;
    }

    public void cardDeck() {
        cards.clear();
        cards.add(new Card("You receive a grant for protecting wildlife — collect $150.", 150));
        cards.add(new Card("Your animal sanctuary earns a donation — collect $100.", 100));
        cards.add(new Card("You sell rare animal photos — collect $80.", 80));
        cards.add(new Card("A wildlife documentary pays you for access — collect $200.", 200));
        cards.add(new Card("Your pet training business has a booming season — collect $120.", 120));
        cards.add(new Card("You win a prize at the annual animal show — collect $75.", 75));
        cards.add(new Card("Your animal feed supplier offers a discount — collect $50.", 50));
        cards.add(new Card("A local zoo partners with you for funding — collect $110.", 110));
        cards.add(new Card("You receive a reward for rescuing a wild animal — collect $90.", 90));
        cards.add(new Card("You get sponsorship money for animal care — collect $130.", 130));
        cards.add(new Card("You must repair damage to your animal enclosure — pay $100.", -100));
        cards.add(new Card("Your vehicle is damaged during a wildlife trip — pay $120.", -120));
        cards.add(new Card("You pay a fine for improper animal care — pay $150.", -150));
        cards.add(new Card("Your veterinary bills exceed expectations — pay $90.", -90));
        cards.add(new Card("You pay extra for animal feed due to shortage — pay $80.", -80));
        cards.add(new Card("You are fined for breaking wildlife regulations — pay $130", -130));
        cards.add(new Card("You cover cleanup costs for invasive species — pay $70.", -70));
        cards.add(new Card("You pay for damages after an animal escapes — pay $60.", -60));
        cards.add(new Card("You cover medical bills for an animal injury — pay $100.", -100));
        cards.add(new Card("You spend money on pest control for your habitat — pay $50.", -50));
    }
    public void drawCard(Player player) {
        if (cards.isEmpty()) {
            System.out.println("You don't have any cards in your deck!");
            return;
        }
        int Index = new Random().nextInt(cards.size());
        Card card = cards.get(Index);
        System.out.println("Card: " + card.desc);
        player.changeMoney(card.moneyEffect);
        System.out.println("Balance: " + player.getMoney());
    }

    public String getDesc() {
        return desc;
    }
}
