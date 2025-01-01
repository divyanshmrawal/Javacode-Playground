//QUESTION-->
//You are given a string s. Simulate events at each second i:

// If s[i] == 'E', a person enters the waiting room and takes one of the chairs in it.
// If s[i] == 'L', a person leaves the waiting room, freeing up a chair.
// Return the minimum number of chairs needed so that a chair is available for every person who enters the waiting room given that it is initially empty.

 

// Example 1:

// Input: s = "EEEEEEE"

// Output: 7

// Explanation:

// After each second, a person enters the waiting room and no person leaves it. Therefore, a minimum of 7 chairs is needed.

// Example 2:

// Input: s = "ELELEEL"

// Output: 2

// Explanation:

// Let's consider that there are 2 chairs in the waiting room. The table below shows the state of the waiting room at each second.

//ANSWER-->
class Solution {
    public int minimumChairs(String s) {
        char[] arr=s.toCharArray();

        int curr=0,max=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]=='E'){curr++;}
            if(curr>max){max=curr;}
            if(arr[i]=='L'){curr--;}
        }
        return max;
    }
}

//Time complexity:O(n)
//Space complexity:O(1)


