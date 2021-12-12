package com.bridge.deckOfCards;

public class DeckOfCards {
    public static void main(String[] args) {

        String[] cardType = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] cardNumbers = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        String[] cardsArray = new String[52];
        int start = 0, end = 12, v = 0;

        // for combination of cardType and cardNumbers
        for (int i = 0; i < 4; i++) {
            for (int j = start; j <= end; j++) {
                cardsArray[j] = cardType[i] + " " + cardNumbers[v];
                v++;
            }
            v = 0;
            start = end + 1;
            end += 13;
        }

        Suffle suffle = new Suffle();
        suffle.shuffleCardsDeck(cardsArray);


        // printing cards for 4 players

        int k = 0;
        for (int i = 0; i < 4; i++) {
            System.out.print("For Player " + i + ": \n");
            for (int j = 0; j < 9; j++) {

                System.out.print(cardsArray[k] + "->");
                k++;
            }
            System.out.println();
        }

    }

}