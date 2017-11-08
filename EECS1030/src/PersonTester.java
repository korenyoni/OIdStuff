import java.util.ArrayList;



public class PersonTester
{
	public static void main(String[] args)
	{
		/**
		 * 
		 * This is an object initialized in the tester
		 */
		Person p1 = new Person("Jane Doe", 32, "321-555-1234");
		Person p2 = new Person("Aaron Wu", 28, "awu@mail.com");
		// Create additional Person objects as needed.
		
		// Test toString
		System.out.print("Testing toString...");
		if (p1.toString().equals("Jane Doe, age: 32, contact: 321-555-1234"))
		{
			System.out.println("passed\n");
		}
		else
		{
			System.out.println("failed\n");
		}
		
		// Test compareTo
		System.out.print("Testing compareTo...");
		boolean result = p1.compareTo(p1) == 0;
		result &= p1.compareTo(p2) > 0;
		result &= p2.compareTo(p1) < 0;
		if (result)
		{
			System.out.println("passed\n");
		}
		else
		{
			System.out.println("failed\n");
		}
		
		// Add and implement other tests as needed...
		System.out.println(p1.toString());
		;
		int[] list = {0};
		list.length;
		System.out.println(IntegerArrayList.sum(list));
	}
}