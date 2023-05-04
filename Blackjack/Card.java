package com.green.javasub.BlackJack;

public class Card {
    private String pattern; //무늬
    private String denomination;//점수

    public Card(String pattern,String denomination){
        this.pattern = pattern;
        this.denomination = denomination;
    }//표시될때마다 변환하는게 아니라, 저장 후 점수로 변환하기때문에 String 값으로

    public String getPattern(){
        return pattern;
    }

    public String getDenomination(){
        return denomination;
    }


    }


