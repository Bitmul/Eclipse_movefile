package day08;

public class Method123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 입력시 배열을 출력하는 메서드.
		int arr[] = new int[] {1,2,9,3,7,5,6,10,4,8,13,11,12,14,15,16,13,45,34,66,67};
		System.out.println("Sort Result\n");
		bubbleSort(arr);
		printArr(arr);
		System.out.println("\n\nArrand Result\n");
		Arrand(arr,arr.length);
		printArr(arr);
		System.out.println("\n\nSort Result\n");
		bubbleSort(arr);
		printArr(arr);
		
	}

	public static void printArr(int n[])
	{
		for (int i =0;i<n.length;i++)
		{
			if (i > 0  && i % 5 ==0) System.out.print("\n");
			System.out.print(n[i] + " ");
		}
	}
	
	public static int[] bubbleSort(int n[])
	{
		for(int i =0;i<n.length;i++)
		{
			for(int j =0;j<n.length;j++)
			{
				if (n[j] > n[i])
				{
					int temp = n[i];
					n[i] = n[j];
					n[j] = temp;
				}
			}
		}
		return n;
	}
	
	// 새로운 배열을 만들어 랜덤수를 채워 리턴.
	public static int[] Arrand(int n[],int r)
	{
		for (int i=0;i<r;i++)
		{
			n[i] = (int)(Math.random()*100) + 1;
		}
		return n;
	}
}
