package day06;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//주사위의 수는 1~6까지 랜덤,총 30칸 이동하면 완주
		int dice =0;
		int rnd = 0;
		for (int i = 0;dice < 30; i++)
		{
			rnd = (int)(Math.random()*6)+1;
			dice += rnd;
			System.out.println("주사위 : " + rnd);
			if (dice <30) System.out.println((30 - dice) + "칸 남았습니다 ");
			else System.out.println("도착");
		}
	}

}
