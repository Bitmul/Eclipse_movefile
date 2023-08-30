package day05;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력 : 5자리의 숫자
		//입력받은 숫자를 뒤집어서 출력
		
		Scanner scan = new Scanner(System.in);
		
		//문자열 입력
		System.out.println("정수를 입력하십시오.(문자열 변환 케이스)");
		String n_tmp2 = scan.next();
		int nn[] = new int[n_tmp2.length()];
		
		for (int i = 0; i<n_tmp2.length();i++)
		{
			nn[i] = n_tmp2.charAt(i) - 48;
		}
		for (int i=0;i<nn.length/2;i++)
		{
			int temp = nn[i];
			nn[i] = nn[nn.length-1-i];
			nn[nn.length-1-i] = temp;
		}
		
		for (int i =0;i<nn.length;i++)
		{
			System.out.print(nn[i] + " ");
		}
		
		System.out.print("\n" + (nn[0]+nn[1]+nn[2]+nn[3]+nn[4]) + "\n");
		
		System.out.println("정수를 입력하십시오.(정수 변환 케이스)");
		int n = scan.nextInt();
		int n_tmp[] = new int[5];
		n_tmp[0] = n/10000;
		n_tmp[1] = (n%10000)/1000;
		n_tmp[2] = (n%1000)/100;
		n_tmp[3] = (n%100)/10;
		n_tmp[4] = (n%10)/1;
		
		for (int i=0;i<nn.length/2;i++)
		{
			int temp = n_tmp[i];
			n_tmp[i] = n_tmp[n_tmp.length-1-i];
			n_tmp[n_tmp.length-1-i] = temp;
		}
		for (int j=0;j<5;j++)
		{
			System.out.print(n_tmp[j] + " ");
		}
		System.out.print("\n" + (n_tmp[0]+n_tmp[1]+n_tmp[2]+n_tmp[3]+n_tmp[4]));
		scan.close();
	}

}
