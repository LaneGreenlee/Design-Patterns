import java.util.Random;
import java.util.ArrayList;
public class FlashCards {
    private Random rand;
    private FlashCards flashCards;
    private ArrayList<Word> words;
    private Word currentWord;

    private FlashCards(){}

    public FlashCards getInstance() {
        if( flashCards == null) 
            flashCards = new FlashCards();
        
        return flashCards;
    }
    public Word getWord() {
        return currentWord;
    }
    
}
