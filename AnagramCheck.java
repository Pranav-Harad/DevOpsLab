import java.util.Arrays;

public class AnagramCheck {

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] a = s1.toLowerCase().toCharArray();
        char[] b = s2.toLowerCase().toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);
        System.out.println("Are they anagrams? " + isAnagram(s1, s2));

        System.out.println();

        s1 = "hello";
        s2 = "world";

        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);
        System.out.println("Are they anagrams? " + isAnagram(s1, s2));
    }
}
