//QUESTION-->
//Given the head of a singly linked list, return true if it is a 
// palindrome
// or false otherwise.



// Example 1:


// Input: head = [1,2,2,1]
// Output: true
// Example 2:


// Input: head = [1,2]
// Output: false

//ANSWER-->
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list=new ArrayList();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }

        int right=list.size()-1;
        int left=0;
        while(left<right && list.get(left) == list.get(right)){
            left++;
            right--;
        }
        return left>=right;
    }
}

// Time complexity: O(N)
// Space complexity: O(N)