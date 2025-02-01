//QUESTION->
//Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is 
// the smallest in lexicographical order
// among all possible results.



// Example 1:

// Input: s = "bcabc"
// Output: "abc"
// Example 2:

// Input: s = "cbacdcbc"
// Output: "acdb"

//ANSWER-->
class Solution {
    public String removeDuplicateLetters(String s) {
        int n=s.length();

        Stack<Character> st=new Stack<>();

        boolean[] taken=new boolean[26];
        int [] lastindex=new int[26];

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            lastindex[ch-'a']=i;
        }

        for(int i=0;i<n;i++){
            int idx=s.charAt(i)-'a';

            if(taken[idx])continue;

            while(!st.isEmpty() && s.charAt(i)<st.peek() && lastindex[st.peek()-'a']>i){
                taken[st.pop()-'a']=false;
            }
            st.push(s.charAt(i));
            taken[idx]=true;
        }
        StringBuilder result=new StringBuilder();
        while(!st.isEmpty()){
            result.append(st.pop());
        }

return result.reverse().toString();    }
}

// Time-complexity = O(n)

// Space-complexity = O(n)
