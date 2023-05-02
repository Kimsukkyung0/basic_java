package com.green.java.VendingMachine;

public class Drink {
    private int price;
    private String label;
    private String company;
    private int ml;

    public Drink(){}
   public Drink (int price,String label,String company,int ml){
       this.price = price;
       this.label = label;
       this.company = company;
       this.ml = ml;
   }

    public int getPrice() {
        return price;
    }

    public String getLabel() {
        return label;
    }

    public String getCompany() {
        return company;
    }

    public int getMl() {
        return ml;
    }
}
