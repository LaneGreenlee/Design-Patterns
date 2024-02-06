import java.util.Random;
import java.util.ArrayList;
/**
 * Class used when a flashcard needs to be made
 * @auth Laneag
 */
public class FlashCards {
    private Random rand;
    private static FlashCards flashCards;
    private ArrayList<Word> words;
    private Word currentWord;

    /**
     * Constructs a flashcard and creates random object
     * and populates words ArrayList
     */
    private FlashCards(){
        words = FileReader.getWords();
        rand = new Random();
    }

    /**
     * Static method of getintance, only makes
     * one insatance of flashcards
     * @return FlashCards
     */
    public static FlashCards getInstance() {
        if( flashCards == null) 
            flashCards = new FlashCards();
        
        return flashCards;
    }
    /**
     * gets random word from arraylist using rand
     * @return the current word
     */
    public Word getWord() {
        currentWord = words.get(rand.nextInt(words.size()));
        return currentWord;
    }
    
}
