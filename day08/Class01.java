package day08;

public class Class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체를 생성하기 위한 설계도
		//클래스의 구성요소
		
		//클래스의 구성정보
		// - 속성 : 멤버 변수
		// - 기능 : 메서드
		// 프린터 클래스
		// - 속성 : 크기, 제조사,색,구동방식,제품명
		// - 기능 : 인쇄, 스캔, 복사, 팩스
		
		//멤버변수는 클래스 안,메서드 밖에 작성.
		//멤버변수는 클래스 안에서만 사용할수있음.
		//접근제한자 class 클래스명 {}
		//클래스명은 반드시 대문자시작.
		
		//객체선언
		//클래스명 객체명;
		
		//객체 선언 및 초기화
		//클래스명 객체명 = new 클래스명();
		
		//메서드 사용법
		//객체명.메서드명();
		
		//같은 클래스안에서 메서드 사용할때
		//메서드명();
		//다른 클래스안에서 메서드 호출할때는 객체를 이용해 사용.
		//객체명.메서드명();
		
		//접근제한자
		//public - 모두 사용 가능.
		//protected - 변수가 포함된 클래스 + 패키지 + 자식클래스.
		//(default) - 변수가 포함된 클래스 + 패키지
		//private - 변수가 포함된 클래스
		
		//클래스에서 public울 붙일수 있는 클래스는 파일명과 클래스명이 같을때만 가능
		//멤버변수는 private를 쓰는것이 일반적,메서드는 public.
		
		//private : 멤버변수 / 메서드를 다른클래스에서 접근할 수 없게 함
		// - private으로 선언된 멤버변수를 접근할 때는 getter / setter라는 메서드를 통해 접근.
		
		Point p = new Point();
		p.x=10;
		p.y=5;
		p.print();
	}
}

class Point
{
	
	int x;
	int y;
	
	public void print()
	{
		System.out.println("(" +x + " " + y + ")");
	}
}
