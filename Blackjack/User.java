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
	
	//I moved method calculating score to Rule. but still can use the value through parameters
	
	public void showCard(List<Card> c) {
		System.out.println("==============");
		for(Card cd : openCard())
		{System.out.print("[ ");
		System.out.printf("%s, %s",cd.getPattern(),cd.getDenomination());
		System.out.println(" ]");}
		System.out.println("==============");
		}	
	}
	
