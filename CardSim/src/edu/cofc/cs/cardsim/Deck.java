package edu.cofc.cs.cardsim;

public class Deck extends LinkedList {

    public Deck(){
        this.cards = new LinkedList();
        populateDeck();
        shuffle();
    }

    private void populateDeck(){
        cards = new LinkedList[52];
        for(Suit suit:Suit.values()){
            for(Rank rank: Rank.values()){
                cards.add(new Card(suit, rank, size));
            }

        }
    }
}
