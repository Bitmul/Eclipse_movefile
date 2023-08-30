package day05;

import java.util.Scanner;

public class Gwajae {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//파일명 5개가 주어졌을 때, 원하는 단어를 입력하면 입력한 단어가 있는 파일들을 출력.
		
		String[] fileName = {"java의 정석.txt","이것이 java다.jpg","String메서드.txt","String함수.jpg","java의 함수.png"};
		Scanner scan = new Scanner(System.in);
		System.out.println("검색어 입력");
		String search = scan.next();
		
		for (int i = 0;i < fileName.length;i++)
		{
			if (fileName[i].contains(search)) System.out.println(fileName[i]);
		}
		scan.close();
	}

}
