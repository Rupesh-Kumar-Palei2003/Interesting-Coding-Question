package AccentureCodingProblem;
/*
The function takes a string str as input. Your task is to implement the function to find and return the minimum characters required to append at the end of the string str to make it a palindrome.

Note: If string is already palindrome return “NULL”.

Constraints

String will contain only lower case English alphabets.
Length of string is greater than or equal to 1

Sample Input : abcdc
Sample Output : ba
Explanation :

If we append ‘ba’ at the end of the string ‘abcdc’ it becomes abcdcba i.e. a palindrome.

Sample Input : xyzy
Sample Output : x
 */
public class MakePalindrome {
    public static String ConvertPalindrome(String str1) {
        StringBuilder result = new StringBuilder();
        if(isPalindrome(str1)){
            return "NULL";
        }
        int start =0, end = str1.length()-1;
        while(start < end){
            if(str1.charAt(start) != str1.charAt(end)){
                result.append(str1.charAt(start));
                start++;
            }
            else{
                start++;
                end--;
            }
        }
        return result.reverse().toString();
    }
    public static boolean isPalindrome(String str){
        int start =0, end = str.length()-1;
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start ++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(ConvertPalindrome("xyzy"));
        System.out.println(ConvertPalindrome("abcdc"));
        System.out.println(ConvertPalindrome("x"));
        System.out.println(ConvertPalindrome("abc"));
        System.out.println(ConvertPalindrome("ab"));
    }
}
