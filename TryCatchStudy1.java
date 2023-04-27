package com.green.java.ch8;

public class TryCatchStudy1 {
    public static void main(String[] args) {

        try{
            int result = 10/0;
            System.out.println("다음줄");
            //예외가 발생될 가능성이 있는 로직(source)위치
        }catch(ArithmeticException e){
            System.out.println("Aritmathic 에러발생");
        }catch(Exception e){
            e.printStackTrace();//에러발생의 이유 띄워줌
            System.out.println("예외발생");
            //예외가 발생되었을 때 하고싶은 작업(로직)위치
        }finally{
            System.out.println("끝");
            //옵션, 예외가 발생여부에 관계없이 실행하고 싶은 로직위치
        }
    }
}
