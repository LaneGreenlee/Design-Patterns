package iterator;

import java.util.Iterator;

/**
 * Represents a list of tasks in a SCRUM board.
 * Each task list has a name and can contain multiple tickets.
 *
 * @author Laneag
 */
public class TaskList {
    private Ticket[] tickets;
    private int count;
    private String name;

    /**
     * Constructs a new task list with the given name.
     * Initializes the list with a maximum capacity of 100 tickets.
     *
     * @param name the name of the task list
     */
    public TaskList(String name) {
        this.count = 0;
        this.name = name;
        this.tickets = new Ticket[100];
    }

    /**
     * Adds a new ticket to the task list.
     *
     * @param name       the name of the ticket
     * @param teamMember the team member assigned to the ticket
     * @param difficulty the difficulty level of the ticket
     */
    public void addTicket(String name, String teamMember, int difficulty) {
        if (count == 100) {
            System.out.println("Too many tickets buddy");
        } else {
            tickets[count] = new Ticket(name, teamMember, difficulty);
            count++;
        }
    }

    /**
     * Adds an existing ticket to the task list.
     *
     * @param ticket the ticket to add
     */
    public void addTicket(Ticket ticket) {
        if (count == 100) {
            System.out.println("Too many tickets buddy");
        } else {
            tickets[count] = ticket;
            count++;
        }
    }

    /**
     * Retrieves and removes the ticket with the given name from the task list.
     *
     * @param name the name of the ticket to retrieve
     * @return the ticket with the given name, or null if not found
     */
    public Ticket getTicket(String name) {
        Ticket returnTicket = null;
        for (int i = 0; i < count; i++) {
            if (tickets[i] != null && tickets[i].getName().equalsIgnoreCase(name)) {
                returnTicket = tickets[i];
                // Shift the remaining elements in the array
                for (int j = i; j < count - 1; j++) {
                    tickets[j] = tickets[j + 1];
                }
                tickets[count - 1] = null; // Set the last element to null
                count--; // Decrease the count
                break;
            }
        }
        return returnTicket;
    }

    /**
     * Creates an iterator for iterating over the tickets in the task list.
     *
     * @return an iterator for the task list
     */
    public Iterator<Ticket> createIterator() {
        return new TaskListIterator(tickets);
    }

    /**
     * Returns a string representation of the task list.
     *
     * @return a string representation of the task list
     */
    public String toString() {
        Iterator<Ticket> iterator = createIterator();
        String returnString = name + ":\n";
        while (iterator.hasNext()) {
            Ticket ticket = iterator.next();
            returnString += ticket.toString() + "\n";
        }
        return returnString + "\n";
    }
}