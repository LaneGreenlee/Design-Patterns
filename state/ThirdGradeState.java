/**
 * Represents the third-grade state of a spelling application.
 * Manages a list of words for the third-grade level and provides methods to transition to other grades.
 * @auth Laneag
 */
package state;

public class ThirdGradeState extends State {

    /**
     * Constructs a new ThirdGradeState with the specified SpellingList.
     * Initializes the word list with words from the third-grade level.
     *
     * @param spellingList The SpellingList associated with this state.
     */
    public ThirdGradeState(SpellingList spellingList) {
        super(spellingList);
        this.words = FileReader.getWords("state/third.txt");
    }

    /**
     * Increases the grade or level of the spelling state.
     * In the third-grade state, increasing is not allowed, and a message is printed.
     */
    public void increaseGrade() {
        System.out.println("You can't go past the third grade!");
    }

    /**
     * Decreases the grade or level of the spelling state to second grade.
     * Updates the current state in the associated SpellingList and prints a transition message.
     */
    public void decreaseGrade() {
        spellingList.setState(spellingList.getSecondGradeState());
        System.out.println("Moving down to the second grade...");
    }
}

