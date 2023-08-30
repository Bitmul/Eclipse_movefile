package day03;

public class For 
{

	public static void main(String[] args) 
	{
		//동작방식 for = while != do~while
		//do~while은 조건에 맞지 않아도 무조건 한번은 실행
		int sum = 0,sum2=0;
		//for문의 기본 형태
		for(int i=1;i<=10;i++)
		{
			if (i%2 == 0)
			{
				sum = sum+i;
			}
			else
			{
				sum2 = sum2+i;
			}
			
		}
		System.out.println("짝수의 합 : "+ sum + "\n홀수의 합 : " + sum2);
	}

}
