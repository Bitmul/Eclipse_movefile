package day02;

public class If01 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num = 15;
		if (num>0)
		{
			System.out.println("양수");
			if (num>10) System.out.println("10보다 큽니다");
		}
		else if (num<0) System.out.println("음수");
		else if (num==0) System.out.println("0");
		
		int num2 = 14;
		if (num2 % 2 == 0) System.out.println("짝");
		else System.out.println("홀");
	}
}
