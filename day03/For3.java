package day03;

import java.util.Scanner;

public class For3 
{
	public static void main(String[] args) 
	{
		/*
		 * 구구단 찍기
		 */
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 1; i <= 9; i++) 
		{
			System.out.println(n + " * " + i + " = " + (n * i));
		}

//		for (int i = 1; i <= 9; i++) 
//		{
//			for (int j = 1; j <= 9; j++) 
//			{
//				System.out.println(i + " * " + j + " = " + (i * j));
//			}
//		}

		scan.close();
	}

}
