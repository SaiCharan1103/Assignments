package q1;

@FunctionalInterface
interface operation{
	int oper(int a,int b);
	
	}

public class Arithmetaic {
	public static void main(String[] args) {
		//addition	
			operation addition=(int a,int b) ->(a+b);
			{System.out.println("the addition is: " +addition.oper(11,3));
			
			};
			//subtraction
			operation subtraction=(int a,int b) ->(a-b);
			{System.out.println("the subtraction is: " +subtraction.oper(11,3));
			
			};
			//multiplication
			operation multiplication=(int a,int b) ->(a*b);
			{System.out.println("the addition is: " +multiplication.oper(11,3));
			
			};
			//division
			operation division=(int a,int b) ->(a/b);
			{System.out.println("the addition is: " +division.oper(11,3));
			
			};
}
}