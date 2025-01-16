package deck;

public class PlayingCard{

    public Suit suit;
    public Rank rank;

    public PlayingCard(Rank rank, Suit suit){
        setRank(rank);
        setSuit(suit);
    }

    public Rank getRank(){
        return rank;
    }

    public Suit getSuit(){
        return suit;
    }

    public void setRank(Rank rank){
        this.rank = rank;
    }

    public void setSuit(Suit suit){
        this.suit = suit;
    }

    public String to String(){
        System.out.println(getRank() + " of " + getSuit());
    }
}
