import java.util.*;

import type.lib.*;
public class T1 {

	public static void main(String[] args) 
	{
		
		
		//Variable
		Scanner in= new Scanner(System.in);
		final double A= 12.75e-2;
		
		System.out.println("Enter the risk rating:");
		double r= in.nextDouble();// This is risk value
		System.out.println("Enter the par value:");
		double p= in.nextDouble();//this is Par value
		
	
		
		ToolBox.crash(r<0, "Risk rating must not be negative!");
		ToolBox.crash(r>0.3, "Risk rating must be less than 0.3!");
		
		//Computation
		double numerator=r*p;
		double denominator= A-Math.pow(r,2); 
		denominator=Math.sqrt(denominator);
		double m=numerator/denominator;//final output
		
		
		//Output
		System.out.printf("The Market Value is: %.1f ",m);

	}

}
