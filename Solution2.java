 /*Given an integer x, return true if x is a palindrome , and false otherwise.
        Example 2:

        Input: x = 121
        Output: true
        Explanation: 121 reads as 121 from left to right and from right to left.*/
public class Solution2 {
     static boolean Palindrome(int x) {

         String s = String.valueOf(x); // converting x valu to string
         int n = s.length(); // To know the length of the string s
         for (int i = 0; n / 2 < 0; i++) {
             // checking the elements are same distance from start to end
             // if its not same return false

             if (s.charAt(i) != s.charAt(n - i - 1)) {
                 return true;
             }

         }
         return false;
     }

     public static void main (String[] args)
     {
     System.out.println(" the given x is a palindrome");
         Palindrome(121);

     }
 }



