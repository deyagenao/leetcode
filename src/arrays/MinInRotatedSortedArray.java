package arrays;

import java.util.Arrays;

public class MinInRotatedSortedArray {
	public int findMin(int[] nums) {
        if(nums.length == 1) return nums[0];
        
        int midIndex = nums.length/2;
        if(nums[midIndex] < nums[midIndex - 1]){
            return nums[midIndex]; 
        } else{ 
            return Math.min(findMin(Arrays.copyOfRange(nums, 0, midIndex)), 
                            findMin(Arrays.copyOfRange(nums, midIndex, nums.length)));
        }
        
    }
}
