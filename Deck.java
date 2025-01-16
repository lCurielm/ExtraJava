package deck;

import java.util.Random;
import java.util.ArrayList;

public class Deck{

    public static final int NUM_CARDS = 52;
    private  Random generator;
    private ArrayList<PlayingCard> deck;

    public Deck(){
        generator = new Random();
        initialize();
    }

    public Deck(int seed){
        Random generator = new Random(seed);
        initialize();
    }

    public void initialize(){
        deck = new ArrayList<>();
        for (Rank rank: Rank.values()){
            for (Suit suit: Suit.values()){
                deck.add(new PlayingCard(rank, suit));
            }
        }

    }

    public void shuffleDeck(){
        for(int i = NUM_CARDS; i > 0; i--){
            Random num = new Random(i);
            PlayingCard placeHolder = deck.get(i);

            deck.remove(i);
            deck.set(num, PlayingCard);
        }
    }

    public PlayingCard getCard(int index){
        return deck.get(index);
    }

    public String toString(){
        String output = "";

        for (PlayingCard cards = deck){
            output += cards.toString() + \n;
        }

        output.trim();
        return output;
    }
}
