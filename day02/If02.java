package day02;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		//국영수 점수 입력 받고 합계 평균 평가 출력.(평균 90 기점으로 10점단위로 A,B,C....)
		//입력받는 값이 0미만,100초과면 예외처리.
		Scanner scan = new Scanner(System.in);
		int kr = scan.nextInt();
		int en = scan.nextInt();
		int ma = scan.nextInt();
		
		//예외처리
		if (kr > 100 || en > 100 || ma >100 || kr < 0 || en < 0 || ma < 0)
		{
			System.out.println("0 미만 또는 100 초과 값이 입력되었습니다.");
		}
		else
		{
			double avr = (double)(kr+en+ma)/3.0;
		
			System.out.println("합계 : "+ (kr+en+ma) + "\n평균 : " + avr);
		
			if (avr>=90) System.out.println("평가 : A");
			else if (avr>=80) System.out.println("평가 : B");
			else if (avr>=70) System.out.println("평가 : C");
			else System.out.println("평가 : D");
		}
		scan.close();
	}
}