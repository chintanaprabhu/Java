package in.gen;

import java.util.ArrayList;

public class Generic2 {
public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(55);                    //compile time checking
	list.add(56);
	int a = list.get(0);
	System.out.println(a);
}
}
