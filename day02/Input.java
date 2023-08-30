package day02;

import java.util.Scanner;

public class Input 
{
	public static void main(String[] args) 
	{
		Scanner an = new Scanner(System.in);
		int n = an.nextInt();
		System.out.println(n);
		if(n % 2 == 0) System.out.println("짝수");
		else System.out.println("홀수");
		an.close();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("수 입력");
		if (n > 0) System.out.println("양수");
		else if (n < 0) System.out.println("음수");
		else System.out.println("0입니다");
		
		System.out.println("실수입력");
		double n2 = scan.nextDouble();
		System.out.println(n2);
		
		System.out.println("문자입력");
		char a = scan.next().charAt(0);
		System.out.println(a);
		
		System.out.println("문자열입력");
		//문자열 입력
//		String s = scan.next();
		String s = scan.nextLine();
		System.out.println("문자열 > " + s);
		
		scan.close();
	}
}