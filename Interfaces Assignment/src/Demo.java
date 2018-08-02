// demo class to test the game(interface), Football(class)
//Tennis(class) and cricket(class)

public class Demo implements Game{
	
	@Override
	public void play() {
		
		System.out.println("Let's play something.");
		
	}
	
	// a method which takes instance of an interface and calls the play method
	public void perform(Game game) {
		game.play();
	}

	public static void main(String[] args) {
		
		Demo demo = new Demo();	
		Game cricket = new Cricket();	// instance of an interface(Game) pointing to an object of class Cricket
		demo.perform(cricket);
		
		Game tennis = new Tennis();		// instance of an interface(Game) pointing to an object of class Tennis
		demo.perform(tennis);
		
		Game football = new Football();		// instance of an interface(Game) pointing to an object of class Football
		demo.perform(football);

	}

}
