/**
 * Represents a spelling list with different grade states.
 * Manages the current state and provides methods to interact with the current state.
 * @auth Laneag
 */
package state;

public class SpellingList {
    /**
     * The current state of the spelling list.
     */
    private State state;

    /**
     * The FirstGradeState associated with this spelling list.
     */
    private FirstGradeState firstGradeState;

    /**
     * The SecondGradeState associated with this spelling list.
     */
    private SecondGradeState secondGradeState;

    /**
     * The ThirdGradeState associated with this spelling list.
     */
    private ThirdGradeState thirdGradeState;

    /**
     * Constructs a new SpellingList with default settings.
     * Initializes the grade states and sets the initial state to FirstGradeState.
     */
    public SpellingList() {
        this.firstGradeState = new FirstGradeState(this);
        this.secondGradeState = new SecondGradeState(this);
        this.thirdGradeState = new ThirdGradeState(this);
        this.state = firstGradeState;
    }

    /**
     * Retrieves the next word from the current state.
     *
     * @return The next word from the current grade state.
     */
    public String getNextWord() {
        return state.getNextWord();
    }

    /**
     * Increases the grade or level of the spelling list.
     * Delegates the operation to the current state.
     */
    public void increaseGrade() {
        state.increaseGrade();
    }

    /**
     * Decreases the grade or level of the spelling list.
     * Delegates the operation to the current state.
     */
    public void decreaseGrade() {
        state.decreaseGrade();
    }

    /**
     * Retrieves the FirstGradeState associated with this spelling list.
     *
     * @return The FirstGradeState instance.
     */
    public State getFirstGradeState() {
        return this.firstGradeState;
    }

    /**
     * Retrieves the SecondGradeState associated with this spelling list.
     *
     * @return The SecondGradeState instance.
     */
    public State getSecondGradeState() {
        return this.secondGradeState;
    }

    /**
     * Retrieves the ThirdGradeState associated with this spelling list.
     *
     * @return The ThirdGradeState instance.
     */
    public State getThirdGradeState() {
        return this.thirdGradeState;
    }

    /**
     * Sets the current state of the spelling list.
     *
     * @param state The new state to be set.
     */
    public void setState(State state) {
        this.state = state;
    }
}
