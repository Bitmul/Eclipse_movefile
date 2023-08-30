package personalProject;

import java.util.Scanner;

public class Prime 
{

	public static void main(String[] args) 
	{
		String s;
		int cnt=0;

		Scanner scan = new Scanner(System.in);
		s = scan.nextLine();
		for (int i=0;i<s.length();i++)
		{
			if (s.charAt(i) == ',') cnt+=1;
		}
		System.out.println(cnt+1);
		scan.close();
	}
}
