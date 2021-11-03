package q7;

import java.util.Scanner;

public class desertshop {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			desertitems candy = new candy();
			desertitems cookies = new cookies();
			desertitems iceCream = new candy();
			owner owner = new owner();
			customer customer = new customer();
			Boolean isTrue = true;
			
			while(isTrue) {
				
				System.out.println("\n\nOwner or Cutomer");
				System.out.println("press 1 for Owner press 2 for customer and 0 to exti");
				 
				 
				int key = sc.nextInt();
				
				if(key == 1) {
					System.out.println("\n"+"Owner:");
				 
					owner.addDessert(candy, cookies, iceCream);	
					
				}else if(key == 2){	
					customer.placeOrder(candy, cookies, iceCream);
				}
				else if(key == 0){
					int num = sc.nextInt();
					if (num == 1) {
						isTrue = false;
					}
				}	
			}
			sc.close();
		}
	}