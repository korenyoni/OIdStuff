import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;


public class L10A {

	public static void main(String[] args) throws FileNotFoundException
	{
		File file= new File ("marks.txt");
		Scanner in= new Scanner(System.in);	
		TreeSet<Integer> tree= new TreeSet<Integer>();
		TreeSet<Integer> aboveav= new TreeSet<Integer>();
		
		System.out.println("Marks entered with negative sentinel:");
		boolean booleanie=true;
		int count=0;
		int sum=0;
		while (booleanie)
		{
			int mark=in.nextInt();
			if (mark<0)
			{
				booleanie = false;
			}
			count++;
			System.out.println(sum);
			tree.add(mark);
			sum=sum + mark;
		}
		
		int average=sum/count;
		for (int a: tree)
		{
			if (a>average) aboveav.add(a);
		}
		System.out.println(aboveav);
		System.out.println(tree);
		System.out.println(average);
		//how many distinct elements are there 
		
	}

}
