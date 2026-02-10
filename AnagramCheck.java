public static void main(String[] args) {
    String s1 = "listen";
    String s2 = "silent";

    boolean result = isAnagram(s1, s2);
    System.out.println("String 1: " + s1);
    System.out.println("String 2: " + s2);
    System.out.println("Are they anagrams? " + result);

    System.out.println();

    s1 = "hello";
    s2 = "world";

    result = isAnagram(s1, s2);
    System.out.println("String 1: " + s1);
    System.out.println("String 2: " + s2);
    System.out.println("Are they anagrams? " + result);
}
