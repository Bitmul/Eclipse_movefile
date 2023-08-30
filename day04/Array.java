package day04;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int abcd[] = new int[15];
		int arr[] = new int[] {1,2,3,4,5,6};
		int abc[] = {1,2,3,4,5};
		

		int arr2[] = new int[10];
//		for(int i=0;i<arr2.length-1;i++)
//		{
//			arr2[i] = (i+1)*10;
//			System.out.println(arr2[i]);
//		}
		//배열 마지막 번지는 length-1, length번째는 Null.
		
		//배열 생성 후 짝수만 넣기.
		int odd[] = new int[15];
		
		for (int i=0;i<odd.length-1;i++)
		{
			odd[i] = i+1;
			System.out.print(odd[i] + " ");
		}
		System.out.println("");
		int odd2[] = new int[15];
		for (int i=1;i<odd.length-

				1;i++)
		{
			odd2[i] = i*2;
			System.out.print(odd2[i] + " ");
		}
	}
}
