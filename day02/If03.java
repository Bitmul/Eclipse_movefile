package day02;

import java.util.Scanner;

public class If03 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//수입력받아서 배수인지 확인하기.
		//임포트 단축키 ctrl + shift + o
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력");
		int n = scan.nextInt();
		if (n % 2 == 0 && n % 3 == 0) System.out.println("2와 3의 배수");
		else if (n % 2 == 0) System.out.println("2의 배수");
		else if (n % 3 == 0) System.out.println("3의 배수");
		else System.out.println("2와 3의 배수가 아님");
		scan.close();
	}
}
