package A15_LAbTask_4;

public class Card {
    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String display(){
        return rank +" of "+suit;
    }
}
