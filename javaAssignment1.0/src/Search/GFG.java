package Search;

import java.util.Arrays;

class GFG {

	private static void check(int[] arr, int toCheckValue)
	{

		boolean test = false;
		for (int element : arr) {
			if (element == toCheckValue) {
				test = true;
				break;
			}
		}

		// Print the result
		System.out.println("Is " + toCheckValue
						+ " present in the array: " + test);
	}

	public static void main(String[] args)
	{

		// Get the array
		int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47 };

		int toCheckValue = 52;

		System.out.println("Array: "
						+ Arrays.toString(arr));
		
		check(arr, toCheckValue);
	}
}
