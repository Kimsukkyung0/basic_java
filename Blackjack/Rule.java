package com.green.javasub.BlackJack;


import java.util.List;

public class Rule {
//	Gamer gamer = new Gamer();
//	Dealer dealer = new Dealer();

	public int getScore(List<Card> usercards) {
		int score = 0;
		for(Card cd : usercards) { 
			score += getDenominationToScore(cd);
		}
		return score;
	} 
	
	private int getDenominationToScore(Card c) {
		int score = 0;
		String tmp = c.getDenomination();
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
		
		return score;
		}
	
	
	public void showWhoisWin() {
		int dscore = getScore(dealer.openCard());
		int gscore = getScore(gamer.openCard());
        
//Q. How to use the value of dealer cards in the extended gamer and dealer not through the parameters or parameters???    
//For now above two sentences are causing errorrrrrrrrrr

		String winner = null;
		if (dscore>21 && gscore >21) {System.out.println("DRAW");}
		else if (dscore<21 && (21 - dscore> 21 - gscore)) {winner = "Gamer";}
		else if (gscore<21 && (21 - dscore< 21 - gscore)) {winner = "Dealer";}
		
		System.out.printf("%s is win!",winner);
		
	}

	
}
