package day02;

import java.util.Scanner;

public class Day02_gwajae 
{
	public static void main(String[] args) 
	{
		/*
		 * 정수 2개와 연산자 하나를 입력받아 두 정수의 연산 출력하기. 연산자는 * + - / % 입력 형식 : 3 2 + 연산자에 대한 예외처리.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 두 개 입력");
		int n = scan.nextInt();
		int n2 = scan.nextInt();
		System.out.println("연산자 입력 ( * + - / % )");
		char oper = scan.next().charAt(0);
		switch (oper) 
		{
		case '*':
			System.out.println(n + " * " + n2 + " = " + (n * n2));
			break;
		case '+':
			System.out.println(n + " + " + n2 + " = " + (n + n2));
			break;
		case '-':
			System.out.println(n + " - " + n2 + " = " + (n - n2));
			break;
		case '/':
			System.out.println(n + " / " + n2 + " = " + (n / n2));
			break;
		case '%':
			System.out.println(n + " % " + n2 + " = " + (n % n2));
			break;
		default:
			System.out.println("유효하지 않은 연산자입니다.");
		}
		scan.close();	
	}
}