import java.util.*;
public class StringPolindrome {
    public static void main(String[] args) {
        Scanner hp = new Scanner(System.in);
        String value = hp.nextLine();
        if (isPalindrome(value)) {
            System.out.println("The string \""+value + "\" is a palindrome.");
        } else {
            System.out.println("The string \""+value + "\" is not a palindrome.");
            hp.close();
        }
    }

    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }
}
