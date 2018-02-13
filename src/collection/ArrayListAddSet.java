package collection;

import java.util.ArrayList;

public class ArrayListAddSet {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Amit");
		al.add("Vijay");
		al.add("Kumar");
		
//		///for add
//		al.add(1, "Sachin");
//		for (String s : al) {
//			System.out.println(s);
//		}
		
		///for see
		al.set(1, "Sachin");
		for (String s : al) {
			System.out.println(s);
		}
		

		// System.out.println("Element at 2nd position: "+al.get(2));

		
	}

}
