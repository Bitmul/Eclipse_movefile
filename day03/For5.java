package day03;

import java.util.Scanner;

public class For5 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int n2 = scan.nextInt();

		for (int i = 1 ;; i++) 
		{
			if (n2*i % n == 0) 
			{
				System.out.println(n2*i);
				break;
			} 
		}
		scan.close();
	}
}
