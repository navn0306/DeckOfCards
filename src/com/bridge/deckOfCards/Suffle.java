package com.bridge.deckOfCards;

import java.util.Random;

public class Suffle {
    // code for shuffle all the cards

    public void shuffleCardsDeck(String[] a) {
        Random random = new Random();
        int j, k;
        String temp;
        for (int i = 0; i < 52; i++) {
            j = random.nextInt(51);
            k = random.nextInt(51);
            if (j != k) {
                temp = a[j];
                a[j] = a[k];
                a[k] = temp;
            }
        }
    }
}