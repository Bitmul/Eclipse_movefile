package day02;

public class Switch01 
{
	public static void main(String[] args) 
	{
		/*
		 * switch 형식
		 * 
		 * switch (변수 / 식)
		 * {
		 * 	case n : 
		 * 		실행문; 
		 * 		break;
		 * 	case n2 :
		 * 		실행문;
		 * 		break;
		 * 	default : 기본 실행문;
		 * }
		 * 
		 * break; switch 종료.
		 */
		
		int num = (int)(Math.random()*6)+1;
		switch(num)
		{
		case 1:
			System.out.println("1칸");
			break;
		case 2:
			System.out.println("2칸");
			break;
		case 3:
			System.out.println("3칸");
			break;
		case 4:
			System.out.println("4칸");
			break;
		case 5:
			System.out.println("5칸");
			break;
		case 6:
			System.out.println("6칸");
			break;
			default : System.out.println("유효하지 않은 입력입니다");
		}
	}

}
