package day06;

public class Methoood {

	public static void main(String[] args) {
		// 메서드 : 기능 / 함수
		// 접근제어자(제한자) : 접근할수 있는 주체의 제한범위
		// 리턴타입 : 메서드의 실행 결과로 받을 수 있는 정보의 값(자료형)
		// 변수,메서드명 : 메서드의 이름 -> 소문자로 시작
		// 매개변수 : 메서드를 실행하기 위해서 필요로 하는 값(자료형 변수명)
		// 메서드 선언 구현
		// 접근제어자 리턴타입 메서드명(매개변수, 매개변수)
		// {
		// 구현
		// }
		// 메서드 선언 위치
		// 클래스 안, 다른 메서드 밖
		
		//메서드 시험 구현
		//기능 : 두 정수가 주어지면 정수의 합을 알려주는 메서드
		System.out.println(plus(1,3));
		//메서드 시험 구현
		//기능 : 두 정수가 주어지면 정수의 곱을 알려주는 메서드
		System.out.println(multiply(4,3));
		
		//기능 : 두 정수가 주어지면 정수의 합을 출력하는 메서드
		plus_print(4,3);
		
		Methoood me = new Methoood();
	}
	
	public static int plus(int i,int j)
	{
		return i+j;
	}
	
	public static void plus_print(int i,int j)
	{
		System.out.println(i+j);
	}
	
	public static int multiply(int i,int j)
	{
		return i*j;
	}

}
