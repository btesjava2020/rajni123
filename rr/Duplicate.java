package rr;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {3,2,5,5,2,8,};
		for(int i=0;i<a.length-1;i++)
		{
			int temp=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("first duplicate is "+a[j]);
					temp=temp+1;
					break;
					
				}
			}
		}

	}

}
