public class StringManipulator {
    public static void main(String[] args) {
        SentenceManipulator manipulator = new SentenceManipulator("this is a test sentence.");

        System.out.println("Capitalized Words: " + manipulator.capitalizeWords());
        System.out.println("Sentence Without Spaces: " + manipulator.removeSpaces());
        System.out.println("Reversed Sentence: " + manipulator.reverseSentence());
    }
}
class SentenceManipulator {
    private StringBuilder sentenceBuilder;

    public SentenceManipulator(String sentence) {
        this.sentenceBuilder = new StringBuilder(sentence);
    }

    public String reverseSentence() {
        return sentenceBuilder.reverse().toString();
    }

    public String capitalizeWords() {
        // set the first character to uppercase.
        if (!sentenceBuilder.isEmpty()) {
            sentenceBuilder.setCharAt(0, Character.toUpperCase(sentenceBuilder.charAt(0)));
        }

        for (int i = 1; i < sentenceBuilder.length(); i++) {
            if (sentenceBuilder.charAt(i-1) == ' ') {
                sentenceBuilder.setCharAt(i, Character.toUpperCase(sentenceBuilder.charAt(i)));
            }
        }
        return sentenceBuilder.toString();
    }

    public String removeSpaces() {
        for (int i = 0; i < sentenceBuilder.length(); i++) {
            if (sentenceBuilder.charAt(i) == ' ') {
                sentenceBuilder.deleteCharAt(i--);
            }
        }
        return sentenceBuilder.toString();
    }
}
