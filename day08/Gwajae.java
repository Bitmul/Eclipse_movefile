package day08;

import java.util.Scanner;

public class Gwajae {

	public static void main(String[] args) {
		Baseball b = new Baseball();
		Scanner scan = new Scanner(System.in);
		int temp[] = new int[3];
		System.out.println("GAME START");
		b.start();
		for (;;)
		{
			for (int j=0;j<temp.length;j++)
			{
				temp[j] = scan.nextInt();
			}
			if (b.check(temp) == 3) 
			{
				scan.close();
				break;
			}
		}
		System.out.println(b.cnt + "Try, Great JOB");
	}
	
}

//static이 아닌경우 객체를 생성해 객체명.메서드명()호출.

class Baseball {
	int[] n = new int[3];
	int cnt;
	int s,b,o;
	
	public void start() {
		n[0] = (int)(Math.random()*9)+1;
		n[1] = (int)(Math.random()*9)+1;
		n[2] = (int)(Math.random()*9)+1;
		for (;n[1] == n[0];)
		{
			n[1] = (int)(Math.random()*9)+1;
		}
		for (;n[2] == n[0] && n[2] != n[1];)
		{
			n[2] = (int)(Math.random()*9)+1;
		}
	}

	public int check(int a[]) {
		s=0;
		b=0;
		o=0;
		for (int i =0;i<3;i++)
		{
			int flag = 0;
			for (int j =0;j<3;j++)
			{
				if (n[i] == a[i])
				{
					s+=1;
					flag =1;
					break;
				}
				else if (n[i] == a[j]) 
				{
					b+=1;
					flag =1;
					break;
				}
			}
			if (flag ==0) o+=1;
		}
		System.out.println("Strike : " + s + "\nBall : " + b + "\nOut : " + o);
		cnt+=1;
		return s;
	}
}