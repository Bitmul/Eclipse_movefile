package day01;

public class gwajae {

	public static void main(String[] args) {
		int kr = 90, en = 90, ma = 70;
		int sum = kr + en + ma;
		double res = sum / 3.0;
		System.out.println("합계 : " + sum + "\n평균 : " + res);
		if (res > 80) System.out.println("\n결과 : " + "합격");
		else System.out.println("\n결과 : " + "불합격");
	}
}