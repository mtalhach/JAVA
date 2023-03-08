package A15_LAbTask_4;

import java.security.SecureRandom;

public class DeckOfCards {
    private SecureRandom randomNumbers=new SecureRandom();
    private final int NUMBER_OF_CARDS=52;
    private int currentCard=0;

    Card deck[]=new Card[NUMBER_OF_CARDS];

    public DeckOfCards(){
        String[] suit={"Hearts","Diamonds","Clubs","Spades"};
        String[] rank={"A","1","2","3","4","5","6","7","8","9","10","K","Q","J"};

        for (int i=0;i<deck.length;i++)
            deck[i]=new Card(rank[i%13],suit[i/13]);
    }

    public void ShuffleCard()
    {
        for(int first=0;first<deck.length;first++){
            int second=randomNumbers.nextInt(NUMBER_OF_CARDS);

            Card temp=deck[first];
            deck[first]=deck[second];
            deck[second]=temp;
        }
    }

    public Card dealCards(){
        if(currentCard<deck.length){
            return deck[currentCard++];
        }
        else {
            return null;
        }
    }

}
