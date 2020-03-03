package rr;

public class Booleanflag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		boolean flag;int count = 0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=2*i;j++)
			{
				flag=true;
				for(int k=2;k<j;k++) {
					if(j%k==0)
				{flag=false;
				break;}}
				if((flag==true)&&(count<=2))
				System.out.println(j);
				count++;
			}
			System.out.println();
				}

			}
		


	}


