package day10;

public class Cardpack {
	
	private Card card[] = new Card[52];
	
	public Card[] getCard() {
		return card;
	}

	public void setCard(Card[] card) {
		this.card = card;
	}

	public Cardpack()
	{
		for (int i =0;i<52;i++) //◆ ♥ ♠ ♣
		{
			if (i/13 == 0) card[i] = new Card(i+1,'◆');
			else if (i/13 == 1) card[i] = new Card(i-12,'♥');
			else if (i/13 == 2) card[i] = new Card(i-25,'♠');
			else if (i/13 == 3) card[i] = new Card(i-38,'♣');
		}
	}
	
	public void shake() {
		for (int i =0;i<52;i++) 
		{
			int temp = (int)(Math.random()*52);
			for (;temp ==i;)
			{
				temp = (int)(Math.random()*52);
			}
			Card ctemp = new Card();
			ctemp.setGeo(this.card[i].getGeo());
			ctemp.setNumber(this.card[i].getNumber());
			this.card[i].setGeo(this.card[temp].getGeo());
			this.card[i].setNumber(this.card[temp].getNumber());
			this.card[temp].setGeo(ctemp.getGeo());
			this.card[temp].setNumber(ctemp.getNumber());
		}
		
	}
	
	public Card pick(int i) {
		return this.card[i];
	}
	
	public void init() {
		for (int i =0;i<52;i++) //◆ ♥ ♠ ♣
		{
			if (i/13 == 0) card[i] = new Card(i+1,'◆');
			else if (i/13 == 1) card[i] = new Card(i-12,'♥');
			else if (i/13 == 2) card[i] = new Card(i-25,'♠');
			else if (i/13 == 3) card[i] = new Card(i-38,'♣');
		}
		
	}
	
	public void print()
	{
		System.out.print("\n");
		for (int i =0;i<52;i++)
		{
			if (i >0 && i%13 == 0) System.out.println();
			this.card[i].print();
			System.out.print(" ");
		}
		System.out.print("\n");
	}

}
