package com.green.java.ch07_review;

public class Cards {
//    public static void main(String[] args) {
        static final String[] TYPES = {"CLOVER","SPADE","HEART","DIAMOND"};
        static final int MAX_NUM = 13;
//        static final String[] NUMS = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

        String kind;
        String num; //멤버변수 선언

        Cards(String kind, String num){
            this.kind = kind;
            this.num = num;
        }//무늬와 번호 값을 받아서 멤버필드에 대입할 수 있는 생성자.
    //이 cards생성자의 존재로 인해 컴파일러에서 자동으로 기본 생성자를 생성하지 않음




}
