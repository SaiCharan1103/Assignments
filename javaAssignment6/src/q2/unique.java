package q2;

import java.util.HashSet;

public class unique {
	 public static void main(String[] args)
	    {
	        // HashSet initialization
	            HashSet<Integer> myhashset = new HashSet<>();
	    		myhashset.add(11);
	    		myhashset.add(21);
	    		myhashset.add(3);
	    		myhashset.add(4);
	    		myhashset.add(50);
	    		myhashset.add(6);
	    		myhashset.add(7);
	    		myhashset.add(87);
	    		myhashset.add(9);
	    		myhashset.add(10);
	    		myhashset.add(10);//silently ignoring the duplicate data
	    		myhashset.add(11);
	    		System.out.println(myhashset);
	    	
	    }

}
