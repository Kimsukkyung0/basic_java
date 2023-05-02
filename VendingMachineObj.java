package com.green.java.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineObj {
    private int total;
    private List<Drink> list;
    private List<String> purchaseList = new ArrayList<>();

    public void insert (int money){
        this.total += money;
    }
    public VendingMachineObj(){
        list = new ArrayList<>();

        list.add(new Drink(1000,"Cola","Cocacola",500));
        list.add(new Drink(1500,"Sprite","SevenStars",450));
        list.add(new Drink(2000,"Fanta","Cocacola",500));
    }

//    public void  getList(){
//        Drink dk = new Drink();
//        for (int i = 0; i < list.size(); i++) {
//            System.out.printf("%d. \t", i + 1);
//            System.out.printf("%d, %s, %s,%d ",dk.getPrice(),dk.getLabel(),dk.getCompany(),dk.getMl());
//            System.out.println();
//        }tried to make a getlist for printing menues
//        the reason why it caused error was that i did a instancition which was actually contribute having
//        new object has null value . printing value was "null, 0"
//        }

    public void showMoney(){
        System.out.printf("Current balance is %,d. \n",total);
    }

    public void showMenues(){
        System.out.print("Number \tMenu\tPrice\tcompany\t ml\n");
        int num = 0;
        for(Drink drink : list){
            num++;
            System.out.printf("%,d,\t %s,\t %s,\t%,d\n",drink.getPrice(),drink.getLabel(),drink.getCompany(),drink.getMl());
        }

    }
//    public void purchaseDrink(int num){
//        num-=1;
//        System.out.printf("Purchased %s (-%,d)\n",list.get(num).getLabel(),list.get(num).getPrice());
//        this.total -= list.get(num).getPrice();
//        System.out.println(total);
//    }
//}

    public void PrintPurchase(){
        System.out.println("-----------------");
        System.out.println("Purchase list");
        for (int i = 0; i < purchaseList.size(); i++) {
            if(i>0) {
                System.out.print(",");
            }
            System.out.print(purchaseList.get(i));
        }


    }
    public void purchaseDrink(int num){
        Drink d = list.get(num - 1);
        //put the list.index value in the Drink type variables .
        //way more simplifized.
        System.out.printf("purchased %s (-%,d)\n",list.get(num-1).getLabel(),d.getPrice());
        this.total -= d.getPrice();
        System.out.println(total);
        purchaseList.add(d.getLabel());
    }
}
