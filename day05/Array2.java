package day05;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1~10까지 배열에 넣고 출력
		 */
		int arr[] = new int[11];
		
		for(int i =0;i<arr.length-1;i++)
		{
			arr[i] = i+1;
			System.out.println(arr[i]);
		}
		for(int i =0;i<arr.length;i++)
		{
			for(int j =0;j<arr.length;j++)
			{
				if (arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i =0;i<arr.length-1;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

}
