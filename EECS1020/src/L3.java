		import java.util.*;
		import type.lib.*;
		public class L3 {
		
			public static void main(String[] args) 
			{
				  Scanner input=new Scanner(System.in);
				  Date date = new Date();
				  final int MILITODAY=86400000;
				
				  System.out.println("Enter an integer:");
				  long daysto=input.nextInt();
				  ToolBox.crash((daysto%2==0) && daysto>10000,"Invalid n value");
				
				  System.out.println("That many days after the epoch,");
				  daysto=daysto*MILITODAY;
				  date.setTime(daysto);
				  System.out.println(date.toString());
	//Thats all folks
			}
		
		}
