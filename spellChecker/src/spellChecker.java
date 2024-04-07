import java.util.*;

public class spellChecker
{

    // create and initialize an alphabetically ordered String Array of animals
    String[] animals = {
            "Ladybug", "Bear", "Beetle", "Chameleon", "Cheetah",
            "Crab", "Crocodile", "Deer", "Dolphin", "Eagle",
            "Elephant", "Flamingo", "Fox", "Frog", "Giraffe",
            "Gorilla", "Hippo", "Hummingbird", "Kangaroo", "Koala",
            "Komodo Dragon", "Leopard", "Lion", "Lizard", "Lobster",
            "Millipede", "Monkey", "Octopus", "Owl", "Panda",
            "Parrot", "Penguin", "Peacock", "Pigeon", "Polar Bear",
            "Rhino", "Scorpion", "Shark", "Sloth", "Snake",
            "Spider", "Swan", "Tarantula", "Tiger", "Turtle",
            "Whale", "Wolf", "Zebra"
    };

    // pass the String Array into the ArrayList
    private ArrayList<String> dictionary = new ArrayList<String>(Arrays.asList(animals));


    /** This uses linear search to find a word
     * in the dictionary ArrayList and also
     * prints out the number of words checked.
     * If not found, word is misspelled.
     */
    public boolean linearSpellCheck(String word)
    {
        int count = 0;
        for(int i=0; i < dictionary.size(); i++)
        {
            count++;
            if (word.equalsIgnoreCase(dictionary.get(i))) {
                System.out.println("Number of words checked: " + count);
                return true;
            }
        }
        System.out.println("Number of words checked: " + count);
        return false;

    }

    /** This uses binary search to find a word
     * in the dictionary ArrayList.
     * If not found, word is misspelled.
     * ADD IN CODE TO COUNT and PRINT OUT THE NUMBER OF WORDS CHECKED!
     */
    public boolean binarySpellCheck(String word) {
        int left = 0;
        int right = dictionary.size() - 1;
        while (left <= right)
        {
            int middle = (left + right) / 2;
            if (word.compareToIgnoreCase(dictionary.get(middle)) < 0)
            {
                right = middle - 1;
            }
            else if (word.compareToIgnoreCase(dictionary.get(middle)) > 0)
            {
                left = middle + 1;
            }
            else {
                return true;
            }

        }
        return false;
    }



}
