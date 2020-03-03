          package rr;
        import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;

		public class Student {
			
		// instance variables
			String reg_id;
			String name;
			float marks;
			static final String college="YPS";
			Student s6;
			 void Student(String reg,String na,float marks){
				reg_id=reg;
			    name=na;
			    this.marks=marks;
			  }
		// instance methods
			void disp() {
				System.out.println("Reg_Id="+reg_id+""+"Name="+name+""+"Marks="+marks);
			}
			static void cal_highest(Student stud[]) {
				int highest;
				System.out.println(stud[0].name);
				}
			public static void main(String[] args)throws IOException {
				int i;String reg,name;float marks;
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		// array of objects
				Student[]stu=new Student[5];
				for(i=0;i<stu.length;i++) {
					System.out.println("enter RegId");
					reg=br.readLine();
					System.out.println("enter name");
					name=br.readLine();
					System.out.println("enter marks");
					marks=Float.parseFloat(br.readLine());
					stu[i]=new Student();
				}
		        cal_highest(stu);
			}
		


		}


