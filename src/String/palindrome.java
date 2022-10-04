package String;
import java.util.*;
public class palindrome {
    static boolean isPalindrome(String s) {
        int i =0, j = s.length()-1;
        while(i<j) {
            while(i<s.length() && !isAlphaNumeric(s.charAt(i)))
                i++;
            while(j>=0 && !isAlphaNumeric(s.charAt(j)))
                j--;
            if (j>i && !compare(s.charAt(i), s.charAt(j))) {
                return false;
            }
            i++;j--;
        }
        return true;
    }
    static boolean compare(char a, char b) {
        if (Character.isUpperCase(a)) {
            a = (char)(a + 32);
        }
        if (Character.isUpperCase(b)) {
            b = (char)(b +32);
        }
        return a == b;
    }

    static boolean isAlphaNumeric(char c) {
        if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' ||
                c>= '0' && c <='9') {
            return true;
        }
        return false;
    }
    public static void main(String [] args){
        String s="A man,a plan,a canal:panama";
        String a="Ayesha Noor Butt";
        Boolean i=isPalindrome(a);
        System.out.println(i);
    }
}

