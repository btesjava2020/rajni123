package rr;
import java.util.Scanner;

public class string_len_without_inbuilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		int count=0;
		char ar[]=str.toCharArray();
		for(char c:ar) {
			count++;
		}
System.out.println(count);
	}

}
