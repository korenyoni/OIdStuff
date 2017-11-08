import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class T4R {

	public static void main(String[] args)
	{
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the words [use / as a sentinel]:");
	List<String> words= new ArrayList <String>();
	
	Map<Integer, Integer> lengths = new TreeMap<Integer, Integer>();
	boolean sentinel=true;

	//Computation
	while(sentinel)
{
	String instance=in.nextLine();

	boolean check=instance.equals("/");
	
	
	
	
	if(check)
	{
	sentinel=false;
	}
	
	words.add(instance);	



}
	
	
	//Output
	String formatedString = words.toString()
		    .replace(",", "")  
		    .replace("[", "")  
		    .replace("]", "") 
		    .replace("/", "")
		    .trim();           

	System.out.println("** The entered words:"+formatedString);
Collections.sort(words);
String formatedSorted = words.toString()

.replace(",", "")  
.replace("[", "")  
.replace("]", "")  
.replace("/", "")
.trim();           
int overallcount=0;
int previous=0;
for(int i=0;(i<words.size()-1);i++)//or words.iterator
{
	int wordcount=words.get(i).length();
	lengths.put(wordcount,overallcount);
	if(lengths.containsKey(wordcount))
	{
		overallcount++;
	}
	
}
System.out.println("** The sorted words:"+formatedSorted);
System.out.println("** Word-length distribution"+lengths.toString());
	}

}
