package com.company;

import java.util.ArrayList;

class people {
    //how many wallets the person has
    private int wallet;

    // this ArrayList of ArrayLists stores the number of cards in each wallet
    // the list is appended to the number and types of each card within each wallet
    // if cards[0] = [0,1,1] that means that there are no discover cards, one mastercard, and one visa in that order
    private ArrayList<ArrayList<Integer>> cards = new ArrayList<ArrayList<Integer>>();

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }
    public int getWallet(){
        return wallet;
    }
    public void addCards(ArrayList a) {
        this.cards.add(a);
    }
    public ArrayList<ArrayList<Integer>> getCards(){
        return cards;
    }
}
