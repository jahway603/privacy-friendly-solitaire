package org.secuso.privacyfriendlysolitaire.model;

/**
 * Created by m0 on 11/17/16.
 */

public class Card {

    /**
     * the rank of the card
     */
    private Rank rank;
    /**
     * the suit of the card
     */
    private Suit suit;

    /**
     * @param rank the rank of the card to be constructed
     * @param suit the suit of the card to be constructed
     */
    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * @return the rank of the card
     */
    public Rank getRank() {
        return rank;
    }

    /**
     * @return the suit of the card
     */
    public Suit getSuit() {
        return suit;
    }

}


