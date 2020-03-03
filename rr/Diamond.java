package rr;


		import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;

		public class Diamond {

			public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter character for limit: ");
		char ch=(char)br.readLine().charAt(0);

		for(char i='a';i<=ch;i++) {
			for(char j=i;j<=ch;j++) {
				System.out.print("  ");
			}
			for(char j='a';j<=i;j++) {
				System.out.print(j+" ");
			}
				for(char j=(char)(i-1);j>='a';j--) {
					System.out.print(j+" ");
				}
				System.out.println();
				
			}
			System.out.print("  ");
			for(char s = (char)(ch-1),i ='a';i<ch;i++,s--) {
				for(char j='a';j<=i;j++) {
					System.out.print("  ");
				}
				for(char j ='a';j<=s;j++) {
					System.out.print(j+" ");
				}
				for(char j=(char)(s-1);j>='a';j--) {
					System.out.print(j+" ");
				}
				System.out.println();
				System.out.print("  ");
			}
		}

			

			


	}


