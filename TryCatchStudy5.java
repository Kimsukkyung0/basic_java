package com.green.java.ch8;

public class TryCatchStudy5 {
    public static void main(String[] args) {
        try {
            getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            otherGetConnection();
        }catch (Exception e){

        }

    }
    public static void getConnection() throws Exception {
        System.out.println("DB연결!!!!!!!!!!");
    }

    public static void otherGetConnection()throws Exception{
        getConnection();
    }
}
