package q7;

import java.util.Scanner;

public class owner {
		
		public void addDessert(desertitems candy , desertitems cookies , desertitems icecream ) {
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Add dessert: ");
				Boolean isTrue = true;
				
				while(isTrue) {
					 
					System.out.println("Enter number of Candy to add : ");
					candy.numOfDesert +=  sc.nextInt();
				 
					System.out.println("Enter number of Cookies to add : ");
					cookies.numOfDesert +=  sc.nextInt();
				 
					System.out.println("Enter number of Icecream to add : ");
					icecream.numOfDesert +=  sc.nextInt();
					
					System.out.println("Enter 0 to add more and 1 if completed : ");
					int num = sc.nextInt();
					if (num == 1) {
						isTrue = false;
					} 
					System.out.println("Added successfully!!!");
					
				}
			}
		}

	}