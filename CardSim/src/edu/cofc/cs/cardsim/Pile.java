package edu.cofc.cs.cardsim;

public class Pile extends LinkedList {
    public Pile(){
        size = 0;
    }

    public Card pop(){
        if(size > 0){
            Card returned = first;
            first = returned.getNext; 
            size--;
            return returned;
        }
        return null;
    }

    public Card peek(){
        if(size > 0){
            return first;
        }
        return null;
    }

    public void push(Card newCard){
        first.getPrevious = newCard;
        first = newCard;
        size++;
    }

}
