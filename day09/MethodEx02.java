package day09;

import java.util.Scanner;

public class MethodEx02 {

	public static void main(String[] args) {
		// 두 정수의 사칙연산을 처리
		MethodEx02 met = new MethodEx02();
		met.calculator(met);
		}

	public void calculator(MethodEx02 met)
	{
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		char s = scan.next().charAt(0);
		int n2 = scan.nextInt();
		switch(s)
		{
		case '+' :
			System.out.println(met.plus(n1, n2));
			break;
		case '-' :
			System.out.println(met.minus(n1, n2));
			break;
		case '*' :
			System.out.println(met.multi(n1, n2));
			break;
		case '/' :
			System.out.println(met.div(n1, n2));
			break;
		case '%' :
			System.out.println(met.rem(n1, n2));
			break;
			default:
			break;
		}
		scan.close();
	}
	
	public int plus (int n1,int n2)
	{
		return n1+n2;
	}
	public int minus (int n1,int n2)
	{
		return n1-n2;
	}
	public int multi (int n1,int n2)
	{
		return n1*n2;
	}
	public double div (int n1,int n2)
	{
		return (double)n1/(double)n2;
	}
	public int rem (int n1,int n2)
	{
		return n1%n2;
	}
}
