package rr;

public class Dupli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {8,5,7,4,7,9,3,2};
		System.out.print("duplicate element are");
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j] && (i!=j))
						{
					System.out.println(a[j]+"");
						}
			}
		}

	}

}
