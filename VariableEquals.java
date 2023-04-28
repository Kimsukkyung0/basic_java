package com.green.java.ch02;

public class VariableEquals {
    public static void main(String[] args) {
        NumberBox nb1 = new NumberBox(10);
        NumberBox nb2 = new NumberBox(10);

        boolean r1 = (nb1 == nb2);
        System.out.println("r1 : "+r1);
        boolean r2 = nb1.equals(nb2);
        System.out.println("r2 : " +r2);

    }

}

class NumberBox{
    private int num;

    int getNum(){
        return num;
    }
    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof NumberBox)){//nb의 비교대상이 instance of numberbox가 ? ?
            return false;
        }
        NumberBox nb = (NumberBox)obj;
        return this.num == nb.getNum();
        }

    NumberBox(int num){
        this.num = num;
    }
}
