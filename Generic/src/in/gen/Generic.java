package in.gen;

import java.util.ArrayList;

public class Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList list = new ArrayList();
       list.add("KLETECH");
       list.add(2145);
       list.add(new Integer(532));       //list.add() expects an object
       list.add(true);
       
       String s = (String)list.get(0);
       int a = (int) list.get(1);
       
       System.out.println(s);
       System.out.println(a);
       System.out.println(list.get(2));
       System.out.println(list.get(3));
       
	}

}
