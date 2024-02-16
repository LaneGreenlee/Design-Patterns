package iterator;

/**
 * Represents a task ticket in a SCRUM board.
 * Each ticket has a name, assigned team member, and difficulty level.
 *
 * @author Laneag
 */
public class Ticket {
    private String teamMember;
    private int difficulty;
    private String name;

    /**
     * Constructs a new ticket with the given name, assigned team member, and difficulty.
     *
     * @param name       the name of the ticket
     * @param teamMember the team member assigned to the ticket
     * @param difficulty the difficulty level of the ticket
     */
    public Ticket(String name, String teamMember, int difficulty) {
        this.name = name;
        this.teamMember = teamMember;
        this.difficulty = difficulty;
    }

    /**
     * Retrieves the name of the ticket.
     *
     * @return the name of the ticket
     */
    public String getName() {
        return name;
    }

    /**
     * Returns a string representation of the ticket in the format:
     * "- [name] ([difficulty]) - [teamMember]"
     *
     * @return a string representation of the ticket
     */
    public String toString() {
        return "- " + getName() + " (" + difficulty + ") - " + teamMember;
    }
}

