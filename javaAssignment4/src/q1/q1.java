package q1;

import java.util.Scanner;

public class q1{

	public static void main(String[] args) {
		int num1,num2;float divide = 0;
		try {
			try (Scanner sc = new Scanner(System.in)) {
				System.out.print("Enter the first number: ");  
				num1=sc.nextInt();
				System.out.print("Enter the second number: ");  
				num2=sc.nextInt();
			}
				divide=num1/num2;
		} catch (Exception e) {
			e.printStackTrace();
		}
			System.out.print(divide);

	}
	}