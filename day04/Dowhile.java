package day04;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		/*
		 * do{
		 * 실행문;
		 * }while(조건식); 
		 */
		Scanner scan = new Scanner(System.in);
		int n = 0;
		do {
			System.out.println("\n메뉴");
			System.out.println("1.저장");
			System.out.println("2.새로만들기");
			System.out.println("3.종료");
			System.out.println("메뉴를 선택하십시오");
			n = scan.nextInt();
			switch(n)
			{
			case 1:
				System.out.println("저장");
				break;
			case 2:
				System.out.println("새로만들기");
				break;
			case 3:
				System.out.println("종료");
				break;
				
				default :
					System.out.println("잘못된 메뉴");
					break;
			}
		}while(n!=3);
		scan.close();
	}

}
