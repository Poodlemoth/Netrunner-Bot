package decks;
import strategy.BasicRules;

public class HB { //HB meaning Haas bioroid used for making all of the cards in the deck
	
	private static class Card {
		 
		public int cost;
		public int pos;

		public Card (int cost, String type, int pos, String name) {
			this.cost = cost;
		}
		
	private static final Card HedgeFund = new Card (5,"Operation",1,"HedgeFund");
	private static final Card HedgeFund2 = new Card (5,"Operation",2,"HedgeFund");
	private static final Card HedgeFund3 = new Card (5,"Operation",3,"HedgeFund");
	
	private static final Card BioticLabor = new Card (4,"Operation",4,"BioticLabor");
	private static final Card BioticLabor2 = new Card (4,"Operation",5,"BioticLabor");
	private static final Card BioticLabor3 = new Card (4,"Operation",6,"BioticLabor");
	
	private static final Card BlueLevelClearence = new Card(2,"Operation",7,"BlueLevelClearence");
	private static final Card BlueLevelClearence2 = new Card(2,"Operation",8,"BlueLevelClearence");
	private static final Card BlueLevelClearence3 = new Card(2,"Operation",9,"BlueLevelClearence");
	
	private static final Card FriendsInHighPlaces = new Card(2,"Operation",10,"FriendsInHighPlaces");
	private static final Card FriendsInHighPlaces2 = new Card(2,"Operation",11,"FriendsInHighPlaces");
	private static final Card FriendsInHighPlaces3 = new Card(2,"Operation",12,"FriendsInHighPlaces");
	
	private static final Card GreenLevelClearence = new Card(1,"Operation",13,"GreenlevelClearence");
	private static final Card GreenLevelClearence2 = new Card(1,"Operation",14,"GreenlevelClearence");
	private static final Card GreenLevelClearence3 = new Card(1,"Operation",15,"GreenlevelClearence");
	
	private static final Card AcceleratedBetaTest = new Card(3,"Agenda",16," AcceleratedBetaTest");
	private static final Card AcceleratedBetaTest2 = new Card(3,"Agenda",17," AcceleratedBetaTest");
	private static final Card AcceleratedBetaTest3 = new Card(3,"Agenda",18," AcceleratedBetaTest");
	
	private static final Card  GlobalFoodInitiative = new Card(5,"Agenda",19," GlobalFoodInitiative");
	private static final Card  GlobalFoodInitiative2 = new Card(5,"Agenda",20," GlobalFoodInitiative");
	private static final Card  GlobalFoodInitiative3 = new Card(5,"Agenda",21," GlobalFoodInitiative");
	
	private static final Card  ProjectVitruvius = new Card(3,"Agenda",22," ProjectVitruvius");
	private static final Card  ProjectVitruvius2 = new Card(3,"Agenda",23," ProjectVitruvius");
	private static final Card  ProjectVitruvius3 = new Card(3,"Agenda",24," ProjectVitruvius");
	
	private static final Card AdonisCampaign = new Card(4,"Asset",25,"AdonisCampaign");
	private static final Card AdonisCampaign2 = new Card(4,"Asset",26,"AdonisCampaign");
	private static final Card AdonisCampaign3 = new Card(4,"Asset",27,"AdonisCampaign");
	
	private static final Card JacksonHoward = new Card(0,"Asset",28,"JacksonHoward");
	private static final Card JacksonHoward2 = new Card(0,"Asset",29,"JacksonHoward");
	private static final Card JacksonHoward3 = new Card(0,"Asset",30,"JacksonHoward");
	
	private static final Card Eli10 = new Card(3,"Ice",31,"Eli1.0");
	private static final Card Eli102 = new Card(3,"Ice",32,"Eli1.0");
	private static final Card Eli103 = new Card(3,"Ice",33,"Eli1.0");
	
	private static final Card Vanilla = new Card(0,"Ice",34,"Vanilla");
	private static final Card Vanilla2 = new Card(0,"Ice",35,"Vanilla");
	
	private static final Card Fairchild30 = new Card(6,"Ice",36,"Fairchild3.0");
	private static final Card Fairchild302 = new Card(6,"Ice",37,"Fairchild3.0");
	
	private static final Card Magnet = new Card (3,"Ice",38,"Magnet");
	private static final Card Magnet2 = new Card (3,"Ice",39,"Magnet");
	
	private static final Card Tollbooth = new Card (8,"Ice",40,"Tollbooth");
	private static final Card Tollbooth2 = new Card (8,"Ice",41,"Tollbooth");
	
	private static final Card Architect = new Card(4,"Ice",42,"Architect");
	private static final Card Architect2 = new Card(4,"Ice",43,"Architect");
	
	private static final Card Assassin = new Card(7,"Ice",44,"Assassin");
	private static final Card Assassin2 = new Card(7,"Ice",45,"Assassin");
	
	
		
		public int getCost() {
			return cost;
		}
	
		
		public static void PlayHedgeFund() {
				BasicRules.Credits += 4;
				Card.HedgeFund.pos = 0;
		}
		
		public static void PlayBioticLabor() {
			BasicRules.Credits -= Card.BioticLabor.cost;
			BasicRules.Clicks += 2;
			Card.BioticLabor.pos = 0;
		}
		
		public static void PlayBlueLevelClearence() {
			BasicRules.Clicks -= 1;
			BasicRules.Credits += 3;
			BasicRules.NumInHand += 2;
			Card.BlueLevelClearence.pos = 0;
		}
		
		public static void PlayFriendsInHighPlaces() {
			BasicRules.Credits -= 2;
			BasicRules.Clicks = 0;
			Card.FriendsInHighPlaces.pos = 0;
			//figure out how to move 2 cards from archives to play
		}
		
		public static void PlayGreenLevelClearence() {
			BasicRules.Credits += 2;
			BasicRules.NumInHand += 1;
			Card.GreenLevelClearence.pos = 0;
		}
		
		public static void ScoreAcceleratedBetaTest() {
			BasicRules.AgendaPoints += 2;
			//figure out how to look at top 3 cards and install them if ice
			Card.AcceleratedBetaTest.pos = -1;
		}
		
		public static void ScoreGlobalFoodInitative() {
			BasicRules.AgendaPoints += 3;
			Card.GlobalFoodInitiative.pos = -1;
		}
		
		public static void ScoreProjectVitruvius() {
			BasicRules.AgendaPoints += 2;
			//figure out how to get cards from archives with over advance
			Card.AcceleratedBetaTest.pos = -1;
		}
		
		public static void RezAdonisCampaign() {
			BasicRules.Credits -= Card.AdonisCampaign.cost;
			//figure out how to gain 3 credits for the next few turns and trash when done
		}
		
		public static void RezJacksonHoward() {
			//figure out how to make draw, draw 2 cards or shuffle 3 cards into back into archives
		}
		
		public static void RezEli10() {
			BasicRules.Credits -= Card.Eli10.cost;
			//figure out how you are going to use ice
		}
		
		public static void RezVanilla() {
			BasicRules.Credits -= Card.Vanilla.cost;
			//figure out how you are going to use ice
		}
		
		public static void RezFairchild30() {
			BasicRules.Credits -= Card.Fairchild30.cost;
			//figure out how you are going to use ice
		}
		
		public static void RezMagnet() {
			BasicRules.Credits -= Card.Magnet.cost;
			//figure out how you are going to use ice
		}
		
		public static void RezTollbooth() {
			BasicRules.Credits -= Card.Tollbooth.cost;
			//figure out how you are going to use ice
		}
		
		public static void RezArchitect() {
			BasicRules.Credits -= Card.Architect.cost;
			//figure out how you are going to use ice
		}
		
		public static void RezAssassin() {
			BasicRules.Credits -= Card.Assassin.cost;
			//figure out how you are going to use ice
		}
		
		


		}
	
}