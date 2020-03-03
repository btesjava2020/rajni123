package rr;

public class countoccrances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="javaExamplesjavaCodejavaProgram";
		String strFind="java";
		int Count=0; int fromIndex = 0;
		while((fromIndex=str.indexOf(strFind ,fromIndex)) !=-1)	{
		System.out.println("Found at index: "+fromIndex);
        Count++;
        fromIndex++;
		}
		System.out.println("Total occurrences: "+ Count);
	}

}
