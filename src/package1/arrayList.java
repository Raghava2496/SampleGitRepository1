package package1;

import java.util.ArrayList;

public class arrayList {
	//can accept duplicate value
	//can access and insert any value in any index

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a= new ArrayList<String>();
		
		a.add("Raghava");
		a.add("Java");
		System.out.println(a);
		
		a.add(0,"Student");
		System.out.println(a);
		
		/*a.remove(1);
		a.remove("Java");
		System.out.println(a);*/
		
	
		System.out.println(a.get(2));
		
		System.out.println(a.contains("testing"));
		System.out.println(a.indexOf("Raghava"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
	}

}
