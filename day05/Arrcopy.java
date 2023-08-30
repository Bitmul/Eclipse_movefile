package day05;

public class Arrcopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = new int[3];
		arr1[0] =10;
		arr1[1] = 15;
		arr1[2] = 20;
		
		for(int tmp : arr1)
		{
			System.out.println(tmp);
		}
		
		int arr2[] = new int[5];
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
//		for(int i =0;i<arr1.length;i++)
//		{
//			arr2[i] = arr1[i];
//		}
		
		for(int tmp : arr2)
		{
			System.out.println(tmp);
		}
		
		String sub[] = new String[3];
		
		sub[0] = "국어";
		sub[1] = "영어";
		sub[2] = "수학";
		for(String tmp : sub)
		{
			System.out.println(tmp);
		}
		System.out.println();
		String sub2[] = new String[5];
		System.arraycopy(sub, 0, sub2, 0, sub.length);
		sub2[3] = "사회";
		sub2[4] = "과학";
		
		for(String tmp : sub2)
		{
			System.out.println(tmp);
		}
	}

}
