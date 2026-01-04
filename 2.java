// Demonstration of String and StringBuffer Operations
class StringOperationsDemo {

    public static void main(String[] args) {
        
        // ---------- Using String class ----------
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("String Operations:");
        System.out.println("Concatenation: " + str1.concat(" " + str2)); // Concatenation
        System.out.println("Length of str1: " + str1.length());          // Length
        System.out.println("Character at index 1 in str1: " + str1.charAt(1)); // Character extraction
        System.out.println("Substring of str2 (0,3): " + str2.substring(0, 3)); // Substring
        System.out.println("Uppercase str1: " + str1.toUpperCase());     // Uppercase
        System.out.println("Lowercase str2: " + str2.toLowerCase());     // Lowercase
        System.out.println("Check if str1 equals str2: " + str1.equals(str2)); // Comparison

        // ---------- Using StringBuffer class ----------
        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("\nStringBuffer Operations:");
        sb.append(" World");                 // Append
        System.out.println("After append: " + sb);

        sb.insert(6, "Java ");               // Insert
        System.out.println("After insert: " + sb);

        sb.replace(6, 10, "C++");            // Replace
        System.out.println("After replace: " + sb);

        sb.delete(6, 10);                    // Delete
        System.out.println("After delete: " + sb);

        sb.reverse();                        // Reverse
        System.out.println("After reverse: " + sb);
    }
}
