package strategy;
	public class BasicRules {
		//BasicRules used for basic setup for rules of netrunner
		public static int Decksize = 45; //Keeps track of decksize if 0 hasLost = true
		public static int NumInHand = 5; //Keeps track of number of cards in hand
		public static int AgendaPoints = 0; //Keeps track of Agenda points if 7 hasWon = true
		public static int Credits = 5; //Keeps track of credits to see if you can play cards
		public static int Clicks = 3; //keeps track of number of clicks left
		
		
		public static Boolean hasWon = false; //if true you WIN!
		public static Boolean hasLost = false; //if true you LOSE!
		public static Boolean isTurn = true; //it is your turn
		
	}
