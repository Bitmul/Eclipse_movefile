package day08;

public class Method2 {
	public static void main(String[] args) {
		
		int a = 5,b = 8,c = 3;
		
		System.out.println(sum(1,2,3,4,5,6,7,8));
		System.out.println(sum(a,b));
		System.out.println(sum(a,b,c));
		System.out.println(sum((double)a,(double)b));
		System.out.println(sum(c,(double)b));
	}
	
	public static int sum(int n1, int n2)
	{
		return n1 + n2;
	}
	
	public static int sum(int ...num)
	{
		int sum =0;
		for(int i=0;i<num.length;i++)
		{
			sum+=num[i];
			System.out.print(num[i] + " ");
		}
		return sum;
	}
	
	public static int sum(int n1, int n2, int n3)
	{
		return n1 + n2 + n3;
	}
	
	public static double sum(double n1,double n2)
	{
		return n1 + n2;
	}
	
	public static double sum(int n1,double n2)
	{
		return n1 + n2;
	}
}
