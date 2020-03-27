package smallestElementLargeThanTarget;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		//int[] testTable = {5};
		int[] testTable = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		for (int input : testTable) {
			test(input);
		}
	}

	private static void test(int input) {
		Solution solution = new Solution();
		int output;
		int[] base = {1,5,5,5,5,6,7};
		long begin = System.currentTimeMillis();
		output = Solution.firstLarge(base, input);
		long end = System.currentTimeMillis();
		System.out.println("input= " + input + "||output=" + output);
		System.out.println();
		System.out.println("Time：" + (end - begin) + "ms");
		System.out.println("-------------------");
	}

}