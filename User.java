package com.green.javasub.BlackJack;

import java.util.ArrayList;
import java.util.List;

public abstract class User {
    private ArrayList<Card> usercards;

    public User(){
        usercards = new ArrayList();
    }
    public void receiveCard(Card c){//이번에도 전역변수로 사용을 안하고 지역변수로 arraylist를 사용함 .
        usercards.add(c);
    }

    public List<Card> openCards(){
        return usercards;//주소값을 리턴한다!//값까지 리턴할 수 있는 거 만들어보기
    }
}
