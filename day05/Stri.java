package day05;

public class Stri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World";
		System.out.println(str);
		
		System.out.println("-char at-");
		System.out.println(str.charAt(1));
		
		System.out.println("-length-");
		System.out.println(str.length());
		
		System.out.println("-compare to-");
		System.out.println("b".compareTo("a"));
		System.out.println("a".compareTo("b"));
		
		System.out.println("-concat-");
		System.out.println(str.concat(" :D"));
		
		System.out.println("-equals-");
		System.out.println(str.equals("Hello World"));
		
		System.out.println("-indexof-");
		System.out.println(str.indexOf("d"));
		
		System.out.println("-substring-");
		System.out.println(str.substring(0,5));
		
		System.out.println("-trim-");
		System.out.println("    aaa         a".trim());
		
		System.out.println("-replace-");
		System.out.println(str.replace("e", "a"));
		
		System.out.println("-split-");
		str = "Hello,World";
		String[] str2 = str.split(",");
		for (String tmp : str2)
		{
			System.out.println(tmp);
		}
		
		String num = "1";
		String num2 = "2";
		
		System.out.println(num+num2);
		
		int num1 = Integer.parseInt(num);
		int num11 = Integer.parseInt(num2);
		System.out.println(num1+num11);
	}

}
