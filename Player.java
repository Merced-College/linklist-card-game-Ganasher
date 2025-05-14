public class Player {
    String name:
    int score;
    Card[] hand;
    int handIndex = 0;

    public Player(String name, int handSize) {
		this.name = name;
		this.hand = new Card[handSize];
		this.score = 0;
	}

    public void drawCard(Card card) {
		if (handIndex < hand.length) {
			hand[handIndex++] = card;
		}
	}

    public Card playCard(int index) {
		return hand[index];
	}

	public void incrementScore() {
		score++;
	}

	public int getScore() {
		return score;
	}

	public String getName() {
		return name;
	}
}
