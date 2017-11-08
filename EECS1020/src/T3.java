import java.util.regex.Matcher;
import java.util.regex.Pattern;

import type.util.Scanner;


public class T3 {

	public static void main(String[] args) 
	{
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the string");
		String entry=in.nextLine();
		double tcount=0;
		int thecount=0;
		String bigWord = "";
		String regex = "[A-Z][0-9][A-Z]?[ ][0-9][A-Z][0-9]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(entry);
		boolean postalFind=matcher.find();
		for(int i=0;i<entry.length();i++)//lower case counter
		{
			
			if(entry.charAt(i)=='t')
			{
				 tcount=tcount+1;
			}
		}
		double total= tcount/(entry.length())*100;
		System.out.printf("Frequency of 't' is:  %.1f%%\n",total);
		
	//int what=entry.indexOf("the");
//	System.out.println(what);
	
		String[] splitString=entry.split(" ");
		for(int i=0;i<splitString.length;i++)//the instance counter
		{			
			if(splitString[i].indexOf("the")>-1)
			{
				thecount++;
			}
			
		}
		System.out.println("The sequence \"the\" appears "+thecount+" times.");
		
		if(postalFind)
		{
			System.out.println(matcher.group());
		}
		else
		{
			System.out.println("No Canadian Postal Code.");
		}
		
		
		for(int i=0;i<splitString.length;i++)//Longest word
		{			
		if(splitString[i].length()>bigWord.length())
		{
			bigWord=splitString[i];
		}
			
		}
		System.out.println("The longest word is \""+bigWord+"\"");
	}

}
