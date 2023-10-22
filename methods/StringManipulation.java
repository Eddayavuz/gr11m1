public class StringManipulation {
  
    public static void main(String[] args) {
        String text = "Hello Class!";

        // 1. Convert the entire string to lowercase.
        String lowerCaseText = text.toLowerCase();

        // 2. Extract and print the character at the 4th index (0-based index).
        char fourthChar = text.charAt(4);
        System.out.println("Character at index 4: " + fourthChar);

        // 3. Check if the string starts with the word "Hello" (case-insensitive).
        boolean startsWithHello = lowerCaseText.startsWith("hello");

        // 4. Replace all occurrences of 'o' with 'x' in the string.
        String replacedText = text.replace('o', 'x');

        // 5. Determine the length of the string.
        int length = text.length();

        // 6. Check if the string ends with an exclamation mark.
        boolean endsWithExclamation = text.endsWith("!");

        // 7. Create a new string by removing the space at the beginning and end of the original string.
        String trimmedText = text.trim();

        // 8. Find the index of the first occurrence of 'l' in the string.
        int indexOfL = text.indexOf('l');

        // 9. Split the string into an array of words based on spaces.
        String[] words = text.split(" ");

        // 10. Concatenate the string with the phrase " Have a nice day." and print the result.
        String concatenatedText = text + " Have a nice day.";

        // Print the results
        System.out.println("1. Lowercase: " + lowerCaseText);
        System.out.println("3. Starts with 'Hello': " + startsWithHello);
        System.out.println("4. Replaced: " + replacedText);
        System.out.println("5. Length: " + length);
        System.out.println("6. Ends with '!': " + endsWithExclamation);
        System.out.println("7. Trimmed: " + trimmedText);
        System.out.println("8. Index of 'l': " + indexOfL);

    }
}
