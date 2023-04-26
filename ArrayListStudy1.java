package com.green.java.ch07.arraylist;

import java.util.ArrayList;

public class ArrayListStudy1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);//list 의 0번 방에 값을 대입
        list.add(20);//list 의 1번 방에 값을 대입
        list.add("ddd");//object타입으로 값을 받기때문에 정수실수 타입에관계없이대입가능

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
    int n1 = (int)list.get(0);
    //object->int로 형변환 시킴

    }
}
