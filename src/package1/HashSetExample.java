package package1;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//does not accept duplicate values
		//There is no guarantee that elemnts are stored in sequential order
		
	
		HashSet<String> hs= new HashSet<String>();
		
		hs.add("INDIA");
		hs.add("USA");
		hs.add("UK");
		hs.add("he");
		hs.add("she");
		hs.add("UK");
		
		System.out.println(hs);
		
		//System.out.println(hs.remove("USA"));
		
		System.out.println(hs.isEmpty());
		
		System.out.println(hs.size());
		
		Iterator<String> i= hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
