package com.green.java.Poly.NewAnimal;

public class Animal {
    public Animal (){};
    public void crying(){
        System.out.println("animals are crying");
    }
}
        class Dog extends Animal {//This is Method because it has no parameter.
            public void crying(){
                System.out.println("bowwow");
            }

            public void jump(){
                System.out.println("Jump Jump");
            }
        }

        class Bulldog extends Dog{
            public void crying(){
                System.out.println("awoooooew");
            }
        }

        class Cat extends Animal{
            public void crying(){
                System.out.println("meow meow");
            }
        }

        class Pony extends Animal {
            public void crying(){
                System.out.println("neigh neighhh");
            }
        }
//the sub methods 'crying' under the animals were overrided
//same variable name, but the locations are differ