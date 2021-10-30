package StringBuffer;

public class q2 {
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("It is used to ");
		sb.append("at the specified index position");
		sb.insert(14, "insert text ");
		System.out.print(sb);
	}
}