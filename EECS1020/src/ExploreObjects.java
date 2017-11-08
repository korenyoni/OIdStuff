

import java.util.Date;

public class ExploreObjects
{

	public static void main(String[] args)
	{
		Date s = new Date();
		Date k = new Date();
		Date m = new Date(10000000);
		Date r = m;
		
		System.out.println("s = " + s);
		System.out.println("k = " + k);
		System.out.println("Is s==k ? " + (s == k));
		System.out.println("Is s.equals(k) ? " + s.equals(k));
		
		System.out.println("m = " + m);
		System.out.println("r = " + r);
		System.out.println("Is m==r ? " + (m == r));
		System.out.println("Is m.equals(r) ? " + m.equals(r));
		
		m.setTime(0);
		System.out.println("After setting m.setTime(0):");
		System.out.println("m = " + m);
		System.out.println("r = " + r);
		
		
		

	}

}
