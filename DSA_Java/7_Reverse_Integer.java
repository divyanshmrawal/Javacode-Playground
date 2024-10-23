//QUESTION-->
//Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

//ANSWER-->
// My Code -->
class Solution {
    public int reverse(int x) {
        int result=0;
        while(x!=0){
            int temp=x%10;
        
        result=result *10+temp;
        x=x/10;
        }
    return result;
    }
}

//Helping Code-->
class Solution {
    public:
        int reverse(int x) {
            int ans = 0; // Initialize the reversed number to 0
            while (x != 0) {
                int digit = x % 10; // Get the last digit of x
                
                // Check for overflow/underflow before updating ans
                if ((ans > INT_MAX / 10) || (ans < INT_MIN / 10)) {
                    return 0; // Return 0 if reversing x would cause overflow/underflow
                }
                
                ans = ans * 10 + digit; // Append the digit to the reversed number
                x = x / 10; // Remove the last digit from x
            }
            return ans; // Return the reversed number
        }
    };