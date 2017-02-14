	Public class BasicRules {
		//BasicRules used for basic setup for rules of netrunner
		int Decksize = 45; //Keeps track of decksize if 0 hasLost = true
		int NumInHand = 5; //Keeps track of number of cards in hand
		int AgendaPoints = 0; //Keeps track of Agenda points if 7 hasWon = true
		int Credits = 5; //Keeps track of credits to see if you can play cards
		int Clicks = 3; //keeps track of number of clicks left
		
		
		Boolean hasWon = false; //if true you WIN!
		Boolean hasLost = false; //if true you LOSE!
		Boolean isTurn = true; //it is your turn
		
	}
