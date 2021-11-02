package q2;

import java.io.IOException;
import java.util.Scanner;

public class q2 {

	public static int main(String[] args) throws IOException {
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
			throw new IOException ("File I/O exception has occured..");
	}
	}
	