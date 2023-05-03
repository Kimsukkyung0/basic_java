package com.green.javasub.BlackJack;

import java.util.List;

public class BlackjackTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();//user인터페이스를 상속받은
        Rule rule = new Rule();



        cd.showSize();
        Card c = cd.getCard();
        System.out.println(c.getDenomination());
        cd.showSize();

        gamer.receiveCard(cd.getCard());
        gamer.receiveCard(cd.getCard());

        dealer.receiveCard(cd.getCard());//==>둘사이 차이점!??????????????
        dealer.receiveCard(cd.getCard());//==>둘사이 차이점!??????????????

//        List<Card> cardList = gamer.openCards();
//        int score = rule.getScore(cardList);
//        //=

        int gamerScore = rule.getScore(gamer.openCards());
        int dealerScore = rule.getScore(dealer.openCards());
        System.out.println(gamerScore);
        System.out.println(dealerScore);


    }
}
