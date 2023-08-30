package day06;

import java.util.Scanner;

public class Gwajae {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*가위바위보만들기
		 * 0~2까지 가위 바위 보.
		 */
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		int trans = 0 , rnd = 0;
		
		
		//아스키코드 48 = 0 | 49 = 1 | 50 = 2
		//str형으로 숫자 입력받은뒤 -48 하면 int값.(범위 48~57까지만.)
		if (n.equals("가위") || n.charAt(0) == 48) trans = 0;
		else if (n.equals("바위") || n.charAt(0) == 49) trans = 1;
		else if (n.equals("보") || n.charAt(0) == 50) trans = 2;
		
		rnd = (int)(Math.random()*3);
		System.out.println("컴퓨터 > "+rnd);
		if (trans == rnd) System.out.println("무승부");
		//바위 가위 | 보 바위 | 가위 보
		else if (trans ==1 && rnd == 0 || trans ==2 && rnd == 1 || trans ==0 && rnd == 2) System.out.println("승리");
		//가위 바위 | 바위 보 | 보 가위
		else if (trans ==0 && rnd == 1 || trans ==1 && rnd == 2 || trans ==2 && rnd == 0) System.out.println("패배");
		scan.close();
	}

}
