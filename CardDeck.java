package com.green.javasub.BlackJack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    public static final String[] PATTERNS = {"♠","♣","♥","◈"};
    public static final int CARD_COUNT = 13;
    private List<Card> cardList;

//    public CardDeck() {
//        this.cardList = new ArrayList<>();
//        for (String pattern : PATTERNS) {
//            for (int i = 1; i <= CARD_COUNT; i++) {
//                this.cardList.add(new Card(pattern, getDenomination(i)));
//            }
//
//        }
//    }
    private String getDenomination(int num){
        switch(num){
            case 1: return "A";
            case 11: return "J";
            case 12: return "Q";
            case 13: return "K";
            default : return String.valueOf(num);

        }
    }

public CardDeck(){
    this.cardList = new ArrayList<>();
        for (int i = 0; i < PATTERNS.length; i++) {
                String pt = PATTERNS[i];
            for (int j = 1; j < CARD_COUNT; j++) {
                String sc = String.valueOf(j);
                cardList.add(new Card(pt,sc));
                }
            }

        }//두번째삽질


//            String num=null;
//        for (int i = 0; i < PATTERNS.length; i++) {
//            for (int j = 0; j <= CARD_COUNT; j++) {
//                switch(j) {
//                    case 1 :
//                        num = "A";
//                        break;
//                    case 11 :
//                        num = "J";
//                        break;
//                    case 12 :
//                        num = "Q";
//                        break;
//                    case 13 :
//                        num = "K";
//                        break;
//                    default :
//                        num = String.valueOf(j);
//
//                }
//            }this.cardList.add(new Card(PATTERNS[i],num));
//        첫번째삽질


}
