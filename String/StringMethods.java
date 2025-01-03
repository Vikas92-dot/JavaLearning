public class StringMethods {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s.length());  //Returns the length of the string
        System.out.println(s.charAt(1)); // Returns the character at the specified index.
        String s1 = "";
        System.out.println(s1.isEmpty()); // Checks if the string is empty
        String s2 = "  ";
        System.out.println(s2.isBlank()); // Checks if the string is empty or contains only white spaces

        String str1 = "Apple";
        String str2 = "Banana";
        String str3 = "Apple";

        System.out.println(str1.compareTo(str2)); // Negative because "Apple" < "Banana"
        System.out.println(str1.compareTo(str3)); // Zero because both are equal
        System.out.println(str2.compareTo(str1)); // Positive because "Banana" > "Apple"

        System.out.println("hello".toUpperCase()); //  HELLO
        System.out.println("HELLO".toLowerCase()); //  hello
        System.out.println("Hello".contains("ell")); //  true
        System.out.println("Hello".startsWith("He")); //  true
        System.out.println("Hello".endsWith("lo")); //  true
        System.out.println("hello".indexOf("l")); // Output: 2
        System.out.println("hello".lastIndexOf("l")); // Output: 3
        System.out.println("hello".substring(2)); // Output: llo  Returns the substring from the given index to the end.
        System.out.println("hello".substring(1, 4)); // Output: ell
        System.out.println("hello".replace('l', 'y')); // Output: heyyo
        System.out.println("hello".replaceAll("l", "y")); // Output: heyyo
        System.out.println("hello".replaceFirst("l", "y")); // Output: heylo
        String[] parts = "apple,banana,grape".split(",");
        String[] parts1 = "a:b:c:d".split(":", 2); // ["a", "b:c:d"]
        System.out.println(String.join("-", "apple", "banana", "grape")); // Output: apple-banana-grape
        System.out.println("  hello  ".trim()); // Output: "hello"
        System.out.println("  hello  ".strip()); // Output: "hello"
        System.out.println("  hello  ".stripLeading()); // Output: "hello  " Removes leading spaces
        System.out.println("  hello  ".stripTrailing()); // Output: "  hello"
        System.out.println(String.format("Hello, %s!", "John")); // Output: Hello, John!
        char[] chars = "hello".toCharArray();
        System.out.println("hello".equals("Hello")); // Output: false
        System.out.println("hello".equalsIgnoreCase("Hello")); // Output: true

        //================================================================

        //Matches method 
        //The matches() method in Java is used to check whether a string matches a given regular expression (regex) pattern. It returns true if the string completely matches the regex, otherwise, it returns false.

        //1.Checking for Digits 

        String str = "12345";
        
        
        boolean result = str.matches("\\d+"); // Check if string contains only digits 
        //\\d+ → Matches one or more digits (0-9).
        System.out.println(result); // true

        //2.Checking for Alphabets Only

        String strii = "Java";
        
        // Check if the string contains only letters (no numbers or spaces)
        boolean result1 = strii.matches("[a-zA-Z]+");

        System.out.println(result1); // true

        //3.Validating an Email

        String email = "test@example.com";
        
        // Simple regex for email validation
        boolean isValid = email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

        System.out.println(isValid); // true

        //4.Validating a Phone Number

        String phone = "9876543210";
        
        // Check if it is a valid 10-digit phone number
        boolean isValids = phone.matches("\\d{10}");

        System.out.println(isValids); // true

        //5.Checking if a String Starts with "Hello"

        String strn = "Hello, World!";
        
        boolean startsWithHello = strn.matches("^Hello.*");

        System.out.println(startsWithHello); // true

        //6.Checking if a String Contains Only Whitespace

        String stra = "   ";
        
        boolean isWhitespace = stra.matches("\\s*");

        System.out.println(isWhitespace); // true

        //================================================================


        System.out.println("hi".repeat(3)); // Output: hihihi

        //In Java, the intern() method is used with strings to ensure that a string is stored in the String Pool instead of creating a new object in the heap memory.

        String ss1 = new String("Hello");  // Creates a new object in heap
        String ss2 = ss1.intern();          // Moves "Hello" to the string pool

        String s3 = "Hello";  // Already present in the pool

        System.out.println(ss1 == ss2);  // false (s1 is in heap, s2 is in pool)
        System.out.println(ss2 == s3);  // true (both refer to the same pool instance)


        System.out.println("A".codePointAt(0)); // Output: 65

        System.out.println("AB".codePointBefore(1)); // Output: 65

        System.out.println(String.valueOf(100)); // Output: "100"

        //hashCode()  Returns the hash code of the string.

        //regionMatches(...) – Compares regions of two strings.

        //subSequence(int start, int end) – Returns a CharSequence.

        //concat(String str) – Concatenates two strings.





















    }
}
