package rr;

		import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;
		public class Calculator {

			public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num1=0,num2=0,choice=0;
		String name=null;
		char ch='n';
		{
			System.out.println("enter first number");
			num1=Integer.parseInt(br.readLine());
			System.out.println("enter second number");
			num2=Integer.parseInt(br.readLine());
			System.out.println("enter your name");
			name=br.readLine();
			}
		     do {

			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Modulous");
			
			System.out.println("enter choice");
			{
				choice=Integer.parseInt(br.readLine());
			}

			switch (choice)
			{
			case 1:
			{System.out.println("result"+(num1+num2));
			break;}
			case 2:
			{System.out.println("result"+(num1+num2));
			break;}
			case 3:
			{System.out.println("result"+(num1*num2));
			break;}
			case 4:
			{System.out.println("result"+(num1/num2));
			break;}
			case 5:
			{System.out.println("result"+(num1%num2));
			break;
			}}
			System.out.println("Do you want to continue(y/n)");
			{
				ch=br.readLine().charAt (0);
			}
			{
				System.out.println("e");
			}
		     }  while(ch=='y'||ch=='y');
			System.out.println("hello" +name+ "calculator stopped: run program again to restart");
		     }
			


	}


