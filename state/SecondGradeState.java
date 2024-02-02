/**
 * Represents the second-grade state of a spelling application.
 * Manages a list of words for the second-grade level and provides methods to transition to other grades.
 * @auth Laneag
 */
package state;

public class SecondGradeState extends State {

    /**
     * Constructs a new SecondGradeState with the specified SpellingList.
     * Initializes the word list with words from the second-grade level.
     *
     * @param spellingList The SpellingList associated with this state.
     */
    public SecondGradeState(SpellingList spellingList) {
        super(spellingList);
        this.words = FileReader.getWords("state/second.txt");
    }

    /**
     * Increases the grade or level of the spelling state to third grade.
     * Updates the current state in the associated SpellingList and prints a transition message.
     */
    public void increaseGrade() {
        spellingList.setState(spellingList.getThirdGradeState());
        System.out.println("Moving up to the third grade...");
    }

    /**
     * Decreases the grade or level of the spelling state to first grade.
     * Updates the current state in the associated SpellingList and prints a transition message.
     */
    public void decreaseGrade() {
        spellingList.setState(spellingList.getFirstGradeState());
        System.out.println("Moving down to the first grade...");
    }
}
