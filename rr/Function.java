package rr;

		public class Function {

			public String checknums (int num1, int num2) {
			if(num2>num1) {
				return "true";
		}
		else if(num1<num2)
		{
			return "false";
			}
		else{
			return "-1" ;
			}
			}
			public static void main(String[] args)
			{
						
			Function obj=new Function ();
			System.out.println (obj.checknums(11,12));
			
			

		}


	}


