package day05;

public class Stri02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//이것이자바다.txt에서 파일명과 확장자를 분리하여 추출
		
		String fileName = "이것이자바다.txt";
		String str = fileName.substring(0, fileName.indexOf("."));
		
		System.out.println(str);
		str = fileName.substring(fileName.indexOf("."),fileName.length());
		
		System.out.println(str);
		
		System.out.println(fileName.contains("자바"));
	}

}
