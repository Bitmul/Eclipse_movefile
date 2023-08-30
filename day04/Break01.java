package day04;

import java.util.Scanner;

public class Break01
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		for (;;)
		{
			String str = scan.next();
			if (str.charAt(0) != 'y') System.out.println(str.charAt(0));
			else                                                                                                                                                                                                                                                                         
			{
				System.out.println("종료");
				break;
			}
		}
		
		scan.close();
	}

}
