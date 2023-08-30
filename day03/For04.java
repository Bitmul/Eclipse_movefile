package day03;

import java.util.Scanner;

public class For04 
{
	public static void main(String[] args) 
	{
		// n이 주어졌을때 n의 약수 출력
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int n2 = scan.nextInt();
		int max = 0;
		for(int i =n;;i--)
		{
			if (n % i == 0)
			{
				if (n2 % i==0)
				{
					max = i;
					break; //중첩for문의 경우 if문 상위의 1개 for문만 벗어남.
					//벗어나고싶은 for문에 name : for() 형식으로 닉네임을 짓고 break name; 의 형식으로 벗어날수 있음.
				}
			}
		}
		// 0으로 나누는 경우 런타임 에러,따라서 i는 1로 설정
//		for (int i = 1; i <= n; i++) {
//			if (n % i == 0)
//			{
//				if (n2 % i==0)
//				{
//					max = i;
//				}
//			}
//		}
		System.out.println(max);
		scan.close();
	}
}
