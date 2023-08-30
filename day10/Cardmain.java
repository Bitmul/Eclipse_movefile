package day10;

public class Cardmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cardpack cp = new Cardpack();
		Card card = new Card();
		
		cp.print();
		card = cp.pick(0);
		System.out.println("");
		card.print();
		System.out.println("");
		cp.shake();
		card = cp.pick(0);
		System.out.println("");
		card.print();
		System.out.println("");
		cp.print();
		cp.init();
		cp.print();
	}

}
