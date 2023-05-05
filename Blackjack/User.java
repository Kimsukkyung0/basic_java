package com.green.javasub.BlackJack;

package BlackJackfin;
import java.util.ArrayList;
import java.util.List;

public abstract class User {
	List<Card> usercards;
	
	User(){usercards = new ArrayList<>();	} 
	
	//Through the default constructer, put the value in the memberfield arraylist

	public void receiveCard(Card c) { usercards.add(c); }
	
	public List<Card> openCard(){
		return usercards;
	}
	
	private int getScore(List<Card> c) {
		int score = 0;
		for(Card cd : c) {
            //Tried to use enhanced for syntax to simplify..approach to the value...that i want.....
            
			String tmp = cd.getDenomination();
        	switch(tmp) {
			case "A": 
				score+=1;
				break;
			case "J" :
			case "Q" :
			case "K" : 
				score+=10;
				break;
			default : 	
				score = Integer.parseInt(tmp);
			}
		}
		return score;
	}//will try to seperate to two.... 
	
