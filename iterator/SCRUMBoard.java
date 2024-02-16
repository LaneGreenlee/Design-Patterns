package iterator;

/**
 * Represents a SCRUM board containing task lists for To Do, Doing, and Done.
 * Each task list represents a stage in the SCRUM process.
 * @auth Laneag
 */
public class SCRUMBoard {
    private String projectName;
    private TaskList todo;
    private TaskList doing;
    private TaskList done;

    /**
     * Constructs a new SCRUM board with the given project name.
     *
     * @param projectName the name of the project
     */
    public SCRUMBoard(String projectName) {
        this.projectName = projectName;
        todo = new TaskList("ToDo");
        doing = new TaskList("Doing");
        done = new TaskList("Done");
    }

    /**
     * Adds a new ticket to the To Do list.
     *
     * @param name       the name of the ticket
     * @param teamMember the team member assigned to the ticket
     * @param difficulty the difficulty level of the ticket
     */
    public void addTicket(String name, String teamMember, int difficulty) {
        Ticket ticket = new Ticket(name, teamMember, difficulty);
        todo.addTicket(ticket);
    }

    /**
     * Moves a ticket from the To Do list to the Doing list.
     *
     * @param name the name of the ticket to start
     * @return true if the ticket is successfully moved, false otherwise
     */
    public boolean startTicket(String name) {
        Ticket ticket = todo.getTicket(name);
        if (ticket == null) {
            return false;
        } else {
            doing.addTicket(ticket);
            return true;
        }
    }

    /**
     * Moves a ticket from the Doing list to the Done list.
     *
     * @param name the name of the ticket to finish
     * @return true if the ticket is successfully moved, false otherwise
     */
    public boolean finishTicket(String name) {
        Ticket ticket = doing.getTicket(name);
        if (ticket == null) {
            return false;
        } else {
            done.addTicket(ticket);
            return true;
        }
    }

    /**
     * Returns a string representation of the SCRUM board, including all task lists.
     *
     * @return a string representation of the SCRUM board
     */
    public String toString() {
        String returnString = "***** " + projectName + " *****\n";
        returnString += todo.toString();
        returnString += doing.toString();
        returnString += done.toString();
        return returnString;
    }
}
