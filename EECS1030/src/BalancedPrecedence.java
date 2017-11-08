import java.io.PrintStream;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;
public class BalancedPrecedence
{
	private static final String OPEN = "([{";
	private static final String CLOSE = ")]}";
	private static Stack<Character> precedenceOps;
	@SuppressWarnings("null")
	public static void main(String[] args)
	{
		
		boolean overlapping = false;
        boolean imbalanced = false;
       
		PrintStream output = System.out;
		output.println("Enter expression:");
		Scanner input = new Scanner(System.in);
		String expression = input.nextLine();
		input.close();
		precedenceOps=new Stack<Character>();
		// Your code goes here.
		String status = "boppabooey";

		
		
		for(int i=0; i<expression.length();i++)
		{
			char c =expression.charAt(i);
			
			 if(OPEN.indexOf(c)>=0)
	            {
	                precedenceOps.push(c);
	            }
			 if(CLOSE.indexOf(c)>=0)
			 {
				
				 if(!precedenceOps.isEmpty())
				 { 
					 char killme = precedenceOps.pop();
					 System.out.println(precedenceOps.size());
					 if(OPEN.indexOf(killme)!=CLOSE.indexOf(c))
					{
						overlapping=true;
					}
				
				 }	 
				 else 
				 {
					 imbalanced=true;
				 }
			
			 
		
			 }
			
		}
		System.out.println(precedenceOps);
		if(precedenceOps.size()>0)
		{
			imbalanced=true;
		}
		
		
		if(imbalanced==true)
		{
			status="imbalanced";
		}
		else if(overlapping==true)
		{
			status="overlapping";
		}
		else 
		{
			status="balanced";
		}
			System.out.println(status);
			
		}
}