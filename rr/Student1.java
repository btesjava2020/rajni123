package rr;

		import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;

		public class Student1 {
			 String reg_id;
			  String name;
			  String marks;
			  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			  Student1
			  ()throws IOException{
				  
				  System.out.println("enter registration id: ");
				  reg_id =br.readLine();

			       name=br.readLine();
			       System.out.println("enter marks : ");
			      Float marks =Float.parseFloat(br.readLine());
			      
			  }
			       	  
			  void disp() {
				  System.out.println("Reg_id="+reg_id+""+"Name="+name+""+"Marks="+marks);
			  }
			  
				public static void main(String[] args)throws IOException {
					System.out.println("enter details of first student: ");
					Student s1=new Student();
					System.out.println("enter detail of second student: ");
					Student s2=new Student();
					System.out.println("enter detail of third student: ");
					Student s3=new Student();
					
				System.out.println();
					System.out.println("detail of first student : ");
					s1.disp();
					System.out.println("details of second student : ");
					s2.disp();
					System.out.println("details of third student : ");
					s3.disp();

			}


	}


