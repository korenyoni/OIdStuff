import java.util.*;
public class TestPrep1030 {
/**
 * 
 * @author tynoble
 * @param args
 * @param somebullshit I had too
 */
	public static void main(String[] args) 
	{
		Scanner input= new Scanner(System.in);
		
		int listValues;
		int size;
	
		System.out.println("How many places long do you want your list?");
		size=input.nextInt();
		System.out.println("Enter the values to add to the list");
		
		Map<Integer,String> doStuff = new TreeMap<Integer,String>();
		
		for(int i=0;i<size;i++)
		{
				
			String yourName=input.next();
			int age=input.nextInt();
		    
			doStuff.put(age,yourName);			
		}
		System.out.print(doStuff);
		
		
     
	}



}
