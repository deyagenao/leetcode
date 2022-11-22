# LeetCode Problems 
### About 
This repository is a collection of my solutions for LeetCode Problems. I am using this help track my completion of problems as well as my progression with problem solving and better understanding data structures and algorithms. I share my original solutions to the problems, and then search discussion boards for alternative and more efficient solutions. 

### Solutions Tracker 
11-19-2022: 
- [153. Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/)
	+ First medium problem! Not the most efficient solution, but solved within 20 minutes. Tried to use recursive binary search to find the inflection point/ minimum value in the array. Unfortunately, stuck on this issue: could not isolate the search to one half of the array at each step because while the array is sorted, it could also be rotated.   
	+ Leetcode solution suggests checking if the array is actually rotated first. If rotated, to actually limit the search to one half of the array (as binary search is supposed to do), can check if the current midpoint is greater than/ less than the first array element. 

11-18-2022:
- [1572. Matrix Diagonal Sum](https://leetcode.com/problems/matrix-diagonal-sum/) 
	+ Used two for loops (linear time) to calculate the primary diagonal sum, and then the secondary diagonal sum. Considering using another solution with two pointers? This way, we only have to iterate over the array once? 

11-15-2022:
- [383. Ransom Note](https://leetcode.com/problems/ransom-note/) 
	+ Created a hashmap with the characters from the magazine string. Then iterated over the characters from the ransom note to see if there were enough of each char available. 
	+ Alternative solution: creating an array with 26 positions to represent alphabet. Using each position to hold a count of the number of that specific letter in the string. The position is calculated using the ASCII value of the letter.  
- [13. Roman to Integer](https://leetcode.com/problems/roman-to-integer/)
	+ Created a hashmap to store the value of the possible Roman digits. Then iterated over the Roman numeral from the end, checking if there was a digit preceding the current one that could be of lesser value. If yes, then the value was calculated differently (IV -> 4). If no, then the value was added to a total integer value. Multiple if statements could probably be simplified. 
	+ Alternative to checking if at index 0 to avoid IndexOutOfBoundsException is starting from the second to last position and checking i and i+1 (my solution included i and i-1) 


11-14-2022: 
- [1342. Number of Steps to Reduce a Number to Zero](https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/)
	+ While loop/ Iterative solution. 
	+ Interesting one line solutions by converting the integer to a binary number - need to research more.
	+ Bitwise approach uses bitwise operators and bitmasks. For halving steps, shifting the binary number to the right. For subtracting 1 steps, comparing the binary number to a bitmask of 00000001. In code, can simply use "num & 1" because the bitwise operator looks at the binary representation of the numbers.  
- [876. Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/)
	+ Solved with 2 loops - first loops to count number of nodes, second to iterate to the middle node (once that middle position was determined). 
	+ From discussion board: Can use a two pointer solution, specifically slow (moves one Node at a time) and fast (moves 2 Nodes at a time) pointer. Logic is that when the fast pointer reaches the end of the linked list, the slow pointer will be at the middle. 
	+ Video solution also suggests copy node values to an ArrayList, but this affects the space complexity (O(n)) and defeats the purpose of using the Linked List data structure

11-03-2022:
- [1480. Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/)
	+ Solved with values in place/ overwritten input. Apparently a new output array does not affect the Big O space complexity.  
	+ Discussion insights: Check for array length isn't necessary since we won't enter the for loop if length is greater than 1. Can also use incrementing operator instead (+=) 
- [1672. Richest Customer Wealth](https://leetcode.com/problems/richest-customer-wealth/submissions/)
	+ Attempted to use streams to solve (use built in sum terminal operation). However, solution is slow and uses a lot of memory. Instead can set maxWealth = 0 first, then use streams in an enhanced for loop. Also use Math.max instead of if statement 
- [412. Fizz Buzz](https://leetcode.com/problems/fizz-buzz/)
	+ Started with an array and a for loop, but since we are returning a list, thought to use while loop to make it 1-indexed. Could start for loop with i = 1 instead. Other approaches avoid % and use different variables to track if the current value is a multiple of 3 or 5. 	

11-02-2022: 
 - [226. Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/) 
	+ Recursive Solution. 
	+ Discussion board suggests this is DFS (Depth-first search), an algorithm for traversing or searching tree/ graph data structures.  But that a BFS (Breadth-first search) solution is more scalable. 
	+ BFS: algorithm for searching a tree data structure. Starts at tree root and explores all nodes at present depth prior to moving on to the nodes at next depth level. 


 
### Credits 


