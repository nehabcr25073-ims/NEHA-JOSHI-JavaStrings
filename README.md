
public class Main{

    static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";

        // length()
        System.out.println("Length of str1: " + str1.length());

        // concat()
        System.out.println("Concatenation: " + str1.concat(str2));

        // toUpperCase()
        System.out.println("Uppercase: " + str1.toUpperCase());

        // substring()
        System.out.println("Substring of str1: " + str1.substring(1, 4));

        //equals()
        System.out.println("Are strings equal? " + str1.equals(str2));

        //replace()
        System.out.println("Replace l with x: " + str1.replace('l', 'x'));

        //charAt()
        System.out.println("Character at index 2: " + str1.charAt(2));
    }
}
