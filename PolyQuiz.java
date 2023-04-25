package com.green.java.Poly.NewAnimal;

public class PolyQuiz {

    public static void main(String[] args) {
        /*Objectificate all the classes including Animal ,dog, Bulldog..etc
        And also make all animals to cry when is called by their name in parameter;
         */
        Animal ani1 = new Animal();
        Dog dog2 = new Dog();
        dog2.crying();

        Bulldog bd2 = new Bulldog();
        bd2.crying();

        Cat cat = new Cat();
        cat.crying();

        Pony pn = new Pony();
        pn.crying();

        //The process of objectification to use the values from their own class
        Animal ani = dog2;
        ani = bd2;
        ani = cat;
        ani = pn;

        //putting the objects into the ani class

        animalCryingCall(dog2);
        animalCryingCall(bd2);
        animalCryingCall(cat);
        animalCryingCall(pn);


    }


    static void animalCryingCall(Animal ani) {
        ani.crying();
        //if not to make this as a static method, it should be objectificated when it used

    }

}