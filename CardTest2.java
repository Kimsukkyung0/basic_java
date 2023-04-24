package com.green.java.ch07_review;

public class CardTest2 {
    public static void main(String[] args) {
       CardDeck2 cdk2 = new CardDeck2();//초기화/호출
        cdk2.openCards();
        cdk2.shuffle();
        System.out.println("===========");
        cdk2.openCards();
        Cards pickCard = cdk2.Pick();//cdk2의 pick 메서드 불러와서card타입에 넣기(return 메서드)
    }
}
