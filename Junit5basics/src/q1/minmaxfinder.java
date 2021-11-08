package q1;

import java.util.Arrays;

public class minmaxfinder {
	public int[] findMinMax(int[] a) {
		//int max=0,min=0;
		int[] arr = new int[2];
		Arrays.sort(a);
		
		arr[0] = a[0];
		arr[1] = a[a.length-1];
		
		return arr;
		   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          minmaxfinder obj = new minmaxfinder();
          
         int[] a =  obj.findMinMax(new int[] {1,3,4,5,7});
         
         System.out.println(a[1]);
	}

}