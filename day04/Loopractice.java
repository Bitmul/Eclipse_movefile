package day04;

import java.util.Scanner;

public class Loopractice {

	public static void main(String[] args) {
		//수를 입력받아 소수인지 아닌지 출력하기

		Scanner scan = new Scanner(System.in);
		
//		int n =scan.nextInt();
//		int yaksu = 0;
//		for (int i=1;i<=n;i++)
//		{
//			if (n % i == 0) yaksu +=1;
//			//반복문 루프를 최소화하기 위해 약수가 3개 이상일경우 (소수 아님이 확정일경우) 브레이크
//			if (yaksu > 2) break;
//		}
//		if (yaksu == 2) System.out.println("소수입니다\n");
//		else System.out.println("소수가 아닙니다\n");
		
		for (int i = 2;i <= 100;i++)
		{
			int yaksu2 = 0;
			for (int j = 1;j <= 100;j++)
			{
				if (i < j) break;
				if (i % j == 0) yaksu2 +=1;
				if (yaksu2 > 2)
				{
					System.out.println(i + "는 소수가 아닙니다");
					break;
				}
			}
			if (yaksu2 == 2) System.out.println(i + "는 소수입니다");
		}
	}
}
