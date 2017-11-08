import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class RightAnwser 
{

	public static void main(String[] args) 
	{
		
	Scanner input = new Scanner(System.in);
	Set<Integer> name = new TreeSet<Integer>();
	boolean distinct = true;
	System.out.println("Enter the list");
	for (int z = input.nextInt(); z >= 0; z = input.nextInt())
	{
		distinct =  distinct & name.add(z);
	}
	if(distinct)
	{
		System.out.println("Thge list is distinct"+ name);
	}
	else
	{
		System.out.println("Thge list is not distinct"+ name);
	}
}
	}
