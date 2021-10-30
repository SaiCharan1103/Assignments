package Marks;

import java.util.ArrayList;

public class marks {
	 
	    static void getStudentsList(String[] file)
	    {
	        
	        int avgScore;
	        int maxAvgScore = Integer.MIN_VALUE;
	 
	       
	        ArrayList<String> names = new ArrayList<>();
	        for (int i = 0; i < file.length; i += 4) {
	
	            avgScore = (Integer.parseInt(file[i + 1]) +
	                        Integer.parseInt(file[i + 2]) +
	                       Integer.parseInt(file[i + 3])) / 3;
	 
	            if (avgScore > maxAvgScore) {
	                maxAvgScore = avgScore;
	 
	                names.clear();
	                names.add(file[i]);
	            }
	 
	            else if (avgScore == maxAvgScore)
	                names.add(file[i]);
	        }
	        for (int i = 0; i < names.size(); i++) {
	            System.out.print(names.get(i) + " ");
	        }
	 
	        System.out.print(maxAvgScore);
	    }
	 
	    public static void main(String args[])
	    {
	        String[] file = { "Shrikanth", "20", "30",
	                        "10", "Ram", "100", "50", "10" ,"Sai","74","79","84"};
	        getStudentsList(file);
	    }
	}


