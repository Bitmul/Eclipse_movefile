package personalProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int total = 0;
		int one =0,flag=0,two = 0;
		int n[] = new int[9];
		for (int i = 0; i < 9; i++) {
			n[i] = scan.nextInt();
			total +=n[i];
		}
		for (int i =0;i<9;i++)
		{
			for (int j =0;j<9;j++)
			{
				if (n[i] < n[j])
				{
					int temp = n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}
		}
		for (int i =0;i<9;i++)
		{
			for (int j =0;j<9;j++)
			{
				if ((total - n[i] -n[j]) == 100 && i!=j)
				{
					one = i;
					two =j;
					flag=1;
				}
				if (flag == 1) break;
			}
			if (flag == 1) break;
		}
		
		
		for (int i=0;i<9;i++)
		{
			if (i != one && i!= two) System.out.println(n[i]);
		}
		
		scan.close();
	}

}
