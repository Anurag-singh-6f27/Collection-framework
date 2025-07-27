package string_s;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome ovj=new Palindrome();
        System.out.println(ovj.isPalindrome("race a car"));


    }
    public boolean isPalindrome(String s) {
        if(s==null || s.isEmpty()){
            return true;
        }
        StringBuilder str1 = new StringBuilder(s);
        String onlyLetters = str1.toString().replaceAll("[^a-zA-Z]", "");

        str1 = new StringBuilder(onlyLetters.toLowerCase());
        if(str1.toString().contentEquals(str1.reverse())) {
            return true;
        }
        return false;

    }
}
