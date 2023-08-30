package personalProject;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class NumberCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int cnt =0;
		Vector<Integer> vc = new Vector<Integer>(500000,1);
		Vector<Integer> mvc = new Vector<Integer>(500000,1);
		Vector<Integer> mvcc = new Vector<Integer>(500000,1);
		Vector<Integer> ans = new Vector<Integer>(500000,1);
		for (int i =0;i<n;i++)
		{
			vc.add(scan.nextInt());
		}
		int m = scan.nextInt();
		for (int i =0;i<m;i++)
		{
			mvc.add(scan.nextInt());
			ans.add(0);
		}
		mvcc.setSize(mvc.size());
		Collections.copy(mvcc, mvc);
		Collections.sort(vc);
		Collections.sort(mvcc);
		for (int i =0;i<vc.size();i++)
		{
			if (Collections.binarySearch(mvcc,vc.get(i)) < 0)
			{
				vc.remove(i);
				i-=1;
			}
		}
		for (int j =0;vc.size() > 0;j++)
		{
			if (j >= 8 && cnt > n) break;
			else if (j >= 8)
			{
				cnt+=1;
				j=0;
			}
			if (Collections.binarySearch(vc, mvc.get(j)) >= 0)
			{
				ans.set(j, ans.get(j)+1);
				vc.remove(Collections.binarySearch(vc, mvc.get(j)));
			}
		}
		for (int i =0; i<ans.size();i++)
		{
			System.out.print(ans.get(i) + " ");
		}
		scan.close();
	}

}
