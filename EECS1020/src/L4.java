import java.io.File;
import java.util.*;

import type.lib.*;

public class L4 {

	public static void main(String[] args) 
	{
	Scanner in = new Scanner(System.in);	
	File data=new File ("Data.txt");
	Fraction a= new Fraction(in.nextLong(),in.nextLong());
	Fraction b= new Fraction(in.nextLong(),in.nextLong());
	Fraction a2= new Fraction(a);
	Fraction half= new Fraction(1,2);
    a.add(b); 
    a.multiply(half);
    System.out.println("Arithmetic Mean="+ a);
    a.divide(half);
    a2.multiply(b);
    a2.divide(a);
    System.out.println("Relative Mean"+a2);
	}

}
