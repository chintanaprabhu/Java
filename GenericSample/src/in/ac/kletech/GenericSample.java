package in.ac.kletech;

import java.util.ArrayList;
/*
 * Cosmic Super->Object
 *Wrapper class->Integer type object
 *<>->Generic
 *No type casting required
 *Generic is type safe
 *Min java version Required J2SE 5+
 *Compile time Checking
 *Generic forces programmer to Specify one type of object
 *
 */
public class GenericSample {

	public static void main(String[] args) {
/*
//		int a=20;
		ArrayList<String> list = new ArrayList<String>();
//		list.add(a);
		list.add("Pallavi");
		
		System.out.println(list.get(0));*/
		Pair<Integer> pair = new Pair<Integer>(5,6);
		System.out.println(pair.getFirst()+"  "+pair.getSecond());
	}

}
