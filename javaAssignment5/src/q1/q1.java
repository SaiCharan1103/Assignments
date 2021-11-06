package q1;

import java.util.HashSet;
import java.util.Set;

public class q1 {
	public static void main (String[] args)
	{
		Set<String>myset = new HashSet<String>();
		myset.add("id=001  ");
		myset.add("name=sai  ");
		myset.add("department=JFS  ");
		myset.add("salary=20000  ");
		for(String str:myset) {
			System.out.print(str);
		}
 }
}