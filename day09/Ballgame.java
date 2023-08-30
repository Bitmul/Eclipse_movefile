package day09;

import java.util.Scanner;

public class Ballgame {

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
		System.out.println(b.cnt + " Try, Great JOB");
	}
	
}

class Baseball {
	int[] n = new int[3];
	static int count = 9;
	int cnt = 0;
	int s,b,o = 0;
	
	public void start() {
		for (int i =0;i<n.length;i++)
		{
			n[i] = create(n);
		}
	}
	
	//생성파트
	public static int create(int[] p)
	{
		int g = (int)(Math.random()*count)+1;
		for (;search(p,g) == true;)
		{
			g = (int)(Math.random()*count)+1;
		}
		return g;
	}
	//중복체크파트
	public static boolean search(int p[],int num)
	{
		for (int i =0;i<p.length;i++)
		{
			if (p[i] == num) return true;
		}
		return false;
	}

	//프린트 메소드
	public void prnt(int s,int b,int o)
	{
		System.out.println("Strike : " + s + " Ball : " + b + " Out : " + o);
	}

	//스트라이크 볼 아웃 체크 메소드
	public int check(int a[]) {
		s=0; b=0; o=0;
		for (int i =0;i<3;i++)
		{
			int flag = Strike(n,a,i);
			if (flag == 2) b+=1;
			if (flag == 1) s+=1;
			if (flag == 0) o+=1;
		}
		prnt(s,b,o);
		cnt +=1;
		return s;
	}
	//스트라이크 체크 메소드
	public int Strike(int an[],int bn[],int i)
	{
		if (an[i] == bn[i]) return 1;
		
		int k = Ball(an,bn,i);
		if (k >= 1) return 2;
		return 0;
	}
	//볼 체크 메소드
	public int Ball(int an[],int bn[],int i)
	{
		for (int j =0;j<3;j++)
		{
			if (an[i] == bn[j]) return 1;
		}
		return 0;
	}
}