package day09;

//class의 public 파일명과 일치하는 class에만 가능
//한파일에 한개만 public class 존재
public class Methodex01 {
	public static void main(String[] args) {
		//num1 num2 를 입력받아 두수의 합을 리턴하는 메소드 만들기.
		Methodex01 Met = new Methodex01();
		System.out.println(plus(5,3));
		System.out.println(Met.sum(5,3));
		pr_plus(5,3);
		
		
	}
	
	public static int plus (int a, int b)
	{
		return a+b;
	}
	
	public static void pr_plus (int a, int b)
	{
		System.out.println(a+b);
	}
	
	public int sum (int a,int b)
	{
		return a+b;
	}
}
