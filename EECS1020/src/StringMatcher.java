import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//create a program that tells you if the sting matches it. 
public class StringMatcher {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Fuck you tryna say?");
		String TrynaSay=in.nextLine();
		Pattern p=Pattern.compile(TrynaSay);
		System.out.println("So Im hearin, are we hearin the same shit");
		String whatdidyouwannamatch=in.nextLine();
		Matcher m=p.matcher(whatdidyouwannamatch);	
		boolean booleanie=m.matches();
		
		if(booleanie)
		{
			System.out.println("Yo thats a chorus aight");
			System.out.println("nts nts "+p+" my n*gga "+p+" aint tryna "+p+" now hit me up with da next verse ");
			
			
		}
		else
		{
			System.out.println("try me one more time motherfucker just match the words");
		}
	}

}
