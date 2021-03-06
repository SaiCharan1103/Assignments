package q1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class minmaxfinderTest {
	@Test
	void test() {
		
		minmaxfinder obj = new minmaxfinder();
		
		int[] actual = obj.findMinMax(new int[] {1,2,3});
		int[] expected = new int[] {1,3};
		
		int[] actual1 = obj.findMinMax(new int[] {2,3,4});
		int[] expected1 = new int[] {2,4};
		
		int[] actual2 = obj.findMinMax(new int[] {3,4,5,6});
		int[] expected2 = new int[] {3,6};
		
		assertArrayEquals(expected, actual);
		assertArrayEquals(expected1, actual1);
		assertArrayEquals(expected2, actual2);
}
}