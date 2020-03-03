package rr;


		import java.util.Scanner;

		public class Perfectnumber {

			public static void main(String[] args) {
		int num,sum=0;
		Scanner in = new Scanner(System.in);
		System.out.println("enter a number");
		num=in.nextInt();
		       if(num>0) {
		    	   for(int i =1; i<num; i++) {
		    				   if(num % i==0) {
		    					   sum=sum+i; 
		    				   
		    				   }
		    				   
		    			   }
		    			   if(sum == num) {
		    				   System.out.println(num+"is a perfect number");
		    			   }
		    			   else {
		    				   System.out.println(num+"is not a perfect number");
		    			   }}
		    			   else {
		    				   System.out.println("please enter a positive number");
		    			   }
		    		   }
		    	   
			


		



			


	}


