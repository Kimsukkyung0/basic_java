package com.green.java.Poly.Animal;

public class Polymorphism {


    public static void main(String[] args) {
        Animal ani1 = new Dog();
        //부모타입은 자식 타입의 주소값을 저장할수있다
        ani1.crying();
//        Dog dog1 = new Animal();//오류 남 자식이 부모의 주소값을 담으려고 해스..
//        Bulldog bulldog = (Bulldog)ani1;런타임에려 = 캐스팅에러.
        Dog dog1 = (Dog)ani1;//ani1에 결국 저장된 값이 Dog이기때문에 오류가 없음
// 강제형변환 이 이루어져야 하는 이유
        ani1.crying();
//        ani1.jump();
        //jump부모님인 Animal 이 jump객체를 갖고있지않기때문에
        //아무리 상속을 받은 dog개체가 갖고있다 하더라도 , 호출할 수 없음
    }
}
