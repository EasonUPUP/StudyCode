package closetElement;

public class Solution {
	public static int closestElement(int[] nums, int target) {
        int left=0;
        int right=nums.length-1; //begins at 0
        
        // Corner cases 
        if (target <= nums[left]) 
            return nums[left]; 
        if (target >= nums[right]) 
            return nums[right]; 
        
        //System.out.println(right);
        //int[] base = {1,2,3,4,7,9,10};
        while(left < right - 1) {
        	int mid = left + (right - left)/2;
        	//System.out.println(mid);
        	if(nums[mid]==target) {
        		//System.out.println("Found! left "+left + " right "+right);
        		if(Math.abs(nums[mid-1]-target) <= Math.abs(nums[mid+1]-target)) {
      	      	  System.out.println("Found! left "+nums[mid-1]+"right "+nums[mid+1]);
      	      	  return nums[mid-1];}
        		else {
        			System.out.println("Found! left "+nums[mid-1]+"right "+nums[mid+1]);
      	      	  return nums[mid+1];}
        	}
        	else if(nums[mid]<target) {
        		left = mid;
        		}
        		//System.out.println("Found! left "+left+"right "+right);}
        	else {
        		right = mid;
        		}
        		//System.out.println("Found! left "+left+"right "+right);}
        }
        return -1;
}
}