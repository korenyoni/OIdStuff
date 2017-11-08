import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class ProperPractice 
{

	public static void main(String[] args) 
	{
		int coppier;
		int keyCoppier;
		Map <Integer , Integer > userMap = new TreeMap< Integer ,Integer >();
		Map <Integer , Integer > copyMap = new TreeMap< Integer ,Integer >();
		Set<Integer> keys= new HashSet<Integer>();
		userMap.put(5 , 7); 
		userMap.put(4 , 66); 
		//userMap.put(2 , 88); 
		userMap.put(1 , 6);
		userMap.put(3 ,12);
	//	userMap.navigatableSet;
		for(int i=0;i<=userMap.size() + 1;i++)
		{
		if(userMap.get(i)!= null)
		{
	    coppier = userMap.get(i);
		keyCoppier=userMap.get(i);
		//System.out.println(userMap.keySet());
		copyMap.put(coppier,keyCoppier);
		}
		}
		System.out.println(copyMap);
		System.out.println(userMap.get(3));
	//	userMap.
	}
}

	