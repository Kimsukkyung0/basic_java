package com.green.javasub.ch4.BlackJackGame;

class CardDeck {
    private final static String[] patterns = {"DIAMOND","HEART","CLOVER","SPADE"};
    private final static int CARD_NUM = 13;
    private String NUM=null;
    private String pattern = null;
    int idx = 0;
    CardDeck[] cards = new CardDeck[patterns.length * CARD_NUM];

     CardDeck(){

        for (int i = 0; i <patterns.length; i++) {
            pattern = patterns[i];
            for (int j = 1; j <= CARD_NUM; j++) {
                switch(j){
                    case 1 :
                        NUM = "A";
                        break;
                    case 11:
                        NUM = "J";
                        break;
                    case 12 :
                        NUM = "Q";
                        break;
                    case 13 :
                        NUM = "K";
                        break;
                    default :
                        NUM = String.valueOf(i);


                        ///??더하면 될 것 같은데 왜안돼요 ==>카드 값을 받을 두개의 인자를 가진 카드 가없었음
                }cards[idx++] = Card(pattern, NUM);

            }
        }
    }

    CardDeck Card(String pattern, String NUM){
        this.pattern = pattern;
        this.pattern = NUM;
    } //carddeck 타입을 주었더니 리턴값을 내놓으라네@!!!!?!?

    void Shuffle(){
      CardDeck cd = new CardDeck();
        int n = (int)(Math.random()* (patterns.length * CARD_NUM));
        for (int i = 0; i < cards.length; i++) {

        }
    }



}

