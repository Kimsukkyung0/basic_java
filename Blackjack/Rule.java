package com.green.javasub.BlackJack;


import java.util.List;

public class Rule {

    public int getScore(List<Card> n) {
        int score = 0;
        for (Card c : n) {
            String sv = c.getDenomination();
            switch (sv) {
                case "A":
                    score+= 1;
                case "J":
                case "Q":
                case "K":
                    score+= 10;
                default :
                    score+= Integer.parseInt(sv);
            }
        }
return score;
    }
//}
//전체적인 흐름이 이해가 가지않음.... List<Card>

//
//    public int getScore(List<Card> cardList) {
//        int sum = 0;
//        for (Card c : cardList) {
//            sum += getDenominationToNum(c);
//
//        }
//        return sum;
//    }
//
//
//    private int getDenominationToNum(Card c){
//        switch(c.getDenomination()){
//            case"A": return 1;
//            case"J":
//            case"Q":
//            case"K":
//                return 10;
//            default :
//                return Integer.parseInt(c.getDenomination());
//        }
//    }
}


