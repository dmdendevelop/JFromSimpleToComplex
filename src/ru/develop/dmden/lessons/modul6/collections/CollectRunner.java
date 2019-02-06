package ru.develop.dmden.lessons.modul6.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectRunner {
    public static void main(String[] args) {
        List<Card> deckOfCards = new ArrayList<>();
        for (Card.Face face : Card.Face.values()) {
            for (Card.Suit suit : Card.Suit.values()) {
                deckOfCards.add(new Card(suit, face));
            }
        }

        System.out.println("Original deck.");
        printPutput(deckOfCards);
        System.out.println("*******************************************************************************");

        System.out.println("Deck after shuffle.");
        Collections.shuffle(deckOfCards);
        printPutput(deckOfCards);
        System.out.println("*******************************************************************************");

        System.out.println("Sorted deck");
        Collections.sort(deckOfCards);
        printPutput(deckOfCards);

        List<Card> deck2 = new ArrayList<>(deckOfCards);
        printPutput(deck2);
        System.out.println("====================================================");
        Collections.fill(deck2, new Card(Card.Suit.DIMONDS, Card.Face.Deuce));
        printPutput(deck2);
        System.out.println("====================================================");
        Collections.fill(deck2, null);
        printPutput(deck2);
        System.out.println("====================================================");
        Collections.copy(deck2, deckOfCards);
        printPutput(deck2);
        System.out.println("====================================================");
        Collections.reverse(deck2);
        printPutput(deck2);
    }

    public static void printPutput(List<Card> deckOfCards) {
        for (int i = 0; i < deckOfCards.size(); i++) {
            System.out.printf("%-20s", deckOfCards.get(i));
            if ((i + 1) % 4 == 0) {
                System.out.println();
            }
        }
    }

    public static class Card implements Comparable<Card> {


        private enum Suit {SPADES, HEARTS, CLUBS, DIMONDS;}


        private enum Face {Ace, Deuce, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King;}

        private final Suit suit;

        private final Face face;

        public Card(Suit suit, Face face) {
            this.suit = suit;
            this.face = face;
        }

        public Suit getSuit() {
            return suit;
        }

        public Face getFace() {
            return face;
        }

        @Override
        public int compareTo(Card card) {
            Face[] values = Face.values();
            List<Face> faces = Arrays.asList(values);

            if (faces.indexOf(this.face) < faces.indexOf(card.face)) {
                return -1;
            } else if (faces.indexOf(this.face) > faces.indexOf(card.face)) {
                return 1;
            } else if (faces.indexOf(this.face) == faces.indexOf(card.face)) {
                return String.valueOf(suit).compareTo(String.valueOf(card.getSuit()));
            }
            return 0;
        }

        @Override
        public String toString() {
            return face + " of " + suit;
        }
    }
}
