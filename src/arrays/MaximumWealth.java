package arrays;

import java.util.stream.IntStream;

public class MaximumWealth {

	class Solution {
	    public int maximumWealth(int[][] accounts) {
	        int maxWealth = IntStream.of(accounts[0]).sum();
	        
	        for(int i = 1; i < accounts.length; i++){
	            int currentWealth = IntStream.of(accounts[i]).sum();
	            if(maxWealth < currentWealth) maxWealth = currentWealth; 
	        }
	        
	        return maxWealth;
	    }
	}
}
