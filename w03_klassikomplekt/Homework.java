import java.util.HashSet;

public class Homework {
    //**1) Ette antud stringist vaja üles lugeda kõikide tähtede esinemine*/

    String word;
    HashSet<Character> characters;
    public Homework(String word) {
        this.word = word;
        characters = new HashSet<>();
        makeSet();
    }

    public void getCharOccurences() {
        if (characters.size() != 0) {
            for (Character character : characters) {
                int occ = findCharOccurences(character);
                System.out.println("The symbol (" + character + ") occured " + occ + " times!");
            }
        } else {
            System.out.println("There are no symbols in this string!");
        }

    }

    private int findCharOccurences(char c) {
        int count = 0;
    
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
    
    private void makeSet() {
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            characters.add(c);
            
        }

    }


}
