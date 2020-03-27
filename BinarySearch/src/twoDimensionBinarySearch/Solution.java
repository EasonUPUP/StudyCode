package twoDimensionBinarySearch;

public class Solution {
	int twoDBinarySearch(int[][] matrix, int target) {
		if(matrix.length == 0 ||matrix[0].length == 0 )
			return -999;
		
		int row = matrix.length;
		int col = matrix[0].length;
		//System.out.println("It is in row " + row + " col " + col);
		
		int left = 0;
		int right = row*col - 1;
		
		while (left <= right) {
			int mid = left + (right-left)/2;
			int mid_row = mid / col;
			int mid_col = mid % col;
			
			if (matrix[mid_row][mid_col] == target) {
				System.out.println("It is in row " + mid_row + " col " + mid_col);
				return 1;
			}
			else if(matrix[mid_row][mid_col] < target) {
				left = mid + 1;
			}
			else{
				right = mid - 1;
			}
		}
		
		return -1;
	}
}
