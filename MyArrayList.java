package com.green.java.ch07.arraylist;


import java.util.Arrays;

public class MyArrayList {
    private int[] items;

    public MyArrayList() {
        items = new int[0];
        System.out.println(items.length);
    }

    public int[] getItems() {
        return items;
    }

//    public void add(int val) {
//        int[] temp = new int[items.length + 1];
//        for (int i = 0; i < temp.length; i++) {
//            temp[temp.length - 1] = val;
//            items = temp;
//        }
//    }내가했다가 10/0,20/0,0,30이 나왔던..

    public void add(int val) {
        int[] temp = new int[items.length + 1];
        temp[items.length]=val;
        for (int i = 0; i < items.length; i++) {
            temp[i] = items[i];

        }items = temp;
    }
    public void printList(){
        System.out.println(Arrays.toString(getItems()));
    }

    @Override
    public String toString(){
        String str = "[";
        if (items.length>0){
            str+= items[0];
            for (int i = 1; i < items.length; i++) {
               str += ","+items[i];
            }
        }
        str += "]";
            return str;
        }//String 을 더하기 할 수 있다는 걸 간과함
//
//    public void add2(int idx ,int val2) {
//        int[] tmp = new int[items.length + 1];
//        tmp[idx] = val2;
//        for (int i = 0; i < items.length; i++) {
//            tmp[i] = items[i];
//
//        }items = tmp;
//    }


//    public void add(int idx, int val) {
//        int[] temp = new int[items.length + 1];
//        for (int i = 0; i < items.length; i++) {
//            temp[i] = items[i];
//            if(idx >= i){
//                temp[i] = items[i+1];
//        }
//        temp[idx]=val;
//
//        }items = temp;
//    } ==>결과값이 [20,100,30,0]
//=========================================================================
//    public void add(int idx, int val) {
//        int[] temp = new int[items.length + 1];
//        for (int i = 0; i < items.length; i++) {
//            temp[idx] = items[i];
//            if(idx > i){
//                temp[i] = items[i];
//            }
//            else {
//                temp[i+1] = items[i];
//            }
//            temp[idx]=val;
//
//        }items = temp;
//    }//결과값 : [10,100,20,30]
//
  //  =========================================================================
    public void add(int idx, int val) {
        if(idx>items.length){
            return;
        }////예외처리 : 처음에 if 를 만나게해서 리턴 값을 넘기도록 하면 됨

        int[] temp = new int[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            temp[idx] = items[i];
            if(idx > i){
                temp[i] = items[i];
            }
            else {
                temp[i+1] = items[i];
            }
            temp[idx]=val;

        }items = temp;
    }//결과값 : [10,100,20,30]



    }


