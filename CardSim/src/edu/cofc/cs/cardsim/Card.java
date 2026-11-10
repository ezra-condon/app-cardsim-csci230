package edu.cofc.cs.cardsim;

public class Card {
    public String suit;
    public String rank;
    private int value;

    public Card(String suit, String rank, int value){
        this.suit = suit;
        this.rank = rank;   
        this.value = value;
    }

    public String getSuit(){
        return suit;
    }

    public String getRank(){
        return rank;
    }

    public int getValue(){
        return value;
    }

    public String toString(){
        return rank + " of " + suit;
    }
}
