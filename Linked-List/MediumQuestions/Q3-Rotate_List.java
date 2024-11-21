//QUESTION->
//Given the head of a linked list, rotate the list to the right by k places.

// Example 1:


// Input: head = [1,2,3,4,5], k = 2
// Output: [4,5,1,2,3]
// Example 2:


// Input: head = [0,1,2], k = 4
// Output: [2,0,1]

//ANSWER-->
class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        //Edge case 
        if(head==null || head.next==null|| k==0){
            return head;
        }

        //decleare node and length to store length and tail of list
        int length=1;
        ListNode temp=head;

        //finding length of the list
        while(temp.next!=null){
            temp=temp.next;
            length++;
        }

        //From a circular linked list  
        temp.next=head;

        //calculate effective rotations needed
        k=k%length;
        int upto =length-k;

        //move to the node just before the new head
        temp=head;
        for(int i=1;i<upto;i++){
            temp=temp.next;
        }

        //set the next head and break the cycle
        ListNode newhead=temp.next;
        temp.next=null;
        return newhead;

    }
}