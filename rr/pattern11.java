package rr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pattern11 {

	public static void main(String[] args)throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		// TODO Auto-generated method stub
		int n=Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(j==5 || (i+j)==10 || (i-j)==0)
					System.out.print("*");
				else
					System.out.print("0");
				
			}
			System.out.println();
		}

	}

}
