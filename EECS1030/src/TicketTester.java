import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Scanner;


public class TicketTester
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
	
		final int NUMBER_OF_PEOPLE = 10;
		ArrayList<TakeANumber> peopleInLine = new ArrayList<TakeANumber>();
		
		System.out.println("A group of people get together...");
		for (int i = 0; i < NUMBER_OF_PEOPLE; i++)
		{
			peopleInLine.add(TakeANumber.getInstance());
		}
		
		System.out.println("Each one takes a ticket... " +
				"and shows you their number");
		for (TakeANumber person : peopleInLine)
		{
			System.out.print("" + person.takeTicket() + " ");
		}
		System.out.println();
		
		System.out.println("If all the numbers are different (and in order), " +
				"then the singleton was implemented correctly.");
		System.out.println("If all the numbers are the same, then each person " +
				"got a ticket from a source, not a singleton. Try again.");
	
		System.out.println("Are you ready for this");
		
	}




   
}



