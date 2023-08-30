package day03;

import java.util.Scanner;

public class Day03_gwajae {

	public static void main(String[] args) {
		/*
		 * up/down 게임 구현
		 * 1~50 사이의 랜덤수를 생성, 맞추는 게임.
		 * 랜덤 수를 생성하고,입력받은 값이 랜덤수와 일치할때까지 반복시키는 형식으로 구현.
		 * 입력받은 값이 랜덤수보다 크면 down, 낮으면 up. 
		 */
		Scanner scan = new Scanner(System.in);
		int rand_var = scan.nextInt();
		System.out.println("랜덤범위의 최대값을 입력");
		int rand = (int)(Math.random()*rand_var + 1);
		int chance=0;
		
		for (;;)
		{
			chance = chance+=1;
			System.out.println("수를 입력하십시오");
			int n = scan.nextInt();
			if (n < rand) System.out.println("up\n");
			else if (n > rand) System.out.println("down\n");
			else if (n == rand) break;
			if (chance > 5) break;
		}
		if (chance <= 5)System.out.println("정답");
		else System.out.println("기회소진");
		scan.close();
	}

}
