package personalProject;

import java.util.Scanner;

public class Daepyo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int an[] = new int[1000];
		int n = scan.nextInt();
		int k = scan.nextInt();
		for (int i =0;i<n;i++)
		{
			an[i] = scan.nextInt();
		}
		
		for (int i =0;i<n;i++)
		{
			for (int j =0;j<n;j++)
			{
				if (an[i] > an[j])
				{
					int temp = an[i];
					an[i] = an[j];
					an[j] = temp;
				}
			}
		}
		System.out.println(an[k-1]);
		scan.close();
	}

}
