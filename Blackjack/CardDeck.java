package com.green.javasub.BlackJack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    public static final String[] PATTERNS = {"♠", "♣", "♥", "◈"};
    public static final int CARD_COUNT = 13;
    private List<Card> cardList;

    public CardDeck() {
        this.cardList = new ArrayList<>();
        for (int i = 0; i < PATTERNS.length; i++) {
            String pt = PATTERNS[i];
            for (int j = 1; j <= CARD_COUNT; j++) {
                String sc = String.valueOf(j);
                cardList.add(new Card(pt, getDenomination(i)));
            }
        }

    }

    public void showSize() {
        System.out.println(cardList.size());
    }


    private String getDenomination(int num) {
        switch (num) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
            default:
                return String.valueOf(num);

        }
    }
//    public Card getCard() {
//        int rd = (int)(Math.random()*cardList.size());
//        cardList.remove(rd);//이미 remove의 경우 지운 값을 리턴하는 기능이있기때문에 바로 return cardList.get(rd)을 적어도됨
//        return cardList.get(rd);
//    }
//이렇게만들수도있다
    private int getRandomIdx(){
        return (int)(Math.random() * cardList.size());
    }

    public Card getCard() {
        return cardList.remove(getRandomIdx());
    }


    public static class BlackJackTest {
        public static void main(String[] args) {
           CardDeck cd = new CardDeck();

        }
    }
}
