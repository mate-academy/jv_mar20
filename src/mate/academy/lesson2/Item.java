package mate.academy.lesson2;

public class Item {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = "ab" + "c";
        String s5 = concat("ab", "c").intern();
        System.out.println("1. s1 == s2 " + (s1 == s2));
        System.out.println("2. s1 == s3 " + (s1 == s3));
        System.out.println("3. s1 == s4 " + (s1 == s4));
        System.out.println("4. s2 == s3 " + (s2 == s3));
        System.out.println("5. s2 == s4 " + (s2 == s4));
        System.out.println("6. s3 == s4 " + (s3 == s4));
        System.out.println("7. s3 == s5 " + (s3 == s5));
        System.out.println("8. s1 == s5 " + (s1 == s5));
    }

    public static String concat(String s1, String s2) {
        return s1 + s2;
    }
}

