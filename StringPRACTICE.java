
public class StringPractice {
    public static void main(String[] args) {

        // Declaring two string variables
        String str1 = "Hello";
        String str2 = "World";

        // 1. length()
        System.out.println("Length of first string: " + str1.length());

        // 2. concat()
        System.out.println("Concatenation of strings: " + str1.concat(" " + str2));

        // 3. toUpperCase()
        System.out.println("Uppercase of first string: " + str1.toUpperCase());

        // 4. toLowerCase()
        System.out.println("Lowercase of second string: " + str2.toLowerCase());

        // 5. substring()
        System.out.println("Substring of first string (1 to 4): " + str1.substring(1, 4));

        // 6. equals()
        System.out.println("Are both strings equal? " + str1.equals(str2));

        // 7. equalsIgnoreCase()
        System.out.println("Are 'hello' and str1 equal (ignore case)? " + str1.equalsIgnoreCase("hello"));

        // 8. replace()
        System.out.println("Replacing 'l' with 'x' in str1: " + str1.replace('l', 'x'));

        // 9. charAt()
        System.out.println("Character at index 2 in str1: " + str1.charAt(2));
    }
}
