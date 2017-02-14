	public class BasicAI {
		
		public static void main (String[]args) {
			//starts off by getting ready for first turn
			
			
			
			if (BasicRules.isTurn) {
				BasicRules.Clicks = 3;
				BasicRules.CardsInHand += 1;
				
			}

		}

		//set up priorities
		//first if you can win the game do so
		//second if you can install ice do so
		//thrid if you can gain credits do so
		//fourth if you can score an agenda do so
	}
