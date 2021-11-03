package q6;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

class Op implements UnaryOperator<String> {
		   public String apply(String str) {
		      return str.toUpperCase();
		   }
		}
		public class test {
		   public static void main(String[] args) {
		      ArrayList<String> list = new ArrayList<>();
		      list.add("Hi");
		      list.add("i am");
		      list.add("Sai Charan");
		      list.add("i am doing");
		      list.add("lambdas");
		      System.out.println("Contents of the list: "+list);
		      list.replaceAll(new Op());
		      System.out.println("Contents of the list after replace operation: \n"+list);
		   }
		}