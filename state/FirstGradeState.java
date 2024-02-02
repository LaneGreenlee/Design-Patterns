/**
 * Represents the first-grade state of a spelling application.
 * Manages a list of words for first-grade level and provides methods to transition to other grades.
 * @auth Laneag
 */
package state;

public class FirstGradeState extends State {

    /**
     * Constructs a new FirstGradeState with the specified SpellingList.
     * Initializes the word list with words from the first-grade level.
     *
     * @param spellingList The SpellingList associated with this state.
     */
    public FirstGradeState(SpellingList spellingList) {
        super(spellingList);
        this.words = FileReader.getWords("state/first.txt");
    }

    /**
     * Increases the grade or level of the spelling state to second grade.
     * Updates the current state in the associated SpellingList and prints a transition message.
     */
    public void increaseGrade() {
        this.spellingList.setState(spellingList.getSecondGradeState());
        System.out.println("Moving to the second grade...");
    }

    /**
     * Decreases the grade or level of the spelling state.
     * In the first-grade state, decreasing is not allowed, and a message is printed.
     */
    public void decreaseGrade() {
        System.out.println("You can't go below first grade....");
    }
}

