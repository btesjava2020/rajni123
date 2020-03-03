package rr;

		import java.util.Scanner;
		public class Countvowel {

			public static void main(String[] args) {
		int count=0;
		System.out.println("enter a sentences");
		Scanner sc =new Scanner(System.in);
		String sentence=sc.nextLine();
		for(int i=0;i<sentence.length();i++) {
			char ch=sentence.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
				
			}
			}
		System.out.println("Number of vowels in the given sentence is"+count);

			}

			


		}
	


