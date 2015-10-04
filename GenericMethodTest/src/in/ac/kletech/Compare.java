package in.ac.kletech;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Compare {

	public static <T extends Comparable> Pair<T> minmax(T[] a)
	{
		if(a==null || a.length==0) return null;
		T min = a[0];
		T max = a[0];
		for (int i=1;i<a.length;i++)
		{
			if (min.compareTo(a[i])> 0) min = a[i];
			if (max.compareTo(a[i])< 0) max = a[i];
		}
		return new Pair<T> (min,max);
	}
	 
	public static void main(String[] args) {
		GregorianCalendar[] birthdays = 
			{
				new GregorianCalendar(1906,Calendar.DECEMBER,9),
				new GregorianCalendar(1995,Calendar.JANUARY,26),
				new GregorianCalendar(1995,Calendar.DECEMBER,30)
			};
		Integer[] in =
			{
				new Integer(54),
				new Integer(52),
				new Integer(865),
				new Integer(451)
			};
		String[] st =
			{
				new String("abc"),
				new String("abcd"),
				new String("abcde")
			};
		Pair<Integer> i = Compare.minmax(in);
		Pair<String> s = Compare.minmax(st);
		//Pair<GregorianCalendar> mn = Compare.minmax(birthdays);
        System.out.println("min = " +i.getFirst());
        System.out.println("max = " +i.getSecond());
        
        System.out.println("min = " +s.getFirst());
        System.out.println("max = " +s.getSecond());
        
}
}

