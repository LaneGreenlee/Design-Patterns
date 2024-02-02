/**
 * The abstract base class representing the state of a spelling application.
 * Subclasses should implement specific behavior for increasing and decreasing grades.
 * @auth Laneag
 */
package state;

import java.util.ArrayList;
import java.util.Random;

public abstract class State {
    /**
     * The SpellingList associated with this state.
     */
    protected SpellingList spellingList;

    /**
     * The list of words managed by this state.
     */
    protected ArrayList<String> words;

    /**
     * A Random object for generating random indices when retrieving words.
     */
    private Random rand;

    /**
     * Constructs a new State with the specified SpellingList.
     *
     * @param spellingList The SpellingList associated with this state.
     */
    public State(SpellingList spellingList) {
        this.spellingList = spellingList;
        this.rand = new Random();
    }

    /**
     * Retrieves the next random word from the list of words.
     *
     * @return A randomly selected word from the list.
     */
    public String getNextWord() {
        int index = rand.nextInt(words.size());
        return words.get(index);
    }

    /**
     * Abstract method to increase the grade or level of the spelling state.
     * Subclasses must implement specific behavior.
     */
    public abstract void increaseGrade();

    /**
     * Abstract method to decrease the grade or level of the spelling state.
     * Subclasses must implement specific behavior.
     */
    public abstract void decreaseGrade();
}
