package q3;
public class exchange {
	public static void main(String[] args) {
		Integer arr[]= {1,2};
		System.out.println("Before exchanging:-"+arr[0]+" "+arr[1]);
		System.out.println("After exchange :- ");
		exchangeArr(arr);
		
	}
	public static <T>  void exchangeArr(T[] arr) {
		T temp=arr[1];
		arr[1]=arr[0];
		arr[0]=temp;
		System.out.println(arr[0]+" " +arr[1]);
		return ;
	}
}