package day10;

public class Class04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}

class Card {
	private int number;
	private char geo; //◆ ♥ ♠ ♣
	
	public Card() 
	{
		this.number = 1;
		this.geo = '♥';
	}
	
	public Card(int number,char geo)
	{
		if (number > 0 && number <14)
		{
			if (geo == '♥' || geo == '◆' || geo == '♠' || geo == '♣')
			{
				this.number = number;
				this.geo = geo;
			}
		}
		else
		{
			this.number = 1;
			this.geo = '♥';
		}
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		if (number > 0 && number <14) this.number = number;
		else this.number=1;
	}

	public char getGeo() {
		return geo;
	}

	public void setGeo(char geo) {
		if (geo == '♥' || geo == '◆' || geo == '♠' || geo == '♣') this.geo = geo;
		else this.geo = '♥';
	}
	
	public void print() {
		if (number <= 10) System.out.print(this.geo + "" +this.number);
		switch(number)
		{
		case 11:
			System.out.print(this.geo + "J");
			break;
		case 12:
			System.out.print(this.geo + "Q");
			break;
		case 13:
			System.out.print(this.geo + "K");
			break;
			default :
				break;
		}
	}
}
