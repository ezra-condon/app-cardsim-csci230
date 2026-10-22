package edu.cofc.cs.cardsim;

public class Hand {
    private Card[] hand;
    private int nextSlot;
    public Hand(){
        hand = new Card[11]; //theoretical maximum of 11 cards in a hand (four aces, four 2's, three 3's)
        nextSlot = 0;
    }
    public Card[] getHand(){
        return hand;
    }
    public void drawCard(Card newCard){ //adds card to next open slot
        hand[nextSlot] = newCard;

        for(int i = 0; i < 11; i++){ //redirects nextSlot to next open array spot
            if(hand[i]==null){
                nextSlot = i;
                return;
            }
        }
        
    }

    public void removeCard(int index){
        hand[index] = null;
        nextSlot = index;
    }

    //public void sortHand() //possibly use a sort function here to periodically sort hand?
}
