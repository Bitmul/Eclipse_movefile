package day02;

public class MathClass {

	public static void main(String[] args) {
		//Math메소드 기능 round = 반올림 , ceil = 올림 , floor = 버림
		
		double num = 3.56465645;
		
		System.out.println(Math.round(num));
		System.out.println(Math.ceil(num));
		System.out.println(Math.floor(num));
		
		//min max 최대값 최소값 찾기
		
		System.out.println(Math.max(13, 7));
		System.out.println(Math.min(13, 7));
		//random
		System.out.println(Math.random()); //0이상 1미만 사이 부동소수
		System.out.println((int)(Math.random()*15)); //0이상 n미만까지의 정수값
	}

}
