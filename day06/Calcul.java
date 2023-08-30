package day06;

import java.util.Scanner;

public class Calcul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 계산기 구현.
		 * 입력 : + - / * %
		 * 두 정수가 주어지면 두 정수의 연산을 하는 메서드 구현
		 */
		
		Scanner scan = new Scanner(System.in);
//		char oper = scan.next().charAt(0);
		double n = scan.nextInt();
		double n2 = scan.nextInt();
		scan.close();
		double[] div = new double[2];
		div = rem2(n,n2);
		
		System.out.println("몫 : " + div[0] + "\n나머지 : " + div[1]);
//		cal(oper,n,n2);
	}
	
	public static void cal(char c, int i, int j)
	{
		if (c == '+') System.out.println(i + " + " + j + " = " + plus(i,j));
		else if (c == '-') System.out.println(i + " - " + j + " = " +minus(i,j));
		else if (c == '/') System.out.println(i + " / " + j + " = " +divide(i,j));
		else if (c == '*') System.out.println(i + " * " + j + " = " +multiply(i,j));
		else if (c == '%') System.out.println(i + " % " + j + " = " +remain(i,j));
	}
	public static int plus (int i, int j)
	{
		return i+j;
	}
	public static int minus (int i, int j)
	{
		return i-j;
	}
	public static double divide (int i, int j)
	{
		return i/j;
	}
	public static int multiply (int i, int j)
	{
		return i*j;
	}
	public static int remain (int i, int j)
	{
		return i%j;
	}
	public static double[] rem2(double i, double j)
	{
		double ret[] = new double[2];
		ret[0] = i/j;
		ret[1] = i%j;
		return ret;
	}

}
