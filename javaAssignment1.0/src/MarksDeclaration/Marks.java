package MarksDeclaration;

import java.util.Scanner;
		public class Marks 
		{ 
			public static void main(String args[])
			   {
			      float[] marks = new float[3];
			      float sum=0, avg;
			      int i;
			      try (Scanner scan = new Scanner(System.in)) {
					System.out.print("Enter Marks Obtained in 3 Subjects: ");
					  for(i=0; i<3; i++)
					     marks[i] = scan.nextFloat();
				}
			      
			      for(i=0; i<3; i++)
			         sum = sum + marks[i];
			      avg = sum/3;
			      
				  
			      if(avg>=60)
			         System.out.println("pass");
			      else if(avg<60)
			    	  System.out.println("fail");
			   }
		}

