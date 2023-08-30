package day05;

public class Array {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		
		for (int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*50) + 1;
		}
		
		for (int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr.length;j++)
			{
				if (arr[i] > arr[j])
				{
					int temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
		for (int tmp : arr)
		{
			System.out.print(tmp + " ");
		}

	}

}
