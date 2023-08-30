package day03;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		//n이 주어졌을때 n의 약수 출력
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		//0으로 나누는 경우 런타임 에러,따라서 i는 1로 설정
		for (int i =1;i<=n;i++)
		{
			//약수 구하는 파트
			if (n%i == 0) System.out.println(i+ "은 "+ n +"의 약수");
		}
		scan.close();
	}

}
