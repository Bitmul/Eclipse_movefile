package day04;

import java.util.Scanner;

public class Gwajae {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5명의 점수를 입력받아 배열에 저장하고 점수의 합계,평균을 출력.
		
		Scanner scan = new Scanner(System.in);
		int n[] = new int[5];
		int total = 0, max=0,min=100;

		System.out.println("5명의 점수를 입력하십시오");
		for (int i=0;i<5;i++)
		{
			n[i] = scan.nextInt();
			if (n[i] > max) max = n[i];
			if (n[i] < min) min = n[i];
			total +=n[i];
		}
		System.out.println("총점 : "+ total);
		System.out.println("평균 : "+ total/5.0);
		System.out.println("최고점 : "+ max);
		System.out.println("최저점 : "+ min);
		scan.close();
	}
}
