package edu.cofc.cs.cardsim;

public abstract class LinkedList {
    protected Card first;
    protected int size;
    public LinkedList(){
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public Card getFirst(){
        return first;
    }
}
