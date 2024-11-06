//QUESTION-->
//Given a string s which represents an expression, evaluate this expression and return its value. 

// The integer division should truncate toward zero.

// You may assume that the given expression is always valid. All intermediate results will be in the range of [-231, 231 - 1].

// Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().

 

// Example 1:

// Input: s = "3+2*2"
// Output: 7
// Example 2:

// Input: s = " 3/2 "
// Output: 1
// Example 3:

// Input: s = " 3+5 / 2 "
// Output: 5

//ANSWER-->
class Solution {
    public int calculate(String s) {
        int n=s.length();
        
        int currentnum=0;
        int prevop='+';
        Stack<Integer> stack=new Stack<Integer>();

        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                currentnum=currentnum*10+(c-'0');
            }

            if(c!=' ' && !Character.isDigit(c) || i==n-1){
                if(prevop=='+'){
                    stack.push(currentnum);
                }

                else if(prevop=='-'){
                    stack.push(-currentnum);
                }

                else if(prevop=='/'){
                    int x=stack.peek();
                    stack.pop();
                    stack.push(x/currentnum);
                }

                else if(prevop=='*'){
                    int x=stack.peek();
                    stack.pop();
                    stack.push(x*currentnum);
                }

                currentnum=0;
                prevop=c;
            }
        }
int result=0;
        while(!stack.isEmpty()){
result+=stack.peek();
stack.pop();
        }
return result;
    }
}

// Time Complexity: O(n), where n is the length of the input string.
// Space Complexity: O(n), due to the space used by the stack.