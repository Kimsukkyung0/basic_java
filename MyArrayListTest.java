package com.green.java.ch07.arraylist;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
        myList.add(10);
        myList.printList();
        myList.add(20);
        myList.printList();
        myList.add(30);
        myList.printList();

        myList.add(1, 100);
        System.out.println(myList);
        myList.add(5, 100);


    }
}
