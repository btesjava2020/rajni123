package rr;


		public class Bubblesort {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				int[]a= {37,21,28,12,2};
				int temp;
				for(int i=0;i<a.length;i++)
				{
				for(int j=0;j<a.length-1-i;j++)
				{
					if(a[j]>a[j+1])
					{
						temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}}}
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]+" ");

				}

							
					}
				

	}


