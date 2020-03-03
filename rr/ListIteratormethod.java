package rr;
 import java.util.ArrayList;
		import java.util.Iterator;
		import java.util.ListIterator;

		public class ListIteratormethod {

			public static void main(String[] args) {
				ArrayList<String>arr=new ArrayList<String>();
				arr.add("RAJNI");
				arr.add("SAPNA");
				arr.add("RAHUL");
				arr.add("GAGAN");
				arr.add("DOLLY");
		      //	for(String s:arr) {
					//System.out.println(s);
				//}
				ListIterator itr=arr.listIterator();
				while(itr.hasNext()) {
					itr.next();
				}

				while(itr.hasPrevious()) {
					System.out.println(itr.previous());
				}

				
			}

		
	}


