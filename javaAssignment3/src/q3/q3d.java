package q3;

public class q3d {

	public static void main(String[] args) {
		String s1 = "Java String pool refers to collection of Strings which are stored in heap memory ";
		 System.out.println(s1.contains("collection "));
	     System.out.println(s1.contains("java string pool refers to collection of strings which are stored in heap memory "));
        s1= s1.toLowerCase();
	    System.out.println(s1.contains("java string pool refers to collection of strings which are stored in heap memory "));
	}

}
