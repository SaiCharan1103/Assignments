package q5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class firstletter {
	
	 public static void main(String[] args) {
	        List<String> list = new ArrayList<>();
	        list.add("foo");
	        list.add("bar");
	        list.add("baz");
	        String result = list
	            .stream()
	            .map(s -> s.substring(0, 1))
	            .collect(Collectors.joining());
	        StringBuilder chars = new StringBuilder();
	        for (String l : list) {
	            chars.append(l.charAt(0));
		        System.out.println(result); 
	        }  
	    }
	}