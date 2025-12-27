/*
Problem: Reverse String
Platform: LeetCode (344)
Description:
Given a character array s, reverse the array in-place.

Approach: Two Pointers
- Use one pointer at the start and one at the end
- Swap characters and move pointers inward

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class ReverseString {

        public static void reverseString(char[] s) {
        int i=0,j=s.length-1;
        while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
        
    }

    // Optional main method for testing
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);

        for (char c : s) {
            System.out.print(c + " ");
        }
    }
}
