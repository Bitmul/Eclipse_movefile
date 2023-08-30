package day05;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[3][3];
		int cnt = 1;
		//arr[행][열]
		for (int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr.length;j++)
			{
				arr[i][j] = cnt;
				System.out.print(arr[i][j] + " ");
				cnt++;
			}
			System.out.println();
		}
	}

}
