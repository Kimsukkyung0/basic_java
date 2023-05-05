package com.green.javasub.BlackJack;

import java.util.List;

public class BlackjackTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();
        Rule rule = new Rule();

        
        System.out.println ("Game started");
		
		for(int i=0; i<2; i++) {
			gamer.receiveCard(cd.getCard());
			dealer.receiveCard(cd.getCard());
		}//Distribution! 2cards for each
		
		if (rule.getScore(dealer.openCard()) < 18) {
			dealer.receiveCard(cd.getCard());
		}//if dealer has cards under 18, get another one automatically.
	
			
		dealer.showCard(dealer.openCard());
		gamer.showCard(gamer.openCard());
		
		//showcard has moved from Rule class to user. 
        //kinda struggled cause i skipped to use opencard method when i call the showcard method! method in method..method..
        
        
		Loop:
		while(true) {
			System.out.println("More Card? > (y/n)");
			String answer = scanner.nextLine();		
            if(answer.trim().equalsIgnoreCase("y")) {
				gamer.receiveCard(cd.getCard());
				gamer.showCard(gamer.openCard());
		
				continue Loop;
			}
			else if(answer.trim().equalsIgnoreCase("n")) {
				
				break;
			}
			else {System.out.println("Please provide the valid value");}
				continue Loop;
			}
	
		rule.showWhoisWin();
        
        //ERROR.
		}
