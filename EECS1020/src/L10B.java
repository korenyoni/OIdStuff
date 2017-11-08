import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;


public class L10B {

	public static void main(String[] args) throws FileNotFoundException
	{
		File file= new File ("marks2.txt");
		Scanner in= new Scanner(file);	
		TreeSet<Integer> tree= new TreeSet<Integer>();
		TreeSet<Integer> aboveav= new TreeSet<Integer>();
		
		System.out.println("Marks entered with negative sentinel:");
		boolean booleanie=true;
		int count=0;
		int sum=0;
		while (booleanie)
		{
			String markful=in.nextLine();
			
			String[] takencl=markful.split(" ");
			int mark=Integer.parseInt(takencl[0]);
			String cl= takencl[1];
			if (mark<0)
			{
				booleanie = false;
			}
			count++;
		//	System.out.println(sum);
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
