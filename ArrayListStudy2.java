package com.green.java.ch07.arraylist;

import java.util.ArrayList;

public class ArrayListStudy2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        double b = 10.2;
        Double d2 = b;
        list.add(10);
        //generic 제네릭
        //List.add("11"); error

        int n1 = list.get(0);
        System.out.println(list); //toString 을 오버라이딩하였기때문에
    }
}
