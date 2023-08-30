package day07;

import java.util.Scanner;

public class Gwajae {
	//공통 변수들 선언 == 멤버변수
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int in[] = new int[2];
		input(in);
		cal(in);
	}
	
	public static int[] input(int n[]) {
		System.out.println("숫자를 입력하십시오.");
		for (int i = 0;i<n.length;i++)
		{
			n[i] = scan.nextInt();
		}
		return n;
	}
	
	public static void cal(int n[]) {
		System.out.println("실행할 작업을 선택하십시오 (1.덧셈, 2:뺄셈, 3:곱셈, 4:나눗셈, 5:나머지)");
		int a = scan.nextInt();
		switch(a)
		{
		case 1 :
			plus(n);
			break;
		case 2 :
			minus(n);
			break;
		case 3 :
			mult(n);
			break;
		case 4 :
			div(n);
			break;
		case 5 :
			rem(n);
			break;
			default :
				return;
		}
	}	
	
	public static void plus(int n[]) {
		System.out.println(n[0] + " + " + n[1] + " = " + (n[0]+n[1]));
	}
	
	public static void minus(int n[]) {
		System.out.println(n[0] + " - " + n[1] + " = " + (n[0]-n[1]));
	}
	
	public static void  mult(int n[]) {
		System.out.println(n[0] + " * " + n[1] + " = " + (n[0]*n[1]));
	}
	
	public static void div(int n[]) {
		System.out.println(n[0] + " / " + n[1] + " = " + ((double)n[0]/(double)n[1]));
	}
	
	public static void rem(int n[]) {
		System.out.println(n[0] + " % " + n[1] + " = " + (n[0]%n[1]));
	}

}