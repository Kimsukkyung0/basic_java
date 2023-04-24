package com.green.java.ch07_review;

public class CardDeck2 {
    Cards[] cdk;

    CardDeck2(){//생성자
        cdk = new Cards[52];
        int idk = 0;

        for (int i = 0; i < Cards.TYPES.length; i++) {//4번 돌리기
            for (int j = 1; j <= Cards.MAX_NUM; j++) {//13번 돌리기
                String num = null;
                switch(j){
                    case 1:
                        num = "A";
                        break;
                    case 11:
                        num = "J";
                        break;
                    case 12 :
                        num = "Q";
                        break;
                    case 13 :
                        num = "K";
                        break;
                    default :
                        num = String.valueOf(j);
                }cdk[idk++] = new Cards(Cards.TYPES[i],num);
                }
        }
    }


void openCards(){
        for(Cards dk : cdk){
            System.out.println(dk.kind +", "+dk.num);
        }
}

void shuffle(){
    for (int i = 0; i < cdk.length; i++) {
        int n = (int)(Math.random()*cdk.length);
        Cards tmp = cdk[i];
        cdk[i] = cdk[n];
        cdk[n] = tmp;
    }


    }
    Cards Pick(){
        int i = 0;
        Cards tmp = cdk[i];
        i++;
        return tmp;
}




}
