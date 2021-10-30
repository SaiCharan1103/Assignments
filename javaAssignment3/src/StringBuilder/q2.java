package StringBuilder;

public class q2 {
	public static void main(String[] args) 
	{
		StringBuilder sb=new StringBuilder("It is used to ");
		sb.append("at the specified index position");
		sb.insert(14, "insert text ");
		System.out.print(sb);
	}

}
