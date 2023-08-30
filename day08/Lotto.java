package day08;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 로또번호 랜덤으로 생성.(1~45) 6자리
		// 당첨번호 (1~45) 7자리.
		int loto_user[] = new int[6];
		int loto[] = new int[7];
		int rang = 15;
		lotto_user(loto_user,rang);
		printArr(loto_user);
		System.out.println("\n");
		lotto(loto,rang);
		printArr(loto);
		System.out.println("\n");
		lotto_check(loto,loto_user);
	}

	public static void printArr(int n[]) {
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
	}

	public static int[] lotto_user(int[] n,int range) 
	{
		for (int i = 0; i < 6; i++) 
		{
			int temp = 0;
			//0번째는 그냥 랜덤생성해서 입력.
			if (i == 0) n[i] = (int) (Math.random() * range) + 1;
			else 
			{
				//1번째,일단 랜덤생성.
				temp = (int) (Math.random() * range) + 1;
				for (int j = 0; j < 6; j++) 
				{
					//랜덤생성한 값이 기존 배열 안에 존재할 경우 다시 랜덤생성한 후,
					//for문의 카운트 값,j를 -1로 초기화,
					//-1로 초기화 하는 이유는 j = -1 구문 이후 다시 j가 ++되어 j가 0이 되기 때문.
					//0으로 초기화 될 경우 j = -1 구문 이후 j가 1이 되어 n배열의 0번째 값과 비교하지 않게되어 값이 겹칠 수 있음.
					if (temp == n[j]) 
					{
						temp = (int) (Math.random() * range) + 1;
						j = -1;
					}
				}
				n[i] = temp;
			}
		}
		return n;
	}

	public static int[] lotto(int[] n, int range) {
		for (int i = 0; i < 7; i++) 
		{
			int temp = 0;
			if (i == 0) n[i] = (int) (Math.random() * range) + 1;
			else 
			{
				temp = (int) (Math.random() * range) + 1;
				for (int j = 0; j < 7; j++) 
				{
					if (temp == n[j]) 
					{
						temp = (int) (Math.random() * range) + 1;
						j = -1;
					}
				}
				n[i] = temp;
			}
		}
		return n;
	}

	public static void lotto_check(int[] n, int[] m) {
		int check = 0;
		int temp[] = new int[6];
		for (int i = 0; i < 7; i++) 
		{
			for (int j = 0; j < 6; j++) 
			{
				if (n[i] == m[j]) 
				{
					if (check <6)temp[check] = m[j];
					check +=1;
				}
			}
		}
		for (int i =0 ;i<6;i++)
		{
			System.out.print(temp[i] + " ");
		}
		System.out.print("\n");
		switch(check)
		{
		case 0 :
			System.out.println("꼴등");
			break;
		case 1 :
			System.out.println("6등");
			break;
		case 2 :
			System.out.println("5등");
			break;
		case 3 :
			System.out.println("4등");
			break;
		case 4 :
			System.out.println("3등");
			break;
		case 5 :
			System.out.println("2등");
			break;
		case 6 :
			System.out.println("1등");
			break;
		case 7 :
			System.out.println("1등");
			break;
			default:
				break;
		}
	}
}
